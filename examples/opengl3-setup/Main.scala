import scalanative.native._

import sdl2.SDL._
import sdl2.Extras._
import sdl2.image.SDL_image._
import sdl2.image.Extras._
import gl.GL._
import gl.Extras._

// Based on tutorial: http://www.opengl-tutorial.org/beginners-tutorials/tutorial-2-the-first-triangle/
object Main {

  def main(args: Array[String]): Unit = {

    SDL_Init(SDL_INIT_VIDEO)

    SDL_GL_SetAttribute(SDL_GL_CONTEXT_MAJOR_VERSION, 3)
    SDL_GL_SetAttribute(SDL_GL_CONTEXT_MINOR_VERSION, 2)

    SDL_GL_SetAttribute(SDL_GL_DOUBLEBUFFER, 1)
    SDL_GL_SetAttribute(SDL_GL_DEPTH_SIZE, 24)

    val window = SDL_CreateWindow(
        c"OpenGL window", SDL_WINDOWPOS_UNDEFINED, SDL_WINDOWPOS_UNDEFINED, 500, 500, SDL_WINDOW_OPENGL | SDL_WINDOW_SHOWN)

    if (window == null) {
        println("Could not create window: " + fromCString(SDL_GetError()))
        return;
    }

    val glContext = SDL_GL_CreateContext(window)
    if (glContext == null) {
        println("Could not create OpenGL context: " + fromCString(SDL_GetError()))
        return;
    }

    println("OpenGL version: " + fromCString(glGetString(GL_VERSION).asInstanceOf[Ptr[Byte]]))

    val programID = loadShaders(
"""#version 330 core
layout(location = 0) in vec3 vertexPosition_modelspace;

void main(){
  gl_Position.xyz = vertexPosition_modelspace;
  gl_Position.w = 1.0;
}
""",
"""
#version 330 core
out vec3 color;
void main(){
    color = vec3(1,0,0);
}
"""
)

    glClearColor(0f, 0f, 0.4f, 0f)

    SDL_GL_SetSwapInterval(1)

    val vertexArrayID: Ptr[GLuint] = stackalloc[GLuint]
    glGenVertexArrays(1.toUInt, vertexArrayID)
    glBindVertexArray(!vertexArrayID)

    //static const GLfloat g_vertex_buffer_data[] = {
    val gVertexBufferData: Ptr[Float] = stdlib.malloc(9*4).asInstanceOf[Ptr[Float]]
    gVertexBufferData(0) = -1f
    gVertexBufferData(1) = -1f
    gVertexBufferData(2) =  0f
    gVertexBufferData(3) =  1f
    gVertexBufferData(4) = -1f
    gVertexBufferData(5) =  0f
    gVertexBufferData(6) =  0f
    gVertexBufferData(7) =  1f
    gVertexBufferData(8) =  0f
    
    val vertexbuffer: Ptr[GLuint] = stackalloc[GLuint] 
    glGenBuffers(1.toUInt, vertexbuffer)
    glBindBuffer(GL_ARRAY_BUFFER, !vertexbuffer);
    glBufferData(GL_ARRAY_BUFFER, 9*4, gVertexBufferData.asInstanceOf[Ptr[Byte]], GL_STATIC_DRAW);

    var running = true
    val event: Ptr[SDL_Event] = stackalloc[SDL_Event]

    while(running) {

      while(SDL_PollEvent(event) != 0) {
        event.type_ match {
          case SDL_QUIT =>
            running = false
          case _ =>
            ()
        }
      }

      glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)

      glUseProgram(programID)

      glEnableVertexAttribArray(0.toUInt)
      glBindBuffer(GL_ARRAY_BUFFER, !vertexbuffer)
      glVertexAttribPointer(
          0.toUInt,
          3,
          GL_FLOAT,
          GL_FALSE,
          0.toUInt,
          null
      )
      glDrawArrays(GL_TRIANGLES, 0, 3.toUInt)
      glDisableVertexAttribArray(0.toUInt)

      SDL_GL_SwapWindow(window)

      SDL_Delay((1000/30).toUInt)
    }

    SDL_DestroyWindow(window);
    SDL_Quit();
  }

  def loadShaders(vertexShaderCode: String, fragmentShaderCode: String): GLuint = {
    Zone { implicit zone =>
      val vertexShaderID: GLuint = glCreateShader(GL_VERTEX_SHADER)
      val fragmentShaderID: GLuint = glCreateShader(GL_FRAGMENT_SHADER)

      // For checking compilation and linking.
      val result = stackalloc[GLint]
      val infoLogLength = stackalloc[CInt]

      println("Compiling vertex shader")
      val vertexShaderCodePointer = stackalloc[Ptr[Byte]]
      !vertexShaderCodePointer = toCString(vertexShaderCode)
      glShaderSource(vertexShaderID, 1.toUInt, vertexShaderCodePointer, null)
      glCompileShader(vertexShaderID)

      glGetShaderiv(vertexShaderID, GL_COMPILE_STATUS, result)
      println("Compiling result: " + !result)
      glGetShaderiv(vertexShaderID, GL_INFO_LOG_LENGTH, infoLogLength)
      if(!infoLogLength > 0) {
        val errorMsg = stdlib.malloc(!infoLogLength + 1).asInstanceOf[Ptr[Byte]]
        glGetShaderInfoLog(vertexShaderID, (!infoLogLength).toUInt, null, errorMsg)
        println(fromCString(errorMsg))
      }

      println("Compiling fragment shader")
      val fragmentShaderCodePointer = stackalloc[Ptr[Byte]]
      !fragmentShaderCodePointer = toCString(fragmentShaderCode)
      glShaderSource(fragmentShaderID, 1.toUInt, fragmentShaderCodePointer, null)
      glCompileShader(fragmentShaderID)
      
      glGetShaderiv(fragmentShaderID, GL_COMPILE_STATUS, result)
      println("Compiling result: " + !result)
      glGetShaderiv(fragmentShaderID, GL_INFO_LOG_LENGTH, infoLogLength)
      if(!infoLogLength > 0) {
        val errorMsg = stdlib.malloc(!infoLogLength + 1).asInstanceOf[Ptr[Byte]]
        glGetShaderInfoLog(fragmentShaderID, (!infoLogLength).toUInt, null, errorMsg)
        println(fromCString(errorMsg))
      }

      println("Linking program")
      val programID = glCreateProgram()
      glAttachShader(programID, vertexShaderID)
      glAttachShader(programID, fragmentShaderID)
      glLinkProgram(programID)

      glGetProgramiv(programID, GL_LINK_STATUS, result)
      println("Linking result: " + !result)
      glGetProgramiv(programID, GL_INFO_LOG_LENGTH, infoLogLength)
      if(!infoLogLength > 0) {
        println("Problem with linking program")
      }

      glDetachShader(programID, vertexShaderID)
      glDetachShader(programID, fragmentShaderID)

      glDeleteShader(vertexShaderID)
      glDeleteShader(fragmentShaderID)

      return programID
    }
  }

}

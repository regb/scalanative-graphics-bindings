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

    stdio.printf(glGetString(GL_VERSION).asInstanceOf[Ptr[Byte]])
    stdio.printf(c"\n")


    SDL_GL_SetSwapInterval(1)

    val VertexArrayID: Ptr[GLuint] = stackalloc[GLuint]
    glGenVertexArrays(1.toUInt, VertexArrayID)
    glBindVertexArray(!VertexArrayID)

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

    //glMatrixMode(GL_PROJECTION)
    //glLoadIdentity()
    //glOrtho(-1f, 1f, -1f, 1f, -1f, 1f)

    //glMatrixMode(GL_MODELVIEW)
    //glLoadIdentity()
    //glPushMatrix()

    var x = 0f; var y = 0f

    var running = true
    val event: Ptr[SDL_Event] = stackalloc[SDL_Event]

    while(running) {

      while(SDL_PollEvent(event) != 0) {
        event.type_ match {
          case SDL_QUIT =>
            running = false
          case SDL_KEYDOWN =>
            if(event.key.keysym.sym == SDLK_LEFT)
              x -= 10f
            else if(event.key.keysym.sym == SDLK_RIGHT)
              x += 10f
            else if(event.key.keysym.sym == SDLK_UP)
              y -= 10f
            else if(event.key.keysym.sym == SDLK_DOWN)
              y += 10f
          case _ =>
            ()
        }
      }

      //glPopMatrix()
      //glPushMatrix()
      //glTranslatef(x, y, 0f)

      glClearColor(0f, 0f, 0f, 1f)
      glClear(GL_COLOR_BUFFER_BIT)

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

      //glColor3f(1f,1f,1f)
      //glBegin(GL_QUADS)
      //  glColor3f(1f, 0f, 0f)
      //  glVertex2f(-0.5f, -0.5f)
      //  glColor3f(1f, 1f, 0f)
      //  glVertex2f(0.5f, -0.5f)
      //  glColor3f(0f, 1f, 0f)
      //  glVertex2f(0.5f,  0.5f)
      //  glColor3f(0f, 1f, 1f)
      //  glVertex2f(-0.5f, 0.5f)
      //glEnd()

      SDL_GL_SwapWindow(window)

      SDL_Delay((1000/30).toUInt)
    }

    SDL_DestroyWindow(window);
    SDL_Quit();
  }

}

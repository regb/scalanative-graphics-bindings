import scalanative.unsafe._
import scalanative.unsigned._

import sdl2.SDL._
import sdl2.Extras._
import gl.GL._
import gl.Extras._

object Main {

  var pressed = collection.mutable.Set.empty[SDL_Keycode]

  def main(args: Array[String]): Unit = {
    SDL_Init(SDL_INIT_VIDEO)

    SDL_GL_SetAttribute(SDL_GL_CONTEXT_MAJOR_VERSION, 2)
    SDL_GL_SetAttribute(SDL_GL_CONTEXT_MINOR_VERSION, 1)

    val window = SDL_CreateWindow(
        c"OpenGL window", SDL_WINDOWPOS_UNDEFINED, SDL_WINDOWPOS_UNDEFINED, 640, 480, SDL_WINDOW_OPENGL)

    if (window == null) {
        println("Could not create window: %s\n".format(fromCString(SDL_GetError())))
        return;
    }

    val glContext = SDL_GL_CreateContext(window)
    if (glContext == null) {
        println("Could not create OpenGL context: %s\n".format(fromCString(SDL_GetError())))
        return;
    }

    SDL_GL_SetSwapInterval(1)

    glEnable(GL_DEPTH_TEST)

    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    //glOrtho(-1, 1, -1, 1, -1, 1.1)
    glFrustum(-1, 1, -1, 1, 1, 100);

    val event = stackalloc[SDL_Event]
    while (true) {
      while (SDL_PollEvent(event) != 0) {
        event.type_ match {
          case SDL_QUIT =>
            return
          case SDL_KEYDOWN =>
            pressed += event.key.keysym.sym
          case SDL_KEYUP =>
            pressed -= event.key.keysym.sym
          case _ =>
            ()
        }
      }
      render()
      SDL_GL_SwapWindow(window)

      SDL_Delay((1000/30).toUInt)
    }
    SDL_DestroyWindow(window);
    SDL_Quit();
  }

  var xAngle = 0f
  var yAngle = 0f

  def render(): Unit = {
    if(pressed.contains(SDLK_UP)) yAngle -= 1
    if(pressed.contains(SDLK_DOWN)) yAngle += 1
    if(pressed.contains(SDLK_LEFT)) xAngle -= 1
    if(pressed.contains(SDLK_RIGHT)) xAngle += 1

    glMatrixMode(GL_MODELVIEW)
    glLoadIdentity()
    glTranslatef(0f, 0f, -2.5f)
    glRotatef(yAngle, 1f, 0f, 0f)
    glRotatef(xAngle, 0f, 1f, 0f)
  
    glClearColor(0f, 0f, 0f, 1f)

    glClear(GL_COLOR_BUFFER_BIT)
    glClear(GL_DEPTH_BUFFER_BIT)

    glBegin(GL_POLYGON)
      glColor3f(1f, 0f, 0f); glVertex3f(-0.5f, -0.5f, -0.5f)
      glColor3f(1f, 1f, 0f); glVertex3f(-0.5f,  0.5f, -0.5f)
      glColor3f(0f, 1f, 0f); glVertex3f( 0.5f,  0.5f, -0.5f)
      glColor3f(0f, 0f, 1f); glVertex3f( 0.5f, -0.5f, -0.5f)
    glEnd()

    // White side - BACK
    glBegin(GL_POLYGON);
      glColor3f(  1.0f,  1.0f, 1.0f)
      glVertex3f( 0.5f, -0.5f, 0.5f)
      glVertex3f( 0.5f,  0.5f, 0.5f)
      glVertex3f(-0.5f,  0.5f, 0.5f)
      glVertex3f(-0.5f, -0.5f, 0.5f)
    glEnd();
     
    // Purple side - RIGHT
    glBegin(GL_POLYGON)
      glColor3f(  1.0f,  0.0f,  1.0f)
      glVertex3f( 0.5f, -0.5f, -0.5f)
      glVertex3f( 0.5f,  0.5f, -0.5f)
      glVertex3f( 0.5f,  0.5f,  0.5f)
      glVertex3f( 0.5f, -0.5f,  0.5f)
    glEnd()
      
    // Green side - LEFT
    glBegin(GL_POLYGON)
      glColor3f(   0.0f,  1.0f,  0.0f)
      glVertex3f( -0.5f, -0.5f,  0.5f)
      glVertex3f( -0.5f,  0.5f,  0.5f)
      glVertex3f( -0.5f,  0.5f, -0.5f)
      glVertex3f( -0.5f, -0.5f, -0.5f)
    glEnd()
       
    // Blue side - TOP
    glBegin(GL_POLYGON)
      glColor3f(   0.0f,  0.0f,  1.0f)
      glVertex3f(  0.5f,  0.5f,  0.5f)
      glVertex3f(  0.5f,  0.5f, -0.5f)
      glVertex3f( -0.5f,  0.5f, -0.5f)
      glVertex3f( -0.5f,  0.5f,  0.5f)
    glEnd()
        
    // Red side - BOTTOM
    glBegin(GL_POLYGON);
      glColor3f(   1.0f,  0.0f,  0.0f)
      glVertex3f(  0.5f, -0.5f, -0.5f)
      glVertex3f(  0.5f, -0.5f,  0.5f)
      glVertex3f( -0.5f, -0.5f,  0.5f)
      glVertex3f( -0.5f, -0.5f, -0.5f)
    glEnd()

    glFlush()
  }
}

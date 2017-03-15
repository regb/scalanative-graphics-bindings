import scalanative.native._

import sdl2.SDL._
import sdl2.Extras._
import gl.GL._
import gl.Extras._

object Main {

  def main(args: Array[String]): Unit = {

    SDL_Init(SDL_INIT_VIDEO)

    coolName(c"hello %s", c"native")
    stdio.printf(SDL_GetError())

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


    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()

    glMatrixMode(GL_MODELVIEW)
    glLoadIdentity()
  
    glClearColor(0f, 0f, 0f, 1f)

    glClear(GL_COLOR_BUFFER_BIT)

    glBegin(GL_QUADS)
      glVertex2f(-0.5f, -0.5f)
      glVertex2f( 0.5f, -0.5f)
      glVertex2f( 0.5f,  0.5f)
      glVertex2f(-0.5f,  0.5f)
    glEnd()

    SDL_GL_SwapWindow(window)



    SDL_Delay(4000.toUInt)

    SDL_DestroyWindow(window);
    SDL_Quit();
  }

}

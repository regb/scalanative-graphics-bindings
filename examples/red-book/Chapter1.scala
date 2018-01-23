import scalanative.native._

import sdl2.SDL._
import sdl2.Extras._
import gl.GL._
import gl.Extras._

object Chapter1A {

  def main(args: Array[String]): Unit = {

    SDL_Init(SDL_INIT_VIDEO)

    SDL_GL_SetAttribute(SDL_GL_CONTEXT_MAJOR_VERSION, 1)
    SDL_GL_SetAttribute(SDL_GL_CONTEXT_MINOR_VERSION, 1)

    val window = SDL_CreateWindow(
        c"Red Book - Chapter 1 demo", SDL_WINDOWPOS_UNDEFINED, SDL_WINDOWPOS_UNDEFINED, 500, 500, SDL_WINDOW_OPENGL)

    if (window == null) {
        println("Could not create window: " + fromCString(SDL_GetError()))
        return;
    }

    val glContext = SDL_GL_CreateContext(window)
    if (glContext == null) {
        println("Could not create OpenGL context: " + fromCString(SDL_GetError()))
        return;
    }
    SDL_GL_SetSwapInterval(1)

    glClearColor(0f, 0f, 0f, 1f)

    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0f, 1f, 0f, 1f, -1f, 1f)

    var running = true
    val event: Ptr[SDL_Event] = stackalloc[SDL_Event]

    while(running) {

      while(SDL_PollEvent(event) != 0) {
        event.type_ match {
          case SDL_QUIT =>
            running = false
          case _ => ()
        }
      }

      render()
      SDL_GL_SwapWindow(window)
      SDL_Delay((1000/30).toUInt)
    }

    SDL_DestroyWindow(window);
    SDL_Quit();
  }

  def render(): Unit = {
    glClear(GL_COLOR_BUFFER_BIT)
    glColor3f(1f, 1f, 1f)
    glBegin(GL_POLYGON)
      glVertex3f(0.25f, 0.25f, 0f)
      glVertex3f(0.75f, 0.25f, 0f)
      glVertex3f(0.75f, 0.75f, 0f)
      glVertex3f(0.25f, 0.75f, 0f)
    glEnd()
    glFlush()
    glPopMatrix()
  }

}

object Chapter1B {

  private var spin = 0f
  private var spinning = true

  def main(args: Array[String]): Unit = {

    SDL_Init(SDL_INIT_VIDEO)

    SDL_GL_SetAttribute(SDL_GL_CONTEXT_MAJOR_VERSION, 1)
    SDL_GL_SetAttribute(SDL_GL_CONTEXT_MINOR_VERSION, 1)

    val window = SDL_CreateWindow(
        c"Red Book - Chapter 1 demo", SDL_WINDOWPOS_UNDEFINED, SDL_WINDOWPOS_UNDEFINED, 250, 250, SDL_WINDOW_OPENGL | SDL_WINDOW_RESIZABLE)

    if (window == null) {
        println("Could not create window: " + fromCString(SDL_GetError()))
        return;
    }

    val glContext = SDL_GL_CreateContext(window)
    if (glContext == null) {
        println("Could not create OpenGL context: " + fromCString(SDL_GetError()))
        return;
    }
    SDL_GL_SetSwapInterval(1)

    glClearColor(0f, 0f, 0f, 1f)
    glShadeModel(GL_FLAT)
    reshape(250.toUInt, 250.toUInt)

    var running = true
    val event: Ptr[SDL_Event] = stackalloc[SDL_Event]

    while(running) {

      while(SDL_PollEvent(event) != 0) {
        event.type_ match {
          case SDL_QUIT =>
            running = false
          case SDL_WINDOWEVENT =>
            event.window.event match {
              case SDL_WINDOWEVENT_RESIZED => reshape(event.window.data1.toUInt, event.window.data2.toUInt)
                
              case _ => ()
            }
          case SDL_MOUSEBUTTONDOWN =>
            event.button.button match {
              case SDL_BUTTON_LEFT => spinning = !spinning
              case _ => ()
            }
          case _ => ()
        }
      }

      render()
      SDL_GL_SwapWindow(window)
      SDL_Delay((1000/30).toUInt)
    }

    SDL_DestroyWindow(window);
    SDL_Quit();
  }

  def reshape(w: UInt, h: UInt): Unit = {
    println("reshape to: " + w + "x" + h)

    glViewport(0, 0, w, h)

    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(-50f, 50f, -50f, 50f, -1f, 1f)

    glMatrixMode(GL_MODELVIEW)
    glLoadIdentity()
  }


  def render(): Unit = {

    if(spinning) {
      spin = spin + 2
      if(spin > 360)
        spin = spin - 360
    }

    glClear(GL_COLOR_BUFFER_BIT)
    glPushMatrix()
    glRotatef(spin, 0f, 0f, 1f)
    glColor3f(1f, 1f, 1f)
    glRectf(-25f, -25f, 25f, 25f)
    glPopMatrix()
  }

}

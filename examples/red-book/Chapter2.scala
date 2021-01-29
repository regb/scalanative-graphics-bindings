import scalanative.unsafe._
import scalanative.unsigned._

import sdl2.SDL._
import sdl2.Extras._
import gl.GL._
import gl.Extras._

object Chapter2 {

  def main(args: Array[String]): Unit = {

    SDL_Init(SDL_INIT_VIDEO)

    SDL_GL_SetAttribute(SDL_GL_CONTEXT_MAJOR_VERSION, 1)
    SDL_GL_SetAttribute(SDL_GL_CONTEXT_MINOR_VERSION, 1)

    val window = SDL_CreateWindow(
        c"Red Book - Chapter 1 demo", SDL_WINDOWPOS_UNDEFINED, SDL_WINDOWPOS_UNDEFINED, 500, 500, SDL_WINDOW_OPENGL | SDL_WINDOW_RESIZABLE)

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

    glClearColor(0f, 0f, 0f, 0f)

    reshape(500.toUInt, 500.toUInt)

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
      glVertex2f(0f, 0f)
      glVertex2f(0f, 100f)
      glVertex2f(200f, 100f)
      glVertex2f(250f, 50f)
      glVertex2f(200f, 0f)
    glEnd()

    //val circlePoints = 100;
    //glBegin(GL_LINE_LOOP); 
    //for(i <- 0 to circlePoints) {    
    //  val angle = 2*scala.math.Pi*i/circlePoints 
    //  glVertex2d(math.cos(angle), math.sin(angle))
    //}
    //glEnd()
  }

  def reshape(w: UInt, h: UInt): Unit = {
    glViewport(0, 0, w, h)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0f, w.toFloat, 0f, h.toFloat, -1f, 1f)
  }
}

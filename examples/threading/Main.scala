import scalanative.unsafe._

import sdl2.SDL._
import sdl2.Extras._

object Threading {
  val title  = c"Threading"
  val width  = 800
  val height = 800

  def main(args: Array[String]): Unit = {
    println("First hello from main thread, with id: " + SDL_ThreadID())
    val fn: SDL_ThreadFunction = (data: Ptr[Byte]) => { println("Hello from thread 1, with id: " + SDL_ThreadID()); 0 }
    val thread = SDL_CreateThread(fn , c"thread 1", null)

    SDL_Delay(5000.toUInt)

    println("Second hello from main thread, with id: " + SDL_ThreadID())
  }

}

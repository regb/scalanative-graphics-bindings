import scalanative.unsafe._
import scalanative.unsigned._

import sdl2.SDL._
import sdl2.Extras._
import sdl2.ttf.SDL_ttf._
import sdl2.ttf.Extras._

object Fonts extends App {

  var window: Ptr[SDL_Window]     = _
  var renderer: Ptr[SDL_Renderer] = _
  var font: Ptr[TTF_Font]         = _

  def init(): Unit = {
    SDL_Init(SDL_INIT_VIDEO)
    window = SDL_CreateWindow(c"test fonts", SDL_WINDOWPOS_CENTERED, SDL_WINDOWPOS_CENTERED, 800, 800, SDL_WINDOW_SHOWN)
    renderer = SDL_CreateRenderer(window, -1, SDL_RENDERER_PRESENTVSYNC)

    if(TTF_Init() != 0) {
      println("TTF_Init: %s".format(fromCString(SDL_GetError())))
      sys.exit(-1)
    }

    font = TTF_OpenFont(c"assets/OpenSans-Regular.ttf", 20)
    if(font == null) {
      println("TTF_OpenFont failed: %s".format(fromCString(SDL_GetError())))
      sys.exit(-1)
    }
  }

  def cleanup(): Unit = {
    if(font != null)
      TTF_CloseFont(font)
    TTF_Quit()
    SDL_DestroyRenderer(renderer)
    SDL_DestroyWindow(window)
    SDL_Quit()
  }

  def onDraw(): Unit = {
    println("hey there")
    val message = TTF_RenderText_Solid(font, c"Hello World", SDL_Color(255.toUByte, 255.toUByte, 255.toUByte, 255.toUByte))
    val texture = SDL_CreateTextureFromSurface(renderer, message)
    val w = stackalloc[CInt]
    val h = stackalloc[CInt]
    SDL_QueryTexture(texture, null, null, w, h)
    val rect = stackalloc[SDL_Rect].init(0, 0, !w, !h)
    SDL_RenderCopy(renderer, texture, null, rect)
    SDL_RenderPresent(renderer)
  }

  def delay(ms: UInt): Unit =
    SDL_Delay(ms)

  def loop(): Unit = {
    val event = stackalloc[SDL_Event]
    while (true) {
      while (SDL_PollEvent(event) != 0) {
        event.type_ match {
          case SDL_QUIT =>
            return
          case _ =>
            ()
        }
      }
      onDraw()
      delay((1000 / 12).toUInt)
    }
  }

  init()
  loop()
  cleanup()
}

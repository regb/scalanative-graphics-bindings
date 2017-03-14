import scalanative.native._

import sdl2.SDL._
import sdl2.Extras._

final case class Point(x: Int, y: Int) {
  def -(other: Point) = Point(this.x - other.x, this.y - other.y)
  def +(other: Point) = Point(this.x - other.x, this.y - other.y)
}

object Snake extends App {
  var window: Ptr[SDL_Window]     = _
  var renderer: Ptr[SDL_Renderer] = _
  var snake: List[Point]      = _
  var pressed                 = collection.mutable.Set.empty[SDL_Keycode]
  var over                    = false
  var apple                   = Point(0, 0)
  var rand                    = new java.util.Random

  val title  = c"Snake"
  val width  = 800
  val height = 800
  val Up     = Point(0, 1)
  val Down   = Point(0, -1)
  val Left   = Point(1, 0)
  val Right  = Point(-1, 0)

  def newApple(): Point = {
    var pos = Point(0, 0)
    do {
      pos = Point(rand.nextInt(40), rand.nextInt(40))
    } while (snake.exists(_ == pos))
    pos
  }

  def drawColor(r: UByte, g: UByte, b: UByte): Unit =
    SDL_SetRenderDrawColor(renderer, r, g, b, 0.toUByte)
  def drawClear(): Unit =
    SDL_RenderClear(renderer)
  def drawPresent(): Unit =
    SDL_RenderPresent(renderer)
  def drawSquare(point: Point) = {
    val rect = stackalloc[SDL_Rect].init(point.x * 20, point.y * 20, 20, 20)
    SDL_RenderFillRect(renderer, rect)
  }
  def drawSnake(): Unit = {
    val head :: tail = snake
    drawColor(100.toUByte, 200.toUByte, 100.toUByte)
    drawSquare(head)
    drawColor(0.toUByte, 150.toUByte, 0.toUByte)
    tail.foreach(drawSquare)
  }
  def drawApple(): Unit = {
    drawColor(150.toUByte, 0.toUByte, 0.toUByte)
    drawSquare(apple)
  }

  def onDraw(): Unit = {
    drawColor(0.toUByte, 0.toUByte, 0.toUByte)
    drawClear()
    drawSnake()
    drawApple()
    drawPresent()
  }

  def gameOver(): Unit = {
    over = true
    println(s"Game is over, your score is: " + snake.length)
  }

  def move(newPos: Point) =
    if (!over) {
      if (newPos.x < 0 || newPos.y < 0 || newPos.x > 39 || newPos.y > 39) {
        println("out of bounds")
        gameOver()
      } else if (snake.exists(_ == newPos)) {
        println("hit itself")
        gameOver()
      } else if (apple == newPos) {
        snake = newPos :: snake
        apple = newApple()
      } else {
        snake = newPos :: snake.init
      }
    }

  def onIdle(): Unit = {
    val head :: second :: rest = snake
    val direction              = second - head
    val userDirection =
      if (pressed.contains(SDLK_UP)) Up
      else if (pressed.contains(SDLK_DOWN)) Down
      else if (pressed.contains(SDLK_LEFT)) Left
      else if (pressed.contains(SDLK_RIGHT)) Right
      else direction
    if(head + userDirection != second)
      move(head + userDirection)
    else
      move(head + direction)
  }

  def init(): Unit = {
    rand.setSeed(java.lang.System.nanoTime)
    SDL_Init(SDL_INIT_VIDEO)
    window = SDL_CreateWindow(title, SDL_WINDOWPOS_CENTERED, SDL_WINDOWPOS_CENTERED, width, height, SDL_WINDOW_SHOWN)
    renderer = SDL_CreateRenderer(window, -1, SDL_RENDERER_PRESENTVSYNC)
    snake = Point(10, 10) :: Point(9, 10) :: Point(8, 10) :: Point(7, 10) :: Nil
    apple = newApple()
  }

  def cleanup(): Unit = {
    SDL_DestroyRenderer(renderer)
    SDL_DestroyWindow(window)
    SDL_Quit()
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
          case SDL_KEYDOWN =>
            pressed += event.key.keysym.sym//cast[Ptr[KeyboardEvent]].keycode
          case SDL_KEYUP =>
            pressed -= event.key.keysym.sym//cast[Ptr[KeyboardEvent]].keycode
          case _ =>
            ()
        }
      }
      onDraw()
      onIdle()
      delay((1000 / 12).toUInt)
    }
  }

  init()
  loop()
  cleanup()
}

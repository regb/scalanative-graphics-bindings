import scalanative.unsafe._
import scalanative.unsigned._

import sdl2.SDL._
import sdl2.Extras._
import sdl2.image.SDL_image._
import sdl2.image.Extras._
import gl.GL._
import gl.Extras._

object Main {

  def main(args: Array[String]): Unit = {

    SDL_Init(SDL_INIT_VIDEO)

    SDL_GL_SetAttribute(SDL_GL_CONTEXT_MAJOR_VERSION, 2)
    SDL_GL_SetAttribute(SDL_GL_CONTEXT_MINOR_VERSION, 1)

    val window = SDL_CreateWindow(
        c"OpenGL window", SDL_WINDOWPOS_UNDEFINED, SDL_WINDOWPOS_UNDEFINED, 800, 800, SDL_WINDOW_OPENGL)

    if (window == null) {
        println("Could not create window: " + fromCString(SDL_GetError()))
        return;
    }


    val glContext = SDL_GL_CreateContext(window)
    if (glContext == null) {
        println("Could not create OpenGL context: " + fromCString(SDL_GetError()))
        return;
    }

    glEnable(GL_TEXTURE_2D)

    SDL_GL_SetSwapInterval(1)

    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0f, 800, 800, 0f, 1f, -1f)

    glMatrixMode(GL_MODELVIEW)
    glLoadIdentity()
    glPushMatrix()

    //val surface = SDL_LoadBMP(c"/home/reg/cat.bmp")
    //val surface = IMG_Load(c"/home/reg/cat.bmp")
    //val surface = IMG_Load(c"/home/reg/cat.jpg")
    val surface = IMG_Load(c"/home/reg/vcs/games/sgl/examples/hello/assets/drawable/character.png")
    if(surface == null) {
      println("couldn't load cat image")
      sys.exit()
    }
    println("w: " + surface.w + "h: " + surface.h + " Bpp: " + surface.format.BytesPerPixel + " bpp: " + surface.format.BitsPerPixel)

    val test: UByte = (SDL_MapRGB(surface.format, 0xAA.toUByte, 0xBB.toUByte, 0XCC.toUByte) & 0xFF.toUInt).toUByte
    //val sourceFormat = if(surface.format.BitsPerPixel == 8.toUByte) GL_COLOR_INDEX else GL_BGR
    val sourceFormat = if(surface.format.BytesPerPixel == 4.toUByte) {
      if(test == 0xAA.toUByte) GL_RGBA else GL_BGRA
    } else {
      if(test == 0xAA.toUByte) GL_RGB else GL_BGR
    }

    val textureId: Ptr[GLuint] = stackalloc[GLuint]
    glGenTextures(1.toUInt, textureId)
    glBindTexture(GL_TEXTURE_2D, !textureId)

    glTexImage2D(GL_TEXTURE_2D, 0, surface.format.BytesPerPixel.toInt, surface.w.toUInt, surface.h.toUInt, 0, sourceFormat, GL_UNSIGNED_BYTE, surface.pixels)

    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR)
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR)

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

      glPopMatrix()
      glPushMatrix()
      glTranslatef(x, y, 0f)

      glClearColor(0f, 0f, 0f, 1f)
      glClear(GL_COLOR_BUFFER_BIT)

      glColor3f(1f,1f,1f)
      glBegin(GL_QUADS)
        glTexCoord2f(0f, 0f)
        glVertex2f(0f, 200f)
        glTexCoord2f(0.5f, 0f)
        glVertex2f( 400f, 200f)
        glTexCoord2f(0.5f, 0.5f)
        glVertex2f( 400f,  500f)
        glTexCoord2f(0f, 0.5f)
        glVertex2f( 0f,  500f)
      glEnd()

      //glBegin(GL_QUADS)
      //  glColor3f(1f, 0f, 0f)
      //  glVertex2f(1000f, 200f)
      //  glColor3f(1f, 1f, 0f)
      //  glVertex2f( 1300f, 200f)
      //  glColor3f(0f, 1f, 0f)
      //  glVertex2f( 1300f,  400f)
      //  glColor3f(0f, 1f, 1f)
      //  glVertex2f( 1000f,  400f)
      //glEnd()

      SDL_GL_SwapWindow(window)

      SDL_Delay((1000/30).toUInt)
    }

    SDL_DestroyWindow(window);
    SDL_Quit();
  }

}

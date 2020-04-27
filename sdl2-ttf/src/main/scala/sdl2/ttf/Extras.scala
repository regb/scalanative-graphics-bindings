package sdl2
package ttf

import scalanative.unsafe._
import scalanative.unsigned._

import SDL._
import sdl2.Extras._
import SDL_ttf._

object Extras {

  val UNICODE_BOM_NATIVE: UInt = 0xFEFF.toUInt
  val UNICODE_BOM_SWAPPED: UInt = 0xFFFE.toUInt

  val TTF_STYLE_NORMAL: UShort = 0x00.toUShort
  val TTF_STYLE_BOLD: UShort = 0x01.toUShort
  val TTF_STYLE_ITALIC: UShort = 0x02.toUShort
  val TTF_STYLE_UNDERLINE: UShort = 0x04.toUShort
  val TTF_STYLE_STRIKETHROUGH: UShort = 0x08.toUShort

  val TTF_HINTING_NORMAL: CInt = 0
  val TTF_HINTING_LIGHT: CInt = 1
  val TTF_HINTING_MONO: CInt = 2
  val TTF_HINTING_NONE: CInt = 3

  def TTF_GetError(): CString = SDL_GetError()
}

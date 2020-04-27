package sdl2
package ttf

import scalanative.unsafe._
import scalanative.unsigned._

import SDL._
import sdl2.Extras._

/*
 * We follow SDL naming convention, because we want to provide the
 * closest possible interface to the C API.
 */
@extern
@link("SDL2_ttf")
object SDL_ttf {
  
  def TTF_Linked_Version(): Ptr[SDL_version] = extern

  def TTF_ByteSwappedUNICODE(swapped: CInt): Unit = extern

  type TTF_Font = CStruct0
  
  def TTF_Init(): CInt = extern
  
  def TTF_OpenFont(file: CString, ptsize: CInt): Ptr[TTF_Font] = extern
  def TTF_OpenFontIndex(file: CString, ptsize: CInt, index: CLong): Ptr[TTF_Font] = extern
  def TTF_OpenFontRW(src: Ptr[SDL_RWops], freesrc: CInt, ptsize: CInt): Ptr[TTF_Font] = extern
  def TTF_OpenFontIndexRW(src: Ptr[SDL_RWops], freesrc: CInt, ptsize: CInt, index: CLong): Ptr[TTF_Font] = extern

  def TTF_GetFontStyle(font: Ptr[TTF_Font]): CInt = extern
  def TTF_SetFontStyle(font: Ptr[TTF_Font], style: CInt): Unit = extern
  def TTF_GetFontOutline(font: Ptr[TTF_Font]): CInt = extern
  def TTF_SetFontOutline(font: Ptr[TTF_Font], outline: CInt): Unit = extern

  def TTF_GetFontHinting(font: Ptr[TTF_Font]): CInt = extern
  def TTF_SetFontHinting(font: Ptr[TTF_Font], hinting: CInt): Unit = extern

  def TTF_FontHeight(font: Ptr[TTF_Font]): CInt = extern

  def TTF_FontAscent(font: Ptr[TTF_Font]): CInt = extern

  def TTF_FontDescent(font: Ptr[TTF_Font]): CInt = extern

  def TTF_FontLineSkip(font: Ptr[TTF_Font]): CInt = extern

  def TTF_GetFontKerning(font: Ptr[TTF_Font]): CInt = extern
  def TTF_SetFontKerning(font: Ptr[TTF_Font], allowed: CInt): Unit = extern

  def TTF_FontFaces(font: Ptr[TTF_Font]): CLong = extern

  def TTF_FontFaceIsFixedWidth(font: Ptr[TTF_Font]): CInt = extern
  def TTF_FontFaceFamilyName(font: Ptr[TTF_Font]): CString = extern
  def TTF_FontFaceStyleName(font: Ptr[TTF_Font]): CString = extern

  def TTF_GlyphIsProvided(font: Ptr[TTF_Font], ch: UShort): CInt = extern

  def TTF_GlyphMetrics(font: Ptr[TTF_Font], ch: UShort,
                       minx: Ptr[CInt], maxx: Ptr[CInt], miny: Ptr[CInt], maxy: Ptr[CInt],
                       advance: Ptr[CInt]): CInt = extern

  def TTF_SizeText(font: Ptr[TTF_Font], text: CString, w: Ptr[CInt], h: Ptr[CInt]): CInt = extern
  def TTF_SizeUTF8(font: Ptr[TTF_Font], text: CString, w: Ptr[CInt], h: Ptr[CInt]): CInt = extern
  def TTF_SizeUNICODE(font: Ptr[TTF_Font], text: Ptr[UShort], w: Ptr[CInt], h: Ptr[CInt]): CInt = extern

  def TTF_RenderText_Solid(font: Ptr[TTF_Font], text: CString, fg: SDL_Color): Ptr[SDL_Surface] = extern
  def TTF_RenderUTF8_Solid(font: Ptr[TTF_Font], text: CString, fg: SDL_Color): Ptr[SDL_Surface] = extern
  def TTF_RenderUNICODE_Solid(font: Ptr[TTF_Font], text: Ptr[UShort], fg: SDL_Color): Ptr[SDL_Surface] = extern

  def TTF_RenderGlyph_Solid(font: Ptr[TTF_Font], ch: UShort, fg: SDL_Color): Ptr[SDL_Surface] = extern

  def TTF_RenderText_Shaded(font: Ptr[TTF_Font], text: CString, fg: SDL_Color, bg: SDL_Color): Ptr[SDL_Surface] = extern
  def TTF_RenderUTF8_Shaded(font: Ptr[TTF_Font], text: CString, fg: SDL_Color, bg: SDL_Color): Ptr[SDL_Surface] = extern
  def TTF_RenderUNICODE_Shaded(font: Ptr[TTF_Font], text: Ptr[UShort], fg: SDL_Color, bg: SDL_Color): Ptr[SDL_Surface] = extern

  def TTF_RenderGlyph_Shaded(font: Ptr[TTF_Font], ch: UShort, fg: SDL_Color, bg: SDL_Color): Ptr[SDL_Surface] = extern

  def TTF_RenderText_Blended(font: Ptr[TTF_Font], text: CString, fg: SDL_Color): Ptr[SDL_Surface] = extern
  def TTF_RenderUTF8_Blended(font: Ptr[TTF_Font], text: CString, fg: SDL_Color): Ptr[SDL_Surface] = extern
  def TTF_RenderUNICODE_Blended(font: Ptr[TTF_Font], text: Ptr[UShort], fg: SDL_Color): Ptr[SDL_Surface] = extern

  def TTF_RenderText_Blended_Wrapped(font: Ptr[TTF_Font], text: CString, fg: SDL_Color, wrapLength: UInt): Ptr[SDL_Surface] = extern
  def TTF_RenderUTF8_Blended_Wrapped(font: Ptr[TTF_Font], text: CString, fg: SDL_Color, wrapLength: UInt): Ptr[SDL_Surface] = extern
  def TTF_RenderUNICODE_Blended_Wrapped(font: Ptr[TTF_Font], text: Ptr[UShort], fg: SDL_Color, wrapLength: UInt): Ptr[SDL_Surface] = extern

  def TTF_RenderGlyph_Blended(font: Ptr[TTF_Font], ch: UShort, fg: SDL_Color): Ptr[SDL_Surface] = extern

  def TTF_CloseFont(font: Ptr[TTF_Font]): Unit = extern

  def TTF_Quit(): Unit = extern
  def TTF_WasInit(): CInt = extern

  def TTF_GetFontKerningSizeGlyphs(font: Ptr[TTF_Font], previous_ch: UShort, ch: UShort): CInt = extern
}

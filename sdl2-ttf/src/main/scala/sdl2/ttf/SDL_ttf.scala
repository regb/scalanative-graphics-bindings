package sdl2
package ttf

import scalanative.native._

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

//extern DECLSPEC int SDLCALL TTF_GetFontStyle(const TTF_Font *font);
//extern DECLSPEC void SDLCALL TTF_SetFontStyle(TTF_Font *font, int style);
//extern DECLSPEC int SDLCALL TTF_GetFontOutline(const TTF_Font *font);
//extern DECLSPEC void SDLCALL TTF_SetFontOutline(TTF_Font *font, int outline);

//#define TTF_HINTING_NORMAL    0
//#define TTF_HINTING_LIGHT     1
//#define TTF_HINTING_MONO      2
//#define TTF_HINTING_NONE      3
//extern DECLSPEC int SDLCALL TTF_GetFontHinting(const TTF_Font *font);
//extern DECLSPEC void SDLCALL TTF_SetFontHinting(TTF_Font *font, int hinting);

///* Get the total height of the font - usually equal to point size */
//extern DECLSPEC int SDLCALL TTF_FontHeight(const TTF_Font *font);
//
///* Get the offset from the baseline to the top of the font
//   This is a positive value, relative to the baseline.
// */
//extern DECLSPEC int SDLCALL TTF_FontAscent(const TTF_Font *font);
//
///* Get the offset from the baseline to the bottom of the font
//   This is a negative value, relative to the baseline.
// */
//extern DECLSPEC int SDLCALL TTF_FontDescent(const TTF_Font *font);
//
///* Get the recommended spacing between lines of text for this font */
//extern DECLSPEC int SDLCALL TTF_FontLineSkip(const TTF_Font *font);
//
///* Get/Set whether or not kerning is allowed for this font */
//extern DECLSPEC int SDLCALL TTF_GetFontKerning(const TTF_Font *font);
//extern DECLSPEC void SDLCALL TTF_SetFontKerning(TTF_Font *font, int allowed);
//
///* Get the number of faces of the font */
//extern DECLSPEC long SDLCALL TTF_FontFaces(const TTF_Font *font);
//
///* Get the font face attributes, if any */
//extern DECLSPEC int SDLCALL TTF_FontFaceIsFixedWidth(const TTF_Font *font);
//extern DECLSPEC char * SDLCALL TTF_FontFaceFamilyName(const TTF_Font *font);
//extern DECLSPEC char * SDLCALL TTF_FontFaceStyleName(const TTF_Font *font);
//
///* Check wether a glyph is provided by the font or not */
//extern DECLSPEC int SDLCALL TTF_GlyphIsProvided(const TTF_Font *font, Uint16 ch);
//
///* Get the metrics (dimensions) of a glyph
//   To understand what these metrics mean, here is a useful link:
//    http://freetype.sourceforge.net/freetype2/docs/tutorial/step2.html
// */
//extern DECLSPEC int SDLCALL TTF_GlyphMetrics(TTF_Font *font, Uint16 ch,
//                     int *minx, int *maxx,
//                                     int *miny, int *maxy, int *advance);
//
///* Get the dimensions of a rendered string of text */
//extern DECLSPEC int SDLCALL TTF_SizeText(TTF_Font *font, const char *text, int *w, int *h);
//extern DECLSPEC int SDLCALL TTF_SizeUTF8(TTF_Font *font, const char *text, int *w, int *h);
//extern DECLSPEC int SDLCALL TTF_SizeUNICODE(TTF_Font *font, const Uint16 *text, int *w, int *h);

  // TODO: Seems like we hit a non-supported feature here, scala-native cannot bind functions which
  //       take a struct by value (the SDL_Color parameter). Trying to compile a code that use this will
  //       crash the compiler. What to do?
  //def TTF_RenderText_Solid(font: Ptr[TTF_Font], text: CString, fg: SDL_Color): Ptr[SDL_Surface] = extern
  def TTF_RenderText_Solid(font: Ptr[TTF_Font], text: CString, color: SDL_Color): Ptr[SDL_Surface] = extern
//extern DECLSPEC SDL_Surface * SDLCALL TTF_RenderUTF8_Solid(TTF_Font *font,
//                const char *text, SDL_Color fg);
//extern DECLSPEC SDL_Surface * SDLCALL TTF_RenderUNICODE_Solid(TTF_Font *font,
//                const Uint16 *text, SDL_Color fg);
//extern DECLSPEC SDL_Surface * SDLCALL TTF_RenderGlyph_Solid(TTF_Font *font,
//                    Uint16 ch, SDL_Color fg);

  def TTF_CloseFont(font: Ptr[TTF_Font]): Unit = extern

  def TTF_Quit(): Unit = extern
  def TTF_WasInit(): CInt = extern
}

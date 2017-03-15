package gl

import scalanative.native._

@extern
@link("GL")
object GL {

  //TODO: not sure this is the right defs. It could be that my local
  //      header file has definitions that match the right size expected by
  //      OpenGL. For example GLint might be expected to be always 4-byte
  //      in any machine, so it should rather be defined as Int
  type GLenum = CUnsignedInt
  type GLboolean = CChar
  type GLbitfield = CInt
  type GLvoid = Unit
  type GLbyte = CChar
  type GLshort = CShort
  type GLint = CInt
  type GLubyte = CUnsignedChar
  type GLushort = CUnsignedShort
  type GLuint = CUnsignedInt
  type GLsizei = CInt
  type GLfloat = CFloat
  type GLclampf = CFloat
  type GLdouble = CDouble
  type GLclampd = CDouble


  def glClearColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf): Unit = extern
  def glClear(mask: GLbitfield): Unit = extern




  def glMatrixMode(mode: GLenum): Unit = extern
  def glOrtho(left: GLdouble, right: GLdouble, bottom: GLdouble, top: GLdouble,
              near_val: GLdouble, far_val: GLdouble): Unit = extern
  def glFrustum(left: GLdouble, right: GLdouble, bottom: GLdouble, top: GLdouble,
                near_val: GLdouble, far_val: GLdouble): Unit = extern
  def glViewport(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit = extern
  def glPushMatrix(): Unit = extern
  def glPopMatrix(): Unit = extern
  def glLoadIdentity(): Unit = extern



  /*
   * Drawing Functions
   */

  def glBegin(mode: GLenum): Unit = extern
  def glEnd(): Unit = extern

  def glVertex2d(x: GLdouble, y: GLdouble): Unit = extern
  def glVertex2f(x: GLfloat, y: GLfloat): Unit = extern
  def glVertex2i(x: GLint, y: GLint): Unit = extern
  def glVertex2s(x: GLshort, y: GLshort): Unit = extern

  def glVertex3d(x: GLdouble, y: GLdouble, z: GLdouble): Unit = extern
  def glVertex3f(x: GLfloat, y: GLfloat, z: GLfloat): Unit = extern
  def glVertex3i(x: GLint, y: GLint, z: GLint): Unit = extern
  def glVertex3s(x: GLshort, y: GLshort, z: GLshort): Unit = extern

}

package gl

import scalanative.native._

@extern
object GL {

  //OpenGL defines its own names for standard size ints/double. They
  //should be guaranteed to be the same size across platforms, which
  //pretty much matches the Scala types
  type GLenum = UInt
  type GLboolean = UByte
  type GLbitfield = Int
  //type GLvoid = Unit
  type GLbyte = Byte
  type GLshort = Short
  type GLint = Int
  type GLubyte = UByte
  type GLushort = UShort
  type GLuint = UInt
  type GLsizei = UInt
  type GLfloat = Float
  type GLclampf = Float
  type GLdouble = Double
  type GLclampd = Double

  /*
   * Miscellaneous
   */
  def glClearIndex(c: GLfloat): Unit = extern
  def glClearColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf): Unit = extern
  def glClear(mask: GLbitfield): Unit = extern
  def glIndexMask(mask: GLuint): Unit = extern
  def glColorMask(red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean): Unit = extern
  def glAlphaFunc(func: GLenum, ref: GLclampf): Unit = extern
  def glBlendFunc(sfactor: GLenum, dfactor: GLenum): Unit = extern
  def glLogicOp(opcode: GLenum): Unit = extern
  def glCullFace(mode: GLenum): Unit = extern
  def glFrontFace(mode: GLenum): Unit = extern
  def glPointSize(size: GLfloat): Unit = extern
  def glLineWidth(width: GLfloat): Unit = extern
  def glLineStipple(factor: GLint, pattern: GLushort): Unit = extern
  def glPolygonMode(face: GLenum, mode: GLenum): Unit = extern
  def glPolygonOffset(factor: GLfloat, units: GLfloat): Unit = extern
  def glPolygonStipple(mask: Ptr[GLubyte]): Unit = extern
  def glGetPolygonStipple(mask: Ptr[GLubyte]): Unit = extern
  def glEdgeFlag(flag: GLboolean): Unit = extern
  def glEdgeFlagv(flag: Ptr[GLboolean]): Unit = extern
  def glScissor(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit = extern
  def glClipPlane(plane: GLenum, equation: Ptr[GLdouble]): Unit = extern
  def glGetClipPlane(plane: GLenum, equation: Ptr[GLdouble]): Unit = extern
  def glDrawBuffer(mode: GLenum): Unit = extern
  def glReadBuffer(mode: GLenum): Unit = extern
  def glEnable(cap: GLenum): Unit = extern
  def glDisable(cap: GLenum): Unit = extern
  def glIsEnabled(cap: GLenum): GLboolean = extern

  def glEnableClientState(cap: GLenum): Unit = extern
  def glDisableClientState(cap: GLenum): Unit = extern

  def glGetBooleanv(pname: GLenum, params: Ptr[GLboolean]): Unit = extern
  def glGetDoublev(pname: GLenum, params: Ptr[GLdouble]): Unit = extern
  def glGetFloatv(pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glGetIntegerv(pname: GLenum, params: Ptr[GLint]): Unit = extern

  def glPushAttrib(mask: GLbitfield): Unit = extern
  def glPopAttrib(): Unit = extern

  def glPushClientAttrib(mask: GLbitfield): Unit = extern
  def glPopClientAttrib(): Unit = extern

  def glRenderMode(mode: GLenum): GLint = extern
  def glGetError(): GLenum = extern
  def glGetString(name: GLenum): Ptr[GLubyte] = extern
  def glFinish(): Unit = extern
  def glFlush(): Unit = extern
  def glHint(target: GLenum, mode: GLenum): Unit = extern

  /*
   * Depth Buffer
   */
  
  def glClearDepth(depth: GLclampd): Unit = extern
  def glDepthFunc(func: GLenum): Unit = extern
  def glDepthMask(flag: GLboolean): Unit = extern
  def glDepthRange(near_val: GLclampd, far_val: GLclampd): Unit = extern

  /*
   * Accumulation Buffer
   */
  def glClearAccum(red: GLfloat, green: GLfloat, blue: GLfloat, alpha: GLfloat): Unit = extern
  def glAccum(op: GLenum, value: GLfloat): Unit = extern

  /*
   * Transformation
   */
  def glMatrixMode(mode: GLenum): Unit = extern
  def glOrtho(left: GLdouble, right: GLdouble, bottom: GLdouble, top: GLdouble,
              near_val: GLdouble, far_val: GLdouble): Unit = extern
  def glFrustum(left: GLdouble, right: GLdouble, bottom: GLdouble, top: GLdouble,
                near_val: GLdouble, far_val: GLdouble): Unit = extern
  def glViewport(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit = extern
  def glPushMatrix(): Unit = extern
  def glPopMatrix(): Unit = extern
  def glLoadIdentity(): Unit = extern
  def glLoadMatrixd(m: Ptr[GLdouble]): Unit = extern
  def glLoadMatrixf(m: Ptr[GLfloat]): Unit = extern
  def glMultMatrixd(m: Ptr[GLdouble]): Unit = extern
  def glMultMatrixf(m: Ptr[GLfloat]): Unit = extern
  def glRotated(angle: GLdouble, x: GLdouble, y: GLdouble, z: GLdouble): Unit = extern
  def glRotatef(angle: GLfloat, x: GLfloat, y: GLfloat, z: GLfloat): Unit = extern
  def glScaled(x: GLdouble, y: GLdouble, z: GLdouble): Unit = extern
  def glScalef(x: GLfloat, y: GLfloat, z: GLfloat): Unit = extern
  def glTranslated(x: GLdouble, y: GLdouble, z: GLdouble): Unit = extern
  def glTranslatef(x: GLfloat, y: GLfloat, z: GLfloat): Unit = extern

  /*
   * Display Lists
   */
  def glIsList(list: GLuint): GLboolean = extern
  def glDeleteLists(list: GLuint, range: GLsizei): Unit = extern
  def glGenLists(range: GLsizei): GLuint = extern
  def glNewList(list: GLuint, mode: GLenum): Unit = extern
  def glEndList(): Unit = extern
  def glCallList(list: GLuint): Unit = extern
  def glCallLists(n: GLsizei, type_ : GLenum, lists: Ptr[Byte]): Unit = extern
  def glListBase(base: GLuint): Unit = extern

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

  def glVertex4d(x: GLdouble, y: GLdouble, z: GLdouble, w: GLdouble): Unit = extern
  def glVertex4f(x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit = extern
  def glVertex4i(x: GLint, y: GLint, z: GLint, w: GLint): Unit = extern
  def glVertex4s(x: GLshort, y: GLshort, z: GLshort, w: GLshort): Unit = extern

  def glVertex2dv(v: Ptr[GLdouble]): Unit = extern
  def glVertex2fv(v: Ptr[GLfloat]): Unit = extern
  def glVertex2iv(v: Ptr[GLint]): Unit = extern
  def glVertex2sv(v: Ptr[GLshort]): Unit = extern

  def glVertex3dv(v: Ptr[GLdouble]): Unit = extern
  def glVertex3fv(v: Ptr[GLfloat]): Unit = extern
  def glVertex3iv(v: Ptr[GLint]): Unit = extern
  def glVertex3sv(v: Ptr[GLshort]): Unit = extern

  def glVertex4dv(v: Ptr[GLdouble]): Unit = extern
  def glVertex4fv(v: Ptr[GLfloat]): Unit = extern
  def glVertex4iv(v: Ptr[GLint]): Unit = extern
  def glVertex4sv(v: Ptr[GLshort]): Unit = extern

  def glNormal3b(nx: GLbyte, ny: GLbyte, nz: GLbyte): Unit = extern
  def glNormal3d(nx: GLdouble, ny: GLdouble, nz: GLdouble): Unit = extern
  def glNormal3f(nx: GLfloat, ny: GLfloat, nz: GLfloat): Unit = extern
  def glNormal3i(nx: GLint, ny: GLint, nz: GLint): Unit = extern
  def glNormal3s(nx: GLshort, ny: GLshort, nz: GLshort): Unit = extern

  def glNormal3bv(v: Ptr[GLbyte]): Unit = extern
  def glNormal3dv(v: Ptr[GLdouble]): Unit = extern
  def glNormal3fv(v: Ptr[GLfloat]): Unit = extern
  def glNormal3iv(v: Ptr[GLint]): Unit = extern
  def glNormal3sv(v: Ptr[GLshort]): Unit = extern

  def glIndexd(c: GLdouble): Unit = extern
  def glIndexf(c: GLfloat): Unit = extern
  def glIndexi(c: GLint): Unit = extern
  def glIndexs(c: GLshort): Unit = extern
  def glIndexub(c: GLubyte): Unit = extern

  def glIndexdv(c: Ptr[GLdouble]): Unit = extern
  def glIndexfv(c: Ptr[GLfloat]): Unit = extern
  def glIndexiv(c: Ptr[GLint]): Unit = extern
  def glIndexsv(c: Ptr[GLshort]): Unit = extern
  def glIndexubv(c: Ptr[GLubyte]): Unit = extern

  def glColor3b(red: GLbyte, green: GLbyte, blue: GLbyte): Unit = extern
  def glColor3d(red: GLdouble, green: GLdouble, blue: GLdouble): Unit = extern
  def glColor3f(red: GLfloat, green: GLfloat, blue: GLfloat): Unit = extern
  def glColor3i(red: GLint, green: GLint, blue: GLint): Unit = extern
  def glColor3s(red: GLshort, green: GLshort, blue: GLshort): Unit = extern
  def glColor3ub(red: GLubyte, green: GLubyte, blue: GLubyte): Unit = extern
  def glColor3ui(red: GLuint, green: GLuint, blue: GLuint): Unit = extern
  def glColor3us(red: GLushort, green: GLushort, blue: GLushort): Unit = extern

  def glColor4b(red: GLbyte, green: GLbyte, blue: GLbyte, alpha: GLbyte): Unit = extern
  def glColor4d(red: GLdouble, green: GLdouble, blue: GLdouble, alpha: GLdouble): Unit = extern
  def glColor4f(red: GLfloat, green: GLfloat, blue: GLfloat, alpha: GLfloat): Unit = extern
  def glColor4i(red: GLint, green: GLint, blue: GLint, alpha: GLint): Unit = extern
  def glColor4s(red: GLshort, green: GLshort, blue: GLshort, alpha: GLshort): Unit = extern
  def glColor4ub(red: GLubyte, green: GLubyte, blue: GLubyte, alpha: GLubyte): Unit = extern
  def glColor4ui(red: GLuint, green: GLuint, blue: GLuint, alpha: GLuint): Unit = extern
  def glColor4us(red: GLushort, green: GLushort, blue: GLushort, alpha: GLushort): Unit = extern

  def glColor3bv(v: Ptr[GLbyte]): Unit = extern
  def glColor3dv(v: Ptr[GLdouble]): Unit = extern
  def glColor3fv(v: Ptr[GLfloat]): Unit = extern
  def glColor3iv(v: Ptr[GLint]): Unit = extern
  def glColor3sv(v: Ptr[GLshort]): Unit = extern
  def glColor3ubv(v: Ptr[GLubyte]): Unit = extern
  def glColor3uiv(v: Ptr[GLuint]): Unit = extern
  def glColor3usv(v: Ptr[GLushort]): Unit = extern

  def glColor4bv(v: Ptr[GLbyte]): Unit = extern
  def glColor4dv(v: Ptr[GLdouble]): Unit = extern
  def glColor4fv(v: Ptr[GLfloat]): Unit = extern
  def glColor4iv(v: Ptr[GLint]): Unit = extern
  def glColor4sv(v: Ptr[GLshort]): Unit = extern
  def glColor4ubv(v: Ptr[GLubyte]): Unit = extern
  def glColor4uiv(v: Ptr[GLuint]): Unit = extern
  def glColor4usv(v: Ptr[GLushort]): Unit = extern

}

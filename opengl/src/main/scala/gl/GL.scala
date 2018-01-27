package gl

import scalanative.native._

@extern
object GL {

  type _16   = Nat.Digit[Nat._1, Nat._6]

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
  /* Added in 1.5 */
  type GLsizeiptr = CPtrDiff
  type GLintptr = CPtrDiff
  /* Added in 2.0 */
  type GLchar = CChar
  /* OpenGL 3.0 */
  type GLhalf = UShort
  /* OpenGL 3.2 */
  type __GLsync = CStruct0
  type GLsync = Ptr[__GLsync]
  type GLuint64 = ULong;
  type GLint64 = Long;

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
  
  def glTexCoord1d(s: GLdouble): Unit = extern
  def glTexCoord1f(s: GLfloat): Unit = extern
  def glTexCoord1i(s: GLint): Unit = extern
  def glTexCoord1s(s: GLshort): Unit = extern
  def glTexCoord2d(s: GLdouble, t: GLdouble): Unit = extern
  def glTexCoord2f(s: GLfloat, t: GLfloat): Unit = extern
  def glTexCoord2i(s: GLint, t: GLint): Unit = extern
  def glTexCoord2s(s: GLshort, t: GLshort): Unit = extern
  def glTexCoord3d(s: GLdouble, t: GLdouble, r: GLdouble): Unit = extern
  def glTexCoord3f(s: GLfloat, t: GLfloat, r: GLfloat): Unit = extern
  def glTexCoord3i(s: GLint, t: GLint, r: GLint): Unit = extern
  def glTexCoord3s(s: GLshort, t: GLshort, r: GLshort): Unit = extern
  def glTexCoord4d(s: GLdouble, t: GLdouble, r: GLdouble, q: GLdouble): Unit = extern
  def glTexCoord4f(s: GLfloat, t: GLfloat, r: GLfloat, q: GLfloat): Unit = extern
  def glTexCoord4i(s: GLint, t: GLint, r: GLint, q: GLint): Unit = extern
  def glTexCoord4s(s: GLshort, t: GLshort, r: GLshort, q: GLshort): Unit = extern
  def glTexCoord1dv(v: Ptr[GLdouble]): Unit = extern
  def glTexCoord1fv(v: Ptr[GLfloat]): Unit = extern
  def glTexCoord1iv(v: Ptr[GLint]): Unit = extern
  def glTexCoord1sv(v: Ptr[GLshort]): Unit = extern
  def glTexCoord2dv(v: Ptr[GLdouble]): Unit = extern
  def glTexCoord2fv(v: Ptr[GLfloat]): Unit = extern
  def glTexCoord2iv(v: Ptr[GLint]): Unit = extern
  def glTexCoord2sv(v: Ptr[GLshort]): Unit = extern
  def glTexCoord3dv(v: Ptr[GLdouble]): Unit = extern
  def glTexCoord3fv(v: Ptr[GLfloat]): Unit = extern
  def glTexCoord3iv(v: Ptr[GLint]): Unit = extern
  def glTexCoord3sv(v: Ptr[GLshort]): Unit = extern
  def glTexCoord4dv(v: Ptr[GLdouble]): Unit = extern
  def glTexCoord4fv(v: Ptr[GLfloat]): Unit = extern
  def glTexCoord4iv(v: Ptr[GLint]): Unit = extern
  def glTexCoord4sv(v: Ptr[GLshort]): Unit = extern

  def glRasterPos2d(x: GLdouble, y: GLdouble): Unit = extern
  def glRasterPos2f(x: GLfloat, y: GLfloat): Unit = extern
  def glRasterPos2i(x: GLint, y: GLint): Unit = extern
  def glRasterPos2s(x: GLshort, y: GLshort): Unit = extern
  def glRasterPos3d(x: GLdouble, y: GLdouble, z: GLdouble): Unit = extern
  def glRasterPos3f(x: GLfloat, y: GLfloat, z: GLfloat): Unit = extern
  def glRasterPos3i(x: GLint, y: GLint, z: GLint): Unit = extern
  def glRasterPos3s(x: GLshort, y: GLshort, z: GLshort): Unit = extern
  def glRasterPos4d(x: GLdouble, y: GLdouble, z: GLdouble, w: GLdouble): Unit = extern
  def glRasterPos4f(x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit = extern
  def glRasterPos4i(x: GLint, y: GLint, z: GLint, w: GLint): Unit = extern
  def glRasterPos4s(x: GLshort, y: GLshort, z: GLshort, w: GLshort): Unit = extern
  def glRasterPos2dv(v: Ptr[GLdouble]): Unit = extern
  def glRasterPos2fv(v: Ptr[GLfloat]): Unit = extern
  def glRasterPos2iv(v: Ptr[GLint]): Unit = extern
  def glRasterPos2sv(v: Ptr[GLshort]): Unit = extern
  def glRasterPos3dv(v: Ptr[GLdouble]): Unit = extern
  def glRasterPos3fv(v: Ptr[GLfloat]): Unit = extern
  def glRasterPos3iv(v: Ptr[GLint]): Unit = extern
  def glRasterPos3sv(v: Ptr[GLshort]): Unit = extern
  def glRasterPos4dv(v: Ptr[GLdouble]): Unit = extern
  def glRasterPos4fv(v: Ptr[GLfloat]): Unit = extern
  def glRasterPos4iv(v: Ptr[GLint]): Unit = extern
  def glRasterPos4sv(v: Ptr[GLshort]): Unit = extern

  def glRectd(x1: GLdouble, y1: GLdouble, x2: GLdouble, y2: GLdouble): Unit = extern
  def glRectf(x1: GLfloat, y1: GLfloat, x2: GLfloat, y2: GLfloat): Unit = extern
  def glRecti(x1: GLint, y1: GLint, x2: GLint, y2: GLint): Unit = extern
  def glRects(x1: GLshort, y1: GLshort, x2: GLshort, y2: GLshort): Unit = extern
  def glRectdv(v1: Ptr[GLdouble], v2: Ptr[GLdouble]): Unit = extern
  def glRectfv(v1: Ptr[GLfloat], v2: Ptr[GLfloat]): Unit = extern
  def glRectiv(v1: Ptr[GLint], v2: Ptr[GLint]): Unit = extern
  def glRectsv(v1: Ptr[GLshort], v2: Ptr[GLshort]): Unit = extern

  /*
   * Vertex Arrays  (1.1)
   */
  def glVertexPointer(size: GLint, type_ : GLenum, stride: GLsizei, ptr: Ptr[Byte]): Unit = extern
  def glNormalPointer(type_ :  GLenum, stride: GLsizei, ptr: Ptr[Byte]): Unit = extern
  def glColorPointer(size: GLint, type_ : GLenum, stride: GLsizei, ptr: Ptr[Byte]): Unit = extern
  def glIndexPointer(type_ : GLenum, stride: GLsizei, ptr: Ptr[Byte]): Unit = extern
  def glTexCoordPointer(size: GLint, type_ : GLenum, stride: GLsizei, ptr: Ptr[Byte]): Unit = extern
  def glEdgeFlagPointer(stride: GLsizei, ptr: Ptr[Byte]): Unit = extern
  def glGetPointerv(pname: GLenum, params: Ptr[Ptr[Byte]]): Unit = extern
  def glArrayElement(i: GLint): Unit = extern
  def glDrawArrays(mode: GLenum, first: GLint, count: GLsizei): Unit = extern
  def glDrawElements(mode: GLenum, count: GLsizei, type_ : GLenum, indices: Ptr[Byte]): Unit = extern
  def glInterleavedArrays(format: GLenum, stride: GLsizei, pointer: Ptr[Byte]): Unit = extern

  /*
   * Lighting
   */
  def glShadeModel(mode: GLenum): Unit = extern
  def glLightf(light: GLenum, pname: GLenum, param: GLfloat): Unit = extern
  def glLighti(light: GLenum, pname: GLenum, param: GLint): Unit = extern
  def glLightfv(light: GLenum, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glLightiv(light: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGetLightfv(light: GLenum, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glGetLightiv(light: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glLightModelf(pname: GLenum, param: GLfloat): Unit = extern
  def glLightModeli(pname: GLenum, param: GLint): Unit = extern
  def glLightModelfv(pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glLightModeliv(pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glMaterialf(face: GLenum, pname: GLenum, param: GLfloat): Unit = extern
  def glMateriali(face: GLenum, pname: GLenum, param: GLint): Unit = extern
  def glMaterialfv(face: GLenum, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glMaterialiv(face: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGetMaterialfv(face: GLenum, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glGetMaterialiv(face: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glColorMaterial(face: GLenum, mode: GLenum): Unit = extern

  /*
   * Raster functions
   */
  def glPixelZoom(xfactor: GLfloat, yfactor: GLfloat): Unit = extern
  def glPixelStoref(pname: GLenum, param: GLfloat): Unit = extern
  def glPixelStorei(pname: GLenum, param: GLint): Unit = extern
  def glPixelTransferf(pname: GLenum, param: GLfloat): Unit = extern
  def glPixelTransferi(pname: GLenum, param: GLint): Unit = extern
  def glPixelMapfv(map: GLenum, mapsize: GLsizei, values: Ptr[GLfloat]): Unit = extern
  def glPixelMapuiv(map: GLenum, mapsize: GLsizei, values: Ptr[GLuint]): Unit = extern
  def glPixelMapusv(map: GLenum, mapsize: GLsizei, values: Ptr[GLushort]): Unit = extern
  def glGetPixelMapfv(map: GLenum, values: Ptr[GLfloat]): Unit = extern
  def glGetPixelMapuiv(map: GLenum, values: Ptr[GLuint]): Unit = extern
  def glGetPixelMapusv(map: GLenum, values: Ptr[GLushort]): Unit = extern
  def glBitmap(width: GLsizei, height: GLsizei, xorig: GLfloat, yorig: GLfloat,
               xmove: GLfloat, ymove: GLfloat, bitmap: Ptr[GLubyte]): Unit = extern
  def glReadPixels(x: GLint, y: GLint, width: GLsizei, height: GLsizei,
                   format: GLenum, type_ : GLenum, pixels: Ptr[Byte]): Unit = extern
  def glDrawPixels(width: GLsizei, height: GLsizei, format: GLenum, type_ : GLenum, pixels: Ptr[Byte]): Unit = extern
  def glCopyPixels(x: GLint, y: GLint, width: GLsizei, height: GLsizei, type_ : GLenum): Unit = extern

  /*
   * Stenciling
   */
  def glStencilFunc(func: GLenum, ref: GLint, mask: GLuint): Unit = extern
  def glStencilMask(mask: GLuint): Unit = extern
  def glStencilOp(fail: GLenum, zfail: GLenum, zpass: GLenum): Unit = extern
  def glClearStencil(s: GLint): Unit = extern

  /*
   * Texture mapping
   */
  def glTexGend(coord: GLenum, pname: GLenum, param: GLdouble): Unit = extern
  def glTexGenf(coord: GLenum, pname: GLenum, param: GLfloat): Unit = extern
  def glTexGeni(coord: GLenum, pname: GLenum, param: GLint): Unit = extern
  def glTexGendv(coord: GLenum, pname: GLenum, params: Ptr[GLdouble]): Unit = extern
  def glTexGenfv(coord: GLenum, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glTexGeniv(coord: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGetTexGendv(coord: GLenum, pname: GLenum, params: Ptr[GLdouble]): Unit = extern
  def glGetTexGenfv(coord: GLenum, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glGetTexGeniv(coord: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glTexEnvf(target: GLenum, pname: GLenum, param: GLfloat): Unit = extern
  def glTexEnvi(target: GLenum, pname: GLenum, param: GLint): Unit = extern
  def glTexEnvfv(target: GLenum, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glTexEnviv(target: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGetTexEnvfv(target: GLenum, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glGetTexEnviv(target: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glTexParameterf(target: GLenum, pname: GLenum, param: GLfloat): Unit = extern
  def glTexParameteri(target: GLenum, pname: GLenum, param: GLint): Unit = extern
  def glTexParameterfv(target: GLenum, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glTexParameteriv(target: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGetTexParameterfv(target: GLenum, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glGetTexParameteriv(target: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGetTexLevelParameterfv(target: GLenum, level: GLint, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glGetTexLevelParameteriv(target: GLenum, level: GLint, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glTexImage1D(target: GLenum, level: GLint, internalFormat: GLint, width: GLsizei,
                   border: GLint, format: GLenum, type_ : GLenum, pixels: Ptr[Byte]): Unit = extern
  def glTexImage2D(target: GLenum, level: GLint, internalFormat: GLint, width: GLsizei, height: GLsizei,
                   border: GLint, format: GLenum, type_ : GLenum, pixels: Ptr[Byte]): Unit = extern
  def glGetTexImage(target: GLenum, level: GLint, format: GLenum, type_ : GLenum, pixels: Ptr[Byte]): Unit = extern
  
  /* 1.1 functions */
  def glGenTextures(n: GLsizei, textures: Ptr[GLuint]): Unit = extern
  def glDeleteTextures(n: GLsizei, textures: Ptr[GLuint]): Unit = extern
  def glBindTexture(target: GLenum, texture: GLuint): Unit = extern
  def glPrioritizeTextures(n: GLsizei, textures: Ptr[GLuint], priorities: Ptr[GLclampf]): Unit = extern
  def glAreTexturesResident(n: GLsizei, textures: Ptr[GLuint], residences: Ptr[GLboolean]): GLboolean = extern
  def glIsTexture(texture: GLuint): GLboolean = extern
  def glTexSubImage1D(target: GLenum, level: GLint, xoffset: GLint, width: GLsizei,
                      format: GLenum, type_ : GLenum, pixels: Ptr[Byte]): Unit = extern
  def glTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, width: GLsizei,
                      height: GLsizei, format: GLenum, type_ : GLenum, pixels: Ptr[Byte]): Unit = extern
  def glCopyTexImage1D(target: GLenum, level: GLint, internalformat: GLenum,
                       x: GLint, y: GLint, width: GLsizei, border: GLint): Unit = extern
  def glCopyTexImage2D(target: GLenum, level: GLint, internalformat: GLenum, x: GLint, y: GLint,
                       width: GLsizei, height: GLsizei, border: GLint): Unit = extern
  def glCopyTexSubImage1D(target: GLenum, level: GLint, xoffset: GLint,
                          x: GLint, y: GLint, width: GLsizei): Unit = extern
  def glCopyTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint,
                          x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit = extern

  /*
   * Evaluators
   */
  def glMap1d(target: GLenum, u1: GLdouble, u2: GLdouble,
              stride: GLint, order: GLint, points: Ptr[GLdouble]): Unit = extern
  def glMap1f(target: GLenum, u1: GLfloat, u2: GLfloat,
              stride: GLint, order: GLint, points: Ptr[GLfloat]): Unit = extern
  def glMap2d(target: GLenum, u1: GLdouble, u2: GLdouble, ustride: GLint, uorder: GLint,
  		        v1: GLdouble, v2: GLdouble, vstride: GLint, vorder: GLint, points: Ptr[GLdouble]): Unit = extern
  def glMap2f(target: GLenum, u1: GLfloat, u2: GLfloat, ustride: GLint, uorder: GLint,
  		        v1: GLfloat, v2: GLfloat, vstride: GLint, vorder: GLint, points: Ptr[GLfloat]): Unit = extern
  def glGetMapdv(target: GLenum, query: GLenum, v: Ptr[GLdouble]): Unit = extern
  def glGetMapfv(target: GLenum, query: GLenum, v: Ptr[GLfloat]): Unit = extern
  def glGetMapiv(target: GLenum, query: GLenum, v: Ptr[GLint]): Unit = extern
  def glEvalCoord1d(u: GLdouble): Unit = extern
  def glEvalCoord1f(u: GLfloat): Unit = extern
  def glEvalCoord1dv(u: Ptr[GLdouble]): Unit = extern
  def glEvalCoord1fv(u: Ptr[GLfloat]): Unit = extern
  def glEvalCoord2d(u: GLdouble, v: GLdouble): Unit = extern
  def glEvalCoord2f(u: GLfloat, v: GLfloat): Unit = extern
  def glEvalCoord2dv(u: Ptr[GLdouble]): Unit = extern
  def glEvalCoord2fv(u: Ptr[GLfloat]): Unit = extern
  def glMapGrid1d(un: GLint, u1: GLdouble, u2: GLdouble): Unit = extern
  def glMapGrid1f(un: GLint, u1: GLfloat, u2: GLfloat): Unit = extern
  def glMapGrid2d(un: GLint, u1: GLdouble, u2: GLdouble, vn: GLint, v1: GLdouble, v2: GLdouble): Unit = extern
  def glMapGrid2f(un: GLint, u1: GLfloat, u2: GLfloat, vn: GLint, v1: GLfloat, v2: GLfloat): Unit = extern
  def glEvalPoint1(i: GLint): Unit = extern
  def glEvalPoint2(i: GLint, j: GLint): Unit = extern
  def glEvalMesh1(mode: GLenum, i1: GLint, i2: GLint): Unit = extern
  def glEvalMesh2(mode: GLenum, i1: GLint, i2: GLint, j1: GLint, j2: GLint): Unit = extern
  
  /*
   * Fog
   */
  def glFogf(pname: GLenum, param: GLfloat): Unit = extern
  def glFogi(pname: GLenum, param: GLint): Unit = extern
  def glFogfv(pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glFogiv(pname: GLenum, params: Ptr[GLint]): Unit = extern
  
  /*
   * Selection and Feedback
   */
  def glFeedbackBuffer(size: GLsizei, type_ : GLenum, buffer: Ptr[GLfloat]): Unit = extern
  def glPassThrough(token: GLfloat): Unit = extern
  def glSelectBuffer(size: GLsizei, buffer: Ptr[GLuint]): Unit = extern
  def glInitNames(): Unit = extern
  def glLoadName(name: GLuint): Unit = extern
  def glPushName(name: GLuint): Unit = extern
  def glPopName(): Unit = extern

  /*
   * OpenGL 1.2
   */
  def glDrawRangeElements(mode: GLenum, start: GLuint, end: GLuint, count: GLsizei, 
                          type_ : GLenum, indices: Ptr[Byte]): Unit = extern
  def glTexImage3D(target: GLenum, level: GLint, internalFormat: GLint, width: GLsizei, height: GLsizei,
                   depth: GLsizei, border: GLint, format: GLenum, type_ : GLenum, pixels: Ptr[Byte]): Unit = extern
  def glTexSubImage3D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, zoffset: GLint,
                      width: GLsizei, height: GLsizei, depth: GLsizei, format: GLenum,
                      type_ : GLenum, pixels: Ptr[Byte]): Unit = extern
  def glCopyTexSubImage3D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, zoffset: GLint,
                          x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit = extern
  type PFNGLDRAWRANGEELEMENTSPROC = CFunctionPtr6[GLenum, GLuint, GLuint, GLsizei, GLenum, Ptr[Byte], Unit]
  type PFNGLTEXIMAGE3DPROC = 
    CFunctionPtr10[GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, 
                   GLenum, GLenum, Ptr[Byte], Unit]
  type PFNGLTEXSUBIMAGE3DPROC = 
    CFunctionPtr11[GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, 
                   GLenum, GLenum, Ptr[Byte], Unit]
  type PFNGLCOPYTEXSUBIMAGE3DPROC =
    CFunctionPtr9[GLenum, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit]

  /*
   * GL_ARB_imaging
   */
  def glColorTable(target: GLenum, internalformat: GLenum, width: GLsizei, format: GLenum,
                   type_ : GLenum, table: Ptr[Byte]): Unit = extern
  def glColorSubTable(target: GLenum, start: GLsizei, count: GLsizei, format: GLenum,
                      type_ : GLenum, data: Ptr[Byte]): Unit = extern
  def glColorTableParameteriv(target: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glColorTableParameterfv(target: GLenum, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glCopyColorSubTable(target: GLenum, start: GLsizei, x: GLint, y: GLint, width: GLsizei): Unit = extern
  def glCopyColorTable(target: GLenum, internalformat: GLenum, x: GLint, y: GLint, width: GLsizei): Unit = extern
  def glGetColorTable(target: GLenum, format: GLenum, type_ : GLenum, table: Ptr[Byte]): Unit = extern
  def glGetColorTableParameterfv(target: GLenum, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glGetColorTableParameteriv(target: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glBlendEquation(mode: GLenum): Unit = extern
  def glBlendColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf): Unit = extern
  def glHistogram(target: GLenum, width: GLsizei, internalformat: GLenum, sink: GLboolean): Unit = extern
  def glResetHistogram(target: GLenum): Unit = extern
  def glGetHistogram(target: GLenum, reset: GLboolean, format: GLenum, type_ : GLenum,
                     values: Ptr[Byte]): Unit = extern
  def glGetHistogramParameterfv(target: GLenum, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glGetHistogramParameteriv(target: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glMinmax(target: GLenum, internalformat: GLenum, sink: GLboolean): Unit = extern
  def glResetMinmax(target: GLenum): Unit = extern
  def glGetMinmax(target: GLenum, reset: GLboolean, format: GLenum, types: GLenum, values: Ptr[Byte]): Unit = extern
  def glGetMinmaxParameterfv(target: GLenum, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glGetMinmaxParameteriv(target: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glConvolutionFilter1D(target: GLenum, internalformat: GLenum, width: GLsizei, format: GLenum,
                            type_ : GLenum, image: Ptr[Byte]): Unit = extern
  def glConvolutionFilter2D(target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei, format: GLenum,
  	                        type_ : GLenum, image: Ptr[Byte]): Unit = extern
  def glConvolutionParameterf(target: GLenum, pname: GLenum, params: GLfloat): Unit = extern
  def glConvolutionParameterfv(target: GLenum, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glConvolutionParameteri(target: GLenum, pname: GLenum, params: GLint): Unit = extern
  def glConvolutionParameteriv(target: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glCopyConvolutionFilter1D(target: GLenum, internalformat: GLenum, x: GLint, y: GLint, width: GLsizei): Unit = extern
  def glCopyConvolutionFilter2D(target: GLenum, internalformat: GLenum, x: GLint, y: GLint,
                                width: GLsizei, height: GLsizei): Unit = extern
  def glGetConvolutionFilter(target: GLenum, format: GLenum, type_ : GLenum, image: Ptr[Byte]): Unit = extern
  def glGetConvolutionParameterfv(target: GLenum, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glGetConvolutionParameteriv(target: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glSeparableFilter2D(target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei, 
                          format: GLenum, type_ : GLenum, row: Ptr[Byte], volumn: Ptr[Byte]): Unit = extern
  def glGetSeparableFilter(target: GLenum, format: GLenum, type_ : GLenum,
                           row: Ptr[Byte], column: Ptr[Byte]): Unit = extern
  
  /*
   * OpenGL 1.3
   */
  def glActiveTexture(texture: GLenum): Unit = extern
  def glClientActiveTexture(texture: GLenum): Unit = extern
  def glCompressedTexImage1D(target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei,
                             border: GLint, imageSize: GLsizei, data: Ptr[Byte]): Unit = extern
  def glCompressedTexImage2D(target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei, height: GLsizei,
                             border: GLint, imageSize: GLsizei, data: Ptr[Byte]): Unit = extern
  def glCompressedTexImage3D(target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei, height: GLsizei,
                             depth: GLsizei, border: GLint, imageSize: GLsizei, data: Ptr[Byte]): Unit = extern
  def glCompressedTexSubImage1D(target: GLenum, level: GLint, xoffset: GLint, width: GLsizei, format: GLenum,
                                imageSize: GLsizei, data: Ptr[Byte]): Unit = extern
  def glCompressedTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, width: GLsizei, height: GLsizei,
                                format: GLenum, imageSize: GLsizei, data: Ptr[Byte]): Unit = extern
  def glCompressedTexSubImage3D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, zoffset: GLint,
                                width: GLsizei, height: GLsizei, depth: GLsizei, format: GLenum, 
                                imageSize: GLsizei, data: Ptr[Byte]): Unit = extern
  def glGetCompressedTexImage(target: GLenum, lod: GLint, img: Ptr[Byte]): Unit = extern
  def glMultiTexCoord1d(target: GLenum, s: GLdouble): Unit = extern
  def glMultiTexCoord1dv(target: GLenum, v: Ptr[GLdouble]): Unit = extern
  def glMultiTexCoord1f(target: GLenum, s: GLfloat): Unit = extern
  def glMultiTexCoord1fv(target: GLenum, v: Ptr[GLfloat]): Unit = extern
  def glMultiTexCoord1i(target: GLenum, s: GLint): Unit = extern
  def glMultiTexCoord1iv(target: GLenum, v: Ptr[GLint]): Unit = extern
  def glMultiTexCoord1s(target: GLenum, s: GLshort): Unit = extern
  def glMultiTexCoord1sv(target: GLenum, v: Ptr[GLshort]): Unit = extern
  def glMultiTexCoord2d(target: GLenum, s: GLdouble, t: GLdouble): Unit = extern
  def glMultiTexCoord2dv(target: GLenum, v: Ptr[GLdouble]): Unit = extern
  def glMultiTexCoord2f(target: GLenum, s: GLfloat, t: GLfloat): Unit = extern
  def glMultiTexCoord2fv(target: GLenum, v: Ptr[GLfloat]): Unit = extern
  def glMultiTexCoord2i(target: GLenum, s: GLint, t: GLint): Unit = extern
  def glMultiTexCoord2iv(target: GLenum, v: Ptr[GLint]): Unit = extern
  def glMultiTexCoord2s(target: GLenum, s: GLshort, t: GLshort): Unit = extern
  def glMultiTexCoord2sv(target: GLenum, v: Ptr[GLshort]): Unit = extern
  def glMultiTexCoord3d(target: GLenum, s: GLdouble, t: GLdouble, r: GLdouble): Unit = extern
  def glMultiTexCoord3dv(target: GLenum, v: Ptr[GLdouble]): Unit = extern
  def glMultiTexCoord3f(target: GLenum, s: GLfloat, t: GLfloat, r: GLfloat): Unit = extern
  def glMultiTexCoord3fv(target: GLenum, v: Ptr[GLfloat]): Unit = extern
  def glMultiTexCoord3i(target: GLenum, s: GLint, t: GLint, r: GLint): Unit = extern
  def glMultiTexCoord3iv(target: GLenum, v: Ptr[GLint]): Unit = extern
  def glMultiTexCoord3s(target: GLenum, s: GLshort, t: GLshort, r: GLshort): Unit = extern
  def glMultiTexCoord3sv(target: GLenum, v: Ptr[GLshort]): Unit = extern
  def glMultiTexCoord4d(target: GLenum, s: GLdouble, t: GLdouble, r: GLdouble, q: GLdouble): Unit = extern
  def glMultiTexCoord4dv(target: GLenum, v: Ptr[GLdouble]): Unit = extern
  def glMultiTexCoord4f(target: GLenum, s: GLfloat, t: GLfloat, r: GLfloat, q: GLfloat): Unit = extern
  def glMultiTexCoord4fv(target: GLenum, v: Ptr[GLfloat]): Unit = extern
  def glMultiTexCoord4i(target: GLenum, s: GLint, t: GLint, r: GLint, q: GLint): Unit = extern
  def glMultiTexCoord4iv(target: GLenum, v: Ptr[GLint]): Unit = extern
  def glMultiTexCoord4s(target: GLenum, s: GLshort, t: GLshort, r: GLshort, q: GLshort): Unit = extern
  def glMultiTexCoord4sv(target: GLenum, v: Ptr[GLshort]): Unit = extern

  def glLoadTransposeMatrixd(m: CArray[GLdouble, _16]): Unit = extern
  def glLoadTransposeMatrixf(m: CArray[GLfloat, _16]): Unit = extern
  def glMultTransposeMatrixd(m: CArray[GLdouble, _16]): Unit = extern
  def glMultTransposeMatrixf(m: CArray[GLfloat, _16]): Unit = extern
  def glSampleCoverage(value: GLclampf, invert: GLboolean): Unit = extern

  type PFNGLACTIVETEXTUREPROC = CFunctionPtr1[GLenum, Unit]
  type PFNGLSAMPLECOVERAGEPROC = CFunctionPtr2[GLclampf, GLboolean, Unit]
  type PFNGLCOMPRESSEDTEXIMAGE3DPROC =
    CFunctionPtr9[GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLsizei, Ptr[Byte], Unit]
  type PFNGLCOMPRESSEDTEXIMAGE2DPROC = 
    CFunctionPtr8[GLenum, GLint, GLenum, GLsizei, GLsizei, GLint, GLsizei, Ptr[Byte], Unit]
  type PFNGLCOMPRESSEDTEXIMAGE1DPROC = 
    CFunctionPtr7[GLenum, GLint, GLenum, GLsizei, GLint, GLsizei, Ptr[Byte], Unit]
  type PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC =
    CFunctionPtr11[GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]
  type PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC =
    CFunctionPtr9[GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]
  type PFNGLCOMPRESSEDTEXSUBIMAGE1DPROC =
    CFunctionPtr7[GLenum, GLint, GLint, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]
  type PFNGLGETCOMPRESSEDTEXIMAGEPROC = CFunctionPtr3[GLenum, GLint, Ptr[Byte], Unit]

  /*
   * OpenGL 1.2.1 ARB extension
   */
  def glActiveTextureARB(texture: GLenum): Unit = extern
  def glClientActiveTextureARB(texture: GLenum): Unit = extern
  def glMultiTexCoord1dARB(target: GLenum, s: GLdouble): Unit = extern
  def glMultiTexCoord1dvARB(target: GLenum, v: Ptr[GLdouble]): Unit = extern
  def glMultiTexCoord1fARB(target: GLenum, s: GLfloat): Unit = extern
  def glMultiTexCoord1fvARB(target: GLenum, v: Ptr[GLfloat]): Unit = extern
  def glMultiTexCoord1iARB(target: GLenum, s: GLint): Unit = extern
  def glMultiTexCoord1ivARB(target: GLenum, v: Ptr[GLint]): Unit = extern
  def glMultiTexCoord1sARB(target: GLenum, s: GLshort): Unit = extern
  def glMultiTexCoord1svARB(target: GLenum, v: Ptr[GLfloat]): Unit = extern
  def glMultiTexCoord2dARB(target: GLenum, s: GLdouble, t: GLdouble): Unit = extern
  def glMultiTexCoord2dvARB(target: GLenum, v: Ptr[GLdouble]): Unit = extern
  def glMultiTexCoord2fARB(target: GLenum, s: GLfloat, t: GLfloat): Unit = extern
  def glMultiTexCoord2fvARB(target: GLenum, v: Ptr[GLfloat]): Unit = extern
  def glMultiTexCoord2iARB(target: GLenum, s: GLint, t: GLint): Unit = extern
  def glMultiTexCoord2ivARB(target: GLenum, v: Ptr[GLint]): Unit = extern
  def glMultiTexCoord2sARB(target: GLenum, s: GLshort, t: GLshort): Unit = extern
  def glMultiTexCoord2svARB(target: GLenum, v: Ptr[GLshort]): Unit = extern
  def glMultiTexCoord3dARB(target: GLenum, s: GLdouble, t: GLdouble, r: GLdouble): Unit = extern
  def glMultiTexCoord3dvARB(target: GLenum, v: Ptr[GLdouble]): Unit = extern
  def glMultiTexCoord3fARB(target: GLenum, s: GLfloat, t: GLfloat, r: GLfloat): Unit = extern
  def glMultiTexCoord3fvARB(target: GLenum, v: Ptr[GLfloat]): Unit = extern
  def glMultiTexCoord3iARB(target: GLenum, s: GLint, t: GLint, r: GLint): Unit = extern
  def glMultiTexCoord3ivARB(target: GLenum, v: Ptr[GLint]): Unit = extern
  def glMultiTexCoord3sARB(target: GLenum, s: GLshort, t: GLshort, r: GLshort): Unit = extern
  def glMultiTexCoord3svARB(target: GLenum, v: Ptr[GLshort]): Unit = extern
  def glMultiTexCoord4dARB(target: GLenum, s: GLdouble, t: GLdouble, r: GLdouble, q: GLdouble): Unit = extern
  def glMultiTexCoord4dvARB(target: GLenum, v: Ptr[GLdouble]): Unit = extern
  def glMultiTexCoord4fARB(target: GLenum, s: GLfloat, t: GLfloat, r: GLfloat, q: GLfloat): Unit = extern
  def glMultiTexCoord4fvARB(target: GLenum, v: Ptr[GLfloat]): Unit = extern
  def glMultiTexCoord4iARB(target: GLenum, s: GLint, t: GLint, r: GLint, q: GLint): Unit = extern
  def glMultiTexCoord4ivARB(target: GLenum, v: Ptr[GLint]): Unit = extern
  def glMultiTexCoord4sARB(target: GLenum, s: GLshort, t: GLshort, r: GLshort, q: GLshort): Unit = extern
  def glMultiTexCoord4svARB(target: GLenum, v: Ptr[GLshort]): Unit = extern

  type PFNGLACTIVETEXTUREARBPROC = CFunctionPtr1[GLenum, Unit]
  type PFNGLCLIENTACTIVETEXTUREARBPROC = CFunctionPtr1[GLenum, Unit]
  type PFNGLMULTITEXCOORD1DARBPROC = CFunctionPtr2[GLenum, GLdouble, Unit]
  type PFNGLMULTITEXCOORD1DVARBPROC = CFunctionPtr2[GLenum, Ptr[GLdouble], Unit]
  type PFNGLMULTITEXCOORD1FARBPROC = CFunctionPtr2[GLenum, GLfloat, Unit]
  type PFNGLMULTITEXCOORD1FVARBPROC = CFunctionPtr2[GLenum, Ptr[GLfloat], Unit]
  type PFNGLMULTITEXCOORD1IARBPROC = CFunctionPtr2[GLenum, GLint, Unit]
  type PFNGLMULTITEXCOORD1IVARBPROC = CFunctionPtr2[GLenum, Ptr[GLint], Unit]
  type PFNGLMULTITEXCOORD1SARBPROC = CFunctionPtr2[GLenum, GLshort, Unit]
  type PFNGLMULTITEXCOORD1SVARBPROC = CFunctionPtr2[GLenum, Ptr[GLshort], Unit]
  type PFNGLMULTITEXCOORD2DARBPROC = CFunctionPtr3[GLenum, GLdouble, GLdouble, Unit]
  type PFNGLMULTITEXCOORD2DVARBPROC = CFunctionPtr2[GLenum, Ptr[GLdouble], Unit]
  type PFNGLMULTITEXCOORD2FARBPROC = CFunctionPtr3[GLenum, GLfloat, GLfloat, Unit]
  type PFNGLMULTITEXCOORD2FVARBPROC = CFunctionPtr2[GLenum, Ptr[GLfloat], Unit]
  type PFNGLMULTITEXCOORD2IARBPROC = CFunctionPtr3[GLenum, GLint, GLint, Unit]
  type PFNGLMULTITEXCOORD2IVARBPROC = CFunctionPtr2[GLenum, Ptr[GLint], Unit]
  type PFNGLMULTITEXCOORD2SARBPROC = CFunctionPtr3[GLenum, GLshort, GLshort, Unit]
  type PFNGLMULTITEXCOORD2SVARBPROC = CFunctionPtr2[GLenum, Ptr[GLshort], Unit]
  type PFNGLMULTITEXCOORD3DARBPROC = CFunctionPtr4[GLenum, GLdouble, GLdouble, GLdouble, Unit]
  type PFNGLMULTITEXCOORD3DVARBPROC = CFunctionPtr2[GLenum, Ptr[GLdouble], Unit]
  type PFNGLMULTITEXCOORD3FARBPROC = CFunctionPtr4[GLenum, GLfloat, GLfloat, GLfloat, Unit]
  type PFNGLMULTITEXCOORD3FVARBPROC = CFunctionPtr2[GLenum, Ptr[GLfloat], Unit]
  type PFNGLMULTITEXCOORD3IARBPROC = CFunctionPtr4[GLenum, GLint, GLint, GLint, Unit]
  type PFNGLMULTITEXCOORD3IVARBPROC = CFunctionPtr2[GLenum, Ptr[GLint], Unit]
  type PFNGLMULTITEXCOORD3SARBPROC = CFunctionPtr4[GLenum, GLshort, GLshort, GLshort, Unit]
  type PFNGLMULTITEXCOORD3SVARBPROC = CFunctionPtr2[GLenum, Ptr[GLshort], Unit]
  type PFNGLMULTITEXCOORD4DARBPROC = CFunctionPtr5[GLenum, GLdouble, GLdouble, GLdouble, GLdouble, Unit]
  type PFNGLMULTITEXCOORD4DVARBPROC = CFunctionPtr2[GLenum, Ptr[GLdouble], Unit]
  type PFNGLMULTITEXCOORD4FARBPROC = CFunctionPtr5[GLenum, GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  type PFNGLMULTITEXCOORD4FVARBPROC = CFunctionPtr2[GLenum, Ptr[GLfloat], Unit]
  type PFNGLMULTITEXCOORD4IARBPROC = CFunctionPtr5[GLenum, GLint, GLint, GLint, GLint, Unit]
  type PFNGLMULTITEXCOORD4IVARBPROC = CFunctionPtr2[GLenum, Ptr[GLint], Unit]
  type PFNGLMULTITEXCOORD4SARBPROC = CFunctionPtr5[GLenum, GLshort, GLshort, GLshort, GLshort, Unit]
  type PFNGLMULTITEXCOORD4SVARBPROC = CFunctionPtr2[GLenum, Ptr[GLshort], Unit]

  /*
   * OpenGL 1.4
   */
  type PFNGLBLENDFUNCSEPARATEPROC = CFunctionPtr4[GLenum, GLenum, GLenum, GLenum, Unit]
  type PFNGLMULTIDRAWARRAYSPROC = CFunctionPtr4[GLenum, Ptr[GLint], Ptr[GLsizei], GLsizei, Unit]
  type PFNGLMULTIDRAWELEMENTSPROC = CFunctionPtr5[GLenum, Ptr[GLsizei], GLenum, Ptr[Ptr[Byte]], GLsizei, Unit]
  type PFNGLPOINTPARAMETERFPROC = CFunctionPtr2[GLenum, GLfloat, Unit]
  type PFNGLPOINTPARAMETERFVPROC = CFunctionPtr2[GLenum, Ptr[GLfloat], Unit]
  type PFNGLPOINTPARAMETERIPROC = CFunctionPtr2[GLenum, GLint, Unit]
  type PFNGLPOINTPARAMETERIVPROC = CFunctionPtr2[GLenum, Ptr[GLint], Unit]
  type PFNGLFOGCOORDFPROC = CFunctionPtr1[GLfloat, Unit]
  type PFNGLFOGCOORDFVPROC = CFunctionPtr1[Ptr[GLfloat], Unit]
  type PFNGLFOGCOORDDPROC = CFunctionPtr1[GLdouble, Unit]
  type PFNGLFOGCOORDDVPROC = CFunctionPtr1[Ptr[GLdouble], Unit]
  type PFNGLFOGCOORDPOINTERPROC = CFunctionPtr3[GLenum, GLsizei, Ptr[Byte], Unit]
  type PFNGLSECONDARYCOLOR3BPROC = CFunctionPtr3[GLbyte, GLbyte, GLbyte, Unit]
  type PFNGLSECONDARYCOLOR3BVPROC = CFunctionPtr1[Ptr[GLbyte], Unit]
  type PFNGLSECONDARYCOLOR3DPROC = CFunctionPtr3[GLdouble, GLdouble, GLdouble, Unit]
  type PFNGLSECONDARYCOLOR3DVPROC = CFunctionPtr1[Ptr[GLdouble], Unit]
  type PFNGLSECONDARYCOLOR3FPROC = CFunctionPtr3[GLfloat, GLfloat, GLfloat, Unit]
  type PFNGLSECONDARYCOLOR3FVPROC = CFunctionPtr1[Ptr[GLfloat], Unit]
  type PFNGLSECONDARYCOLOR3IPROC = CFunctionPtr3[GLint, GLint, GLint, Unit]
  type PFNGLSECONDARYCOLOR3IVPROC = CFunctionPtr1[Ptr[GLint], Unit]
  type PFNGLSECONDARYCOLOR3SPROC = CFunctionPtr3[GLshort, GLshort, GLshort, Unit]
  type PFNGLSECONDARYCOLOR3SVPROC = CFunctionPtr1[Ptr[GLshort], Unit]
  type PFNGLSECONDARYCOLOR3UBPROC = CFunctionPtr3[GLubyte, GLubyte, GLubyte, Unit]
  type PFNGLSECONDARYCOLOR3UBVPROC = CFunctionPtr1[Ptr[GLubyte], Unit]
  type PFNGLSECONDARYCOLOR3UIPROC = CFunctionPtr3[GLuint, GLuint, GLuint, Unit]
  type PFNGLSECONDARYCOLOR3UIVPROC = CFunctionPtr1[Ptr[GLuint], Unit]
  type PFNGLSECONDARYCOLOR3USPROC = CFunctionPtr3[GLushort, GLushort, GLushort, Unit]
  type PFNGLSECONDARYCOLOR3USVPROC = CFunctionPtr1[Ptr[GLushort], Unit]
  type PFNGLSECONDARYCOLORPOINTERPROC = CFunctionPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit]
  type PFNGLWINDOWPOS2DPROC = CFunctionPtr2[GLdouble, GLdouble, Unit]
  type PFNGLWINDOWPOS2DVPROC = CFunctionPtr1[Ptr[GLdouble], Unit]
  type PFNGLWINDOWPOS2FPROC = CFunctionPtr2[GLfloat, GLfloat, Unit]
  type PFNGLWINDOWPOS2FVPROC = CFunctionPtr1[Ptr[GLfloat], Unit]
  type PFNGLWINDOWPOS2IPROC = CFunctionPtr2[GLint, GLint, Unit]
  type PFNGLWINDOWPOS2IVPROC = CFunctionPtr1[Ptr[GLint], Unit]
  type PFNGLWINDOWPOS2SPROC = CFunctionPtr2[GLshort, GLshort, Unit]
  type PFNGLWINDOWPOS2SVPROC = CFunctionPtr1[Ptr[GLshort], Unit]
  type PFNGLWINDOWPOS3DPROC = CFunctionPtr3[GLdouble, GLdouble, GLdouble, Unit]
  type PFNGLWINDOWPOS3DVPROC = CFunctionPtr1[Ptr[GLdouble], Unit]
  type PFNGLWINDOWPOS3FPROC = CFunctionPtr3[GLfloat, GLfloat, GLfloat, Unit]
  type PFNGLWINDOWPOS3FVPROC = CFunctionPtr1[Ptr[GLfloat], Unit]
  type PFNGLWINDOWPOS3IPROC = CFunctionPtr3[GLint, GLint, GLint, Unit]
  type PFNGLWINDOWPOS3IVPROC = CFunctionPtr1[Ptr[GLint], Unit]
  type PFNGLWINDOWPOS3SPROC = CFunctionPtr3[GLshort, GLshort, GLshort, Unit]
  type PFNGLWINDOWPOS3SVPROC = CFunctionPtr1[Ptr[GLshort], Unit]
  type PFNGLBLENDCOLORPROC = CFunctionPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  type PFNGLBLENDEQUATIONPROC = CFunctionPtr1[GLenum, Unit]

  def glBlendFuncSeparate(sfactorRGB: GLenum, dfactorRGB: GLenum, sfactorAlpha: GLenum, dfactorAlpha: GLenum): Unit = extern
  def glMultiDrawArrays(mode: GLenum, first: Ptr[GLint], count: Ptr[GLsizei], drawcount: GLsizei): Unit = extern
  def glMultiDrawElements(mode: GLenum, count: Ptr[GLsizei], type_ : GLenum, indices: Ptr[Ptr[Byte]], drawcount: GLsizei): Unit = extern
  def glPointParameterf(pname: GLenum, param: GLfloat): Unit = extern
  def glPointParameterfv(pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glPointParameteri(pname: GLenum, param: GLint): Unit = extern
  def glPointParameteriv(pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glFogCoordf(coord: GLfloat): Unit = extern
  def glFogCoordfv(coord: Ptr[GLfloat]): Unit = extern
  def glFogCoordd(coord: Ptr[GLdouble]): Unit = extern
  def glFogCoorddv(coord: Ptr[GLdouble]): Unit = extern
  def glFogCoordPointer(type_ : GLenum, stride: GLsizei, pointer: Ptr[Byte]): Unit = extern
  def glSecondaryColor3b(red: GLbyte, green: GLbyte, blue: GLbyte): Unit = extern
  def glSecondaryColor3bv(v: Ptr[GLbyte]): Unit = extern
  def glSecondaryColor3d(red: GLdouble, green: GLdouble, blue: GLdouble): Unit = extern
  def glSecondaryColor3dv(v: Ptr[GLdouble]): Unit = extern
  def glSecondaryColor3f(red: GLfloat, green: GLfloat, blue: GLfloat): Unit = extern
  def glSecondaryColor3fv(v: Ptr[GLfloat]): Unit = extern
  def glSecondaryColor3i(red: GLint, green: GLint, blue: GLint): Unit = extern
  def glSecondaryColor3iv(v: Ptr[GLint]): Unit = extern
  def glSecondaryColor3s(red: GLshort, green: GLshort, blue: GLshort): Unit = extern
  def glSecondaryColor3sv(v: Ptr[GLshort]): Unit = extern
  def glSecondaryColor3ub(red: GLubyte, green: GLubyte, blue: GLubyte): Unit = extern
  def glSecondaryColor3ubv(v: Ptr[GLubyte]): Unit = extern
  def glSecondaryColor3ui(red: GLuint, green: GLuint, blue: GLuint): Unit = extern
  def glSecondaryColor3uiv(v: Ptr[GLuint]): Unit = extern
  def glSecondaryColor3us(red: GLushort, green: GLushort, blue: GLushort): Unit = extern
  def glSecondaryColor3usv(v: Ptr[GLushort]): Unit = extern
  def glSecondaryColorPointer(size: GLint, type_ : GLenum, stride: GLsizei, pointer: Ptr[Byte]): Unit = extern
  def glWindowPos2d(x: GLdouble, y: GLdouble): Unit = extern
  def glWindowPos2dv(v: Ptr[GLdouble]): Unit = extern
  def glWindowPos2f(x: GLfloat, y: GLfloat): Unit = extern
  def glWindowPos2fv(v: Ptr[GLfloat]): Unit = extern
  def glWindowPos2i(x: GLint, y: GLint): Unit = extern
  def glWindowPos2iv(v: Ptr[GLint]): Unit = extern
  def glWindowPos2s(x: GLshort, y: GLshort): Unit = extern
  def glWindowPos2sv(v: Ptr[GLshort]): Unit = extern
  def glWindowPos3d(x: GLdouble, y: GLdouble, z: GLdouble): Unit = extern
  def glWindowPos3dv(v: Ptr[GLdouble]): Unit = extern
  def glWindowPos3f(x: GLfloat, y: GLfloat, z: GLfloat): Unit = extern
  def glWindowPos3fv(v: Ptr[GLfloat]): Unit = extern
  def glWindowPos3i(x: GLint, y: GLint, z: GLint): Unit = extern
  def glWindowPos3iv(v: Ptr[GLint]): Unit = extern
  def glWindowPos3s(x: GLshort, y: GLshort, z: GLshort): Unit = extern
  def glWindowPos3sv(v: Ptr[GLshort]): Unit = extern
  /*
   * End OpenGL 1.4
   */

  /*
   * OpenGL 1.5
   */
  type PFNGLGENQUERIESPROC = CFunctionPtr2[GLsizei, Ptr[GLuint], Unit]
  type PFNGLDELETEQUERIESPROC = CFunctionPtr2[GLsizei, Ptr[GLuint], Unit]
  type PFNGLISQUERYPROC = CFunctionPtr1[GLuint, GLboolean]
  type PFNGLBEGINQUERYPROC = CFunctionPtr2[GLenum, GLuint, Unit]
  type PFNGLENDQUERYPROC = CFunctionPtr1[GLenum, Unit]
  type PFNGLGETQUERYIVPROC = CFunctionPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  type PFNGLGETQUERYOBJECTIVPROC = CFunctionPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  type PFNGLGETQUERYOBJECTUIVPROC = CFunctionPtr3[GLuint, GLenum, Ptr[GLuint], Unit]
  type PFNGLBINDBUFFERPROC = CFunctionPtr2[GLenum, GLuint, Unit]
  type PFNGLDELETEBUFFERSPROC = CFunctionPtr2[GLsizei, Ptr[GLuint], Unit]
  type PFNGLGENBUFFERSPROC = CFunctionPtr2[GLsizei, Ptr[GLuint], Unit]
  type PFNGLISBUFFERPROC = CFunctionPtr1[GLuint, GLboolean]
  type PFNGLBUFFERDATAPROC = CFunctionPtr4[GLenum, GLsizeiptr, Ptr[Byte], GLenum, Unit]
  type PFNGLBUFFERSUBDATAPROC = CFunctionPtr4[GLenum, GLintptr, GLsizeiptr, Ptr[Byte], Unit]
  type PFNGLGETBUFFERSUBDATAPROC = CFunctionPtr4[GLenum, GLintptr, GLsizeiptr, Ptr[Byte], Unit]
  type PFNGLMAPBUFFERPROC = CFunctionPtr2[GLenum, GLenum, Unit]
  type PFNGLUNMAPBUFFERPROC = CFunctionPtr1[GLenum, GLboolean]
  type PFNGLGETBUFFERPARAMETERIVPROC = CFunctionPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  type PFNGLGETBUFFERPOINTERVPROC = CFunctionPtr3[GLenum, GLenum, Ptr[Ptr[Byte]], Unit]

  def glGenQueries(n: GLsizei, ids: Ptr[GLuint]): Unit = extern
  def glDeleteQueries(n: GLsizei, ids: Ptr[GLuint]): Unit = extern
  def glIsQuery(id: GLuint): GLboolean = extern
  def glBeginQuery(target: GLenum, id: GLuint): Unit = extern
  def glEndQuery(target: GLenum): Unit = extern
  def glGetQueryiv(target: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGetQueryObjectiv(id: GLuint, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGetQueryObjectuiv(id: GLuint, pname: GLenum, params: Ptr[GLuint]): Unit = extern
  def glBindBuffer(target: GLenum, buffer: GLuint): Unit = extern
  def glDeleteBuffers(n: GLsizei, buffers: Ptr[GLuint]): Unit = extern
  def glGenBuffers(n: GLsizei, buffers: Ptr[GLuint]): Unit = extern
  def glIsBuffer(buffer: GLuint): GLboolean  = extern
  def glBufferData(target: GLenum, size: GLsizeiptr, data: Ptr[Byte], usage: GLenum): Unit = extern
  def glBufferSubData(target: GLenum, offset: GLintptr, size: GLsizeiptr, data: Ptr[Byte]): Unit = extern
  def glGetBufferSubData(target: GLenum, offset: GLintptr, size: GLsizeiptr, data: Ptr[Byte]): Unit = extern
  def glMapBuffer(target: GLenum, access: GLenum): Unit = extern
  def glUnmapBuffer(target: GLenum): GLboolean = extern
  def glGetBufferParameteriv(target: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGetBufferPointerv(target: GLenum, pname: GLenum, params: Ptr[Ptr[Byte]]): Unit = extern
  /*
   * End OpenGL 1.5
   */

  /*
   * OpenGL 2.0
   */
  type PFNGLBLENDEQUATIONSEPARATEPROC = CFunctionPtr2[GLenum, GLenum, Unit]
  type PFNGLDRAWBUFFERSPROC = CFunctionPtr2[GLsizei, Ptr[GLenum], Unit]
  type PFNGLSTENCILOPSEPARATEPROC = CFunctionPtr4[GLenum, GLenum, GLenum, GLenum, Unit]
  type PFNGLSTENCILFUNCSEPARATEPROC = CFunctionPtr4[GLenum, GLenum, GLint, GLuint, Unit]
  type PFNGLSTENCILMASKSEPARATEPROC = CFunctionPtr2[GLenum, GLuint, Unit]
  type PFNGLATTACHSHADERPROC = CFunctionPtr2[GLuint, GLuint, Unit]
  type PFNGLBINDATTRIBLOCATIONPROC = CFunctionPtr3[GLuint, GLuint, Ptr[GLchar], Unit]
  type PFNGLCOMPILESHADERPROC = CFunctionPtr1[GLuint, Unit]
  type PFNGLCREATEPROGRAMPROC = CFunctionPtr0[GLuint]
  type PFNGLCREATESHADERPROC = CFunctionPtr1[GLenum, GLuint]
  type PFNGLDELETEPROGRAMPROC = CFunctionPtr1[GLuint, Unit]
  type PFNGLDELETESHADERPROC = CFunctionPtr1[GLuint, Unit]
  type PFNGLDETACHSHADERPROC = CFunctionPtr2[GLuint, GLuint, Unit]
  type PFNGLDISABLEVERTEXATTRIBARRAYPROC = CFunctionPtr1[GLuint, Unit]
  type PFNGLENABLEVERTEXATTRIBARRAYPROC = CFunctionPtr1[GLuint, Unit]
  type PFNGLGETACTIVEATTRIBPROC = CFunctionPtr7[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLint], Ptr[GLenum], Ptr[GLchar], Unit]
  type PFNGLGETACTIVEUNIFORMPROC = CFunctionPtr7[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLint], Ptr[GLenum], Ptr[GLchar], Unit]
  type PFNGLGETATTACHEDSHADERSPROC = CFunctionPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLuint], Unit]
  type PFNGLGETATTRIBLOCATIONPROC = CFunctionPtr2[GLuint, Ptr[GLchar], GLint]
  type PFNGLGETPROGRAMIVPROC = CFunctionPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  type PFNGLGETPROGRAMINFOLOGPROC = CFunctionPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
  type PFNGLGETSHADERIVPROC = CFunctionPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  type PFNGLGETSHADERINFOLOGPROC = CFunctionPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
  type PFNGLGETSHADERSOURCEPROC = CFunctionPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
  type PFNGLGETUNIFORMLOCATIONPROC = CFunctionPtr2[GLuint, Ptr[GLchar], GLint]
  type PFNGLGETUNIFORMFVPROC = CFunctionPtr3[GLuint, GLint, Ptr[GLfloat], Unit]
  type PFNGLGETUNIFORMIVPROC = CFunctionPtr3[GLuint, GLint, Ptr[GLint], Unit]
  type PFNGLGETVERTEXATTRIBDVPROC = CFunctionPtr3[GLuint, GLenum, Ptr[GLdouble], Unit]
  type PFNGLGETVERTEXATTRIBFVPROC = CFunctionPtr3[GLuint, GLenum, Ptr[GLfloat], Unit]
  type PFNGLGETVERTEXATTRIBIVPROC = CFunctionPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  type PFNGLGETVERTEXATTRIBPOINTERVPROC = CFunctionPtr3[GLuint, GLenum, Ptr[Ptr[Byte]], Unit]
  type PFNGLISPROGRAMPROC = CFunctionPtr1[GLuint, GLboolean]
  type PFNGLISSHADERPROC = CFunctionPtr1[GLuint, GLboolean]
  type PFNGLLINKPROGRAMPROC = CFunctionPtr1[GLuint, Unit]
  type PFNGLSHADERSOURCEPROC = CFunctionPtr4[GLuint, GLsizei, Ptr[Ptr[GLchar]], Ptr[GLint], Unit]
  type PFNGLUSEPROGRAMPROC = CFunctionPtr1[GLuint, Unit]
  type PFNGLUNIFORM1FPROC = CFunctionPtr2[GLint, GLfloat, Unit]
  type PFNGLUNIFORM2FPROC = CFunctionPtr3[GLint, GLfloat, GLfloat, Unit]
  type PFNGLUNIFORM3FPROC = CFunctionPtr4[GLint, GLfloat, GLfloat, GLfloat, Unit]
  type PFNGLUNIFORM4FPROC = CFunctionPtr5[GLint, GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  type PFNGLUNIFORM1IPROC = CFunctionPtr2[GLint, GLint, Unit]
  type PFNGLUNIFORM2IPROC = CFunctionPtr3[GLint, GLint, GLint, Unit]
  type PFNGLUNIFORM3IPROC = CFunctionPtr4[GLint, GLint, GLint, GLint, Unit]
  type PFNGLUNIFORM4IPROC = CFunctionPtr5[GLint, GLint, GLint, GLint, GLint, Unit]
  type PFNGLUNIFORM1FVPROC = CFunctionPtr3[GLint, GLsizei, Ptr[GLfloat], Unit]
  type PFNGLUNIFORM2FVPROC = CFunctionPtr3[GLint, GLsizei, Ptr[GLfloat], Unit]
  type PFNGLUNIFORM3FVPROC = CFunctionPtr3[GLint, GLsizei, Ptr[GLfloat], Unit]
  type PFNGLUNIFORM4FVPROC = CFunctionPtr3[GLint, GLsizei, Ptr[GLfloat], Unit]
  type PFNGLUNIFORM1IVPROC = CFunctionPtr3[GLint, GLsizei, Ptr[GLint], Unit]
  type PFNGLUNIFORM2IVPROC = CFunctionPtr3[GLint, GLsizei, Ptr[GLint], Unit]
  type PFNGLUNIFORM3IVPROC = CFunctionPtr3[GLint, GLsizei, Ptr[GLint], Unit]
  type PFNGLUNIFORM4IVPROC = CFunctionPtr3[GLint, GLsizei, Ptr[GLint], Unit]
  type PFNGLUNIFORMMATRIX2FVPROC = CFunctionPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  type PFNGLUNIFORMMATRIX3FVPROC = CFunctionPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  type PFNGLUNIFORMMATRIX4FVPROC = CFunctionPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  type PFNGLVALIDATEPROGRAMPROC = CFunctionPtr1[GLuint, Unit]
  type PFNGLVERTEXATTRIB1DPROC = CFunctionPtr2[GLuint, GLdouble, Unit]
  type PFNGLVERTEXATTRIB1DVPROC = CFunctionPtr2[GLuint, Ptr[GLdouble], Unit]
  type PFNGLVERTEXATTRIB1FPROC = CFunctionPtr2[GLuint, GLfloat, Unit]
  type PFNGLVERTEXATTRIB1FVPROC = CFunctionPtr2[GLuint, Ptr[GLfloat], Unit]
  type PFNGLVERTEXATTRIB1SPROC = CFunctionPtr2[GLuint, GLshort, Unit]
  type PFNGLVERTEXATTRIB1SVPROC = CFunctionPtr2[GLuint, Ptr[GLshort], Unit]
  type PFNGLVERTEXATTRIB2DPROC = CFunctionPtr3[GLuint, GLdouble, GLdouble, Unit]
  type PFNGLVERTEXATTRIB2DVPROC = CFunctionPtr2[GLuint, Ptr[GLdouble], Unit]
  type PFNGLVERTEXATTRIB2FPROC = CFunctionPtr3[GLuint, GLfloat, GLfloat, Unit]
  type PFNGLVERTEXATTRIB2FVPROC = CFunctionPtr2[GLuint, Ptr[GLfloat], Unit]
  type PFNGLVERTEXATTRIB2SPROC = CFunctionPtr3[GLuint, GLshort, GLshort, Unit]
  type PFNGLVERTEXATTRIB2SVPROC = CFunctionPtr2[GLuint, Ptr[GLshort], Unit]
  type PFNGLVERTEXATTRIB3DPROC = CFunctionPtr4[GLuint, GLdouble, GLdouble, GLdouble, Unit]
  type PFNGLVERTEXATTRIB3DVPROC = CFunctionPtr2[GLuint, Ptr[GLdouble], Unit]
  type PFNGLVERTEXATTRIB3FPROC = CFunctionPtr4[GLuint, GLfloat, GLfloat, GLfloat, Unit]
  type PFNGLVERTEXATTRIB3FVPROC = CFunctionPtr2[GLuint, Ptr[GLfloat], Unit]
  type PFNGLVERTEXATTRIB3SPROC = CFunctionPtr4[GLuint, GLshort, GLshort, GLshort, Unit]
  type PFNGLVERTEXATTRIB3SVPROC = CFunctionPtr2[GLuint, Ptr[GLshort], Unit]
  type PFNGLVERTEXATTRIB4NBVPROC = CFunctionPtr2[GLuint, Ptr[GLbyte], Unit]
  type PFNGLVERTEXATTRIB4NIVPROC = CFunctionPtr2[GLuint, Ptr[GLint], Unit]
  type PFNGLVERTEXATTRIB4NSVPROC = CFunctionPtr2[GLuint, Ptr[GLshort], Unit]
  type PFNGLVERTEXATTRIB4NUBPROC = CFunctionPtr5[GLuint, GLubyte, GLubyte, GLubyte, GLubyte, Unit]
  type PFNGLVERTEXATTRIB4NUBVPROC = CFunctionPtr2[GLuint, Ptr[GLubyte], Unit]
  type PFNGLVERTEXATTRIB4NUIVPROC = CFunctionPtr2[GLuint, Ptr[GLuint], Unit]
  type PFNGLVERTEXATTRIB4NUSVPROC = CFunctionPtr2[GLuint, Ptr[GLushort], Unit]
  type PFNGLVERTEXATTRIB4BVPROC = CFunctionPtr2[GLuint, Ptr[GLbyte], Unit]
  type PFNGLVERTEXATTRIB4DPROC = CFunctionPtr5[GLuint, GLdouble, GLdouble, GLdouble, GLdouble, Unit]
  type PFNGLVERTEXATTRIB4DVPROC = CFunctionPtr2[GLuint, Ptr[GLdouble], Unit]
  type PFNGLVERTEXATTRIB4FPROC = CFunctionPtr5[GLuint, GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  type PFNGLVERTEXATTRIB4FVPROC = CFunctionPtr2[GLuint, Ptr[GLfloat], Unit]
  type PFNGLVERTEXATTRIB4IVPROC = CFunctionPtr2[GLuint, Ptr[GLint], Unit]
  type PFNGLVERTEXATTRIB4SPROC = CFunctionPtr5[GLuint, GLshort, GLshort, GLshort, GLshort, Unit]
  type PFNGLVERTEXATTRIB4SVPROC = CFunctionPtr2[GLuint, Ptr[GLshort], Unit]
  type PFNGLVERTEXATTRIB4UBVPROC = CFunctionPtr2[GLuint, Ptr[GLubyte], Unit]
  type PFNGLVERTEXATTRIB4UIVPROC = CFunctionPtr2[GLuint, Ptr[GLuint], Unit]
  type PFNGLVERTEXATTRIB4USVPROC = CFunctionPtr2[GLuint, Ptr[GLushort], Unit]
  type PFNGLVERTEXATTRIBPOINTERPROC = CFunctionPtr6[GLuint, GLint, GLenum, GLboolean, GLsizei, Ptr[Byte], Unit]

  def glBlendEquationSeparate(modeRGB: GLenum, modeAlpha: GLenum): Unit = extern
  def glDrawBuffers(n: GLsizei, bufs: Ptr[GLenum]): Unit = extern
  def glStencilOpSeparate(face: GLenum, sfail: GLenum, dpfail: GLenum, dppass: GLenum): Unit = extern
  def glStencilFuncSeparate(face: GLenum, func: GLenum, ref: GLint, mask: GLuint): Unit = extern
  def glStencilMaskSeparate(face: GLenum, mask: GLuint): Unit = extern
  def glAttachShader(program: GLuint, shader: GLuint): Unit = extern
  def glBindAttribLocation(program: GLuint, index: GLuint, name: Ptr[GLchar]): Unit = extern
  def glCompileShader(shader: GLuint): Unit = extern
  def glCreateProgram(): GLuint = extern
  def glCreateShader(type_ : GLenum): GLuint = extern
  def glDeleteProgram(program: GLuint): Unit = extern
  def glDeleteShader(shader: GLuint): Unit = extern
  def glDetachShader(program: GLuint, shader: GLuint): Unit = extern
  def glDisableVertexAttribArray(index: GLuint): Unit = extern
  def glEnableVertexAttribArray(index: GLuint): Unit = extern
  def glGetActiveAttrib(program: GLuint, index: GLuint, bufSize: GLsizei, length: Ptr[GLsizei], size: Ptr[GLint], type_ : Ptr[GLenum], name: Ptr[GLchar]): Unit = extern
  def glGetActiveUniform(program: GLuint, index: GLuint, bufSize: GLsizei, length: Ptr[GLsizei], size: Ptr[GLint], type_ : Ptr[GLenum], name: Ptr[GLchar]): Unit = extern
  def glGetAttachedShaders(program: GLuint, maxCount: GLsizei, count: Ptr[GLsizei], shaders: Ptr[GLuint]): Unit = extern
  def glGetAttribLocation(program: GLuint, name: Ptr[GLchar]): GLint = extern
  def glGetProgramiv(program: GLuint, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGetProgramInfoLog(program: GLuint, bufSize: GLsizei, length: Ptr[GLsizei], infoLog: Ptr[GLchar]): Unit = extern
  def glGetShaderiv(shader: GLuint, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGetShaderInfoLog(shader: GLuint, bufSize: GLsizei, length: Ptr[GLsizei], infoLog: Ptr[GLchar]): Unit = extern
  def glGetShaderSource(shader: GLuint, bufSize: GLsizei, length: Ptr[GLsizei], source: Ptr[GLchar]): Unit = extern
  def glGetUniformLocation(program: GLuint, name: Ptr[GLchar]): GLint = extern
  def glGetUniformfv(program: GLuint, location: GLint, params: Ptr[GLfloat]): Unit = extern
  def glGetUniformiv(program: GLuint, location: GLint, params: Ptr[GLint]): Unit = extern
  def glGetVertexAttribdv(index: GLuint, pname: GLenum, params: Ptr[GLdouble]): Unit = extern
  def glGetVertexAttribfv(index: GLuint, pname: GLenum, params: Ptr[GLfloat]): Unit = extern
  def glGetVertexAttribiv(index: GLuint, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGetVertexAttribPointerv(index: GLuint, pname: GLenum, pointer: Ptr[Ptr[Byte]]): Unit = extern
  def glIsProgram(program: GLuint): GLboolean = extern
  def glIsShader(shader: GLuint): GLboolean = extern
  def glLinkProgram(program: GLuint): Unit = extern
  def glShaderSource(shader: GLuint, count: GLsizei, string: Ptr[Ptr[GLchar]], length: Ptr[GLint]): Unit = extern
  def glUseProgram(program: GLuint): Unit = extern
  def glUniform1f(location: GLint, v0: GLfloat): Unit = extern
  def glUniform2f(location: GLint, v0: GLfloat, v1: GLfloat): Unit = extern
  def glUniform3f(location: GLint, v0: GLfloat, v1: GLfloat, v2: GLfloat): Unit = extern
  def glUniform4f(location: GLint, v0: GLfloat, v1: GLfloat, v2: GLfloat, v3: GLfloat): Unit = extern
  def glUniform1i(location: GLint, v0: GLint): Unit = extern
  def glUniform2i(location: GLint, v0: GLint, v1: GLint): Unit = extern
  def glUniform3i(location: GLint, v0: GLint, v1: GLint, v2: GLint): Unit = extern
  def glUniform4i(location: GLint, v0: GLint, v1: GLint, v2: GLint, v3: GLint): Unit = extern
  def glUniform1fv(location: GLint, count: GLsizei, value: Ptr[GLfloat]): Unit = extern
  def glUniform2fv(location: GLint, count: GLsizei, value: Ptr[GLfloat]): Unit = extern
  def glUniform3fv(location: GLint, count: GLsizei, value: Ptr[GLfloat]): Unit = extern
  def glUniform4fv(location: GLint, count: GLsizei, value: Ptr[GLfloat]): Unit = extern
  def glUniform1iv(location: GLint, count: GLsizei, value: Ptr[GLint]): Unit = extern
  def glUniform2iv(location: GLint, count: GLsizei, value: Ptr[GLint]): Unit = extern
  def glUniform3iv(location: GLint, count: GLsizei, value: Ptr[GLint]): Unit = extern
  def glUniform4iv(location: GLint, count: GLsizei, value: Ptr[GLint]): Unit = extern
  def glUniformMatrix2fv(location: GLint, count: GLsizei, transpose: GLboolean, value: Ptr[GLfloat]): Unit = extern
  def glUniformMatrix3fv(location: GLint, count: GLsizei, transpose: GLboolean, value: Ptr[GLfloat]): Unit = extern
  def glUniformMatrix4fv(location: GLint, count: GLsizei, transpose: GLboolean, value: Ptr[GLfloat]): Unit = extern
  def glValidateProgram(program: GLuint): Unit = extern
  def glVertexAttrib1d(index: GLuint, x: GLdouble): Unit = extern
  def glVertexAttrib1dv(index: GLuint, v: Ptr[GLdouble]): Unit = extern
  def glVertexAttrib1f(index: GLuint, x: GLfloat): Unit = extern
  def glVertexAttrib1fv(index: GLuint, v: Ptr[GLfloat]): Unit = extern
  def glVertexAttrib1s(index: GLuint, x: GLshort): Unit = extern
  def glVertexAttrib1sv(index: GLuint, v: Ptr[GLshort]): Unit = extern
  def glVertexAttrib2d(index: GLuint, x: GLdouble, y: GLdouble): Unit = extern
  def glVertexAttrib2dv(index: GLuint, v: Ptr[GLdouble]): Unit = extern
  def glVertexAttrib2f(index: GLuint, x: GLfloat, y: GLfloat): Unit = extern
  def glVertexAttrib2fv(index: GLuint, v: Ptr[GLfloat]): Unit = extern
  def glVertexAttrib2s(index: GLuint, x: GLshort, y: GLshort): Unit = extern
  def glVertexAttrib2sv(index: GLuint, v: Ptr[GLshort]): Unit = extern
  def glVertexAttrib3d(index: GLuint, x: GLdouble, y: GLdouble, z: GLdouble): Unit = extern
  def glVertexAttrib3dv(index: GLuint, v: Ptr[GLdouble]): Unit = extern
  def glVertexAttrib3f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat): Unit = extern
  def glVertexAttrib3fv(index: GLuint, v: Ptr[GLfloat]): Unit = extern
  def glVertexAttrib3s(index: GLuint, x: GLshort, y: GLshort, z: GLshort): Unit = extern
  def glVertexAttrib3sv(index: GLuint, v: Ptr[GLshort]): Unit = extern
  def glVertexAttrib4Nbv(index: GLuint, v: Ptr[GLbyte]): Unit = extern
  def glVertexAttrib4Niv(index: GLuint, v: Ptr[GLint]): Unit = extern
  def glVertexAttrib4Nsv(index: GLuint, v: Ptr[GLshort]): Unit = extern
  def glVertexAttrib4Nub(index: GLuint, x: GLubyte, y: GLubyte, z: GLubyte, w: GLubyte): Unit = extern
  def glVertexAttrib4Nubv(index: GLuint, v: Ptr[GLubyte]): Unit = extern
  def glVertexAttrib4Nuiv(index: GLuint, v: Ptr[GLuint]): Unit = extern
  def glVertexAttrib4Nusv(index: GLuint, v: Ptr[GLushort]): Unit = extern
  def glVertexAttrib4bv(index: GLuint, v: Ptr[GLbyte]): Unit = extern
  def glVertexAttrib4d(index: GLuint, x: GLdouble, y: GLdouble, z: GLdouble, w: GLdouble): Unit = extern
  def glVertexAttrib4dv(index: GLuint, v: Ptr[GLdouble]): Unit = extern
  def glVertexAttrib4f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit = extern
  def glVertexAttrib4fv(index: GLuint, v: Ptr[GLfloat]): Unit = extern
  def glVertexAttrib4iv(index: GLuint, v: Ptr[GLint]): Unit = extern
  def glVertexAttrib4s(index: GLuint, x: GLshort, y: GLshort, z: GLshort, w: GLshort): Unit = extern
  def glVertexAttrib4sv(index: GLuint, v: Ptr[GLshort]): Unit = extern
  def glVertexAttrib4ubv(index: GLuint, v: Ptr[GLubyte]): Unit = extern
  def glVertexAttrib4uiv(index: GLuint, v: Ptr[GLuint]): Unit = extern
  def glVertexAttrib4usv(index: GLuint, v: Ptr[GLushort]): Unit = extern
  def glVertexAttribPointer(index: GLuint, size: GLint, type_ : GLenum, normalized: GLboolean, stride: GLsizei, pointer: Ptr[Byte]): Unit = extern
  /*
   * End OpenGL 2.0
   */

  /*
   * OpenGL 2.1
   */
  type PFNGLUNIFORMMATRIX2X3FVPROC = CFunctionPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  type PFNGLUNIFORMMATRIX3X2FVPROC = CFunctionPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  type PFNGLUNIFORMMATRIX2X4FVPROC = CFunctionPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  type PFNGLUNIFORMMATRIX4X2FVPROC = CFunctionPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  type PFNGLUNIFORMMATRIX3X4FVPROC = CFunctionPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  type PFNGLUNIFORMMATRIX4X3FVPROC = CFunctionPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]

  def glUniformMatrix2x3fv(location: GLint, count: GLsizei, transpose: GLboolean, value: Ptr[GLfloat]): Unit = extern
  def glUniformMatrix3x2fv(location: GLint, count: GLsizei, transpose: GLboolean, value: Ptr[GLfloat]): Unit = extern
  def glUniformMatrix2x4fv(location: GLint, count: GLsizei, transpose: GLboolean, value: Ptr[GLfloat]): Unit = extern
  def glUniformMatrix4x2fv(location: GLint, count: GLsizei, transpose: GLboolean, value: Ptr[GLfloat]): Unit = extern
  def glUniformMatrix3x4fv(location: GLint, count: GLsizei, transpose: GLboolean, value: Ptr[GLfloat]): Unit = extern
  def glUniformMatrix4x3fv(location: GLint, count: GLsizei, transpose: GLboolean, value: Ptr[GLfloat]): Unit = extern
  /*
   * End OpenGL 2.1
   */

  /*
   * OpenGL 3.0
   */
  type PFNGLCOLORMASKIPROC = CFunctionPtr5[GLuint, GLboolean, GLboolean, GLboolean, GLboolean, Unit]
  type PFNGLGETBOOLEANI_VPROC = CFunctionPtr3[GLenum, GLuint, Ptr[GLboolean], Unit]
  type PFNGLGETINTEGERI_VPROC = CFunctionPtr3[GLenum, GLuint, Ptr[GLint], Unit]
  type PFNGLENABLEIPROC = CFunctionPtr2[GLenum, GLuint, Unit]
  type PFNGLDISABLEIPROC = CFunctionPtr2[GLenum, GLuint, Unit]
  type PFNGLISENABLEDIPROC = CFunctionPtr2[GLenum, GLuint, GLboolean]
  type PFNGLBEGINTRANSFORMFEEDBACKPROC = CFunctionPtr1[GLenum, Unit]
  type PFNGLENDTRANSFORMFEEDBACKPROC = CFunctionPtr0[Unit]
  type PFNGLBINDBUFFERRANGEPROC = CFunctionPtr5[GLenum, GLuint, GLuint, GLintptr, GLsizeiptr, Unit]
  type PFNGLBINDBUFFERBASEPROC = CFunctionPtr3[GLenum, GLuint, GLuint, Unit]
  type PFNGLTRANSFORMFEEDBACKVARYINGSPROC = CFunctionPtr4[GLuint, GLsizei, Ptr[Ptr[GLchar]], GLenum, Unit]
  type PFNGLGETTRANSFORMFEEDBACKVARYINGPROC = CFunctionPtr7[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLsizei], Ptr[GLenum], Ptr[GLchar], Unit]
  type PFNGLCLAMPCOLORPROC = CFunctionPtr2[GLenum, GLenum, Unit]
  type PFNGLBEGINCONDITIONALRENDERPROC = CFunctionPtr2[GLuint, GLenum, Unit]
  type PFNGLENDCONDITIONALRENDERPROC = CFunctionPtr0[Unit]
  type PFNGLVERTEXATTRIBIPOINTERPROC = CFunctionPtr5[GLuint, GLint, GLenum, GLsizei, Ptr[Byte], Unit]
  type PFNGLGETVERTEXATTRIBIIVPROC = CFunctionPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  type PFNGLGETVERTEXATTRIBIUIVPROC = CFunctionPtr3[GLuint, GLenum, Ptr[GLuint], Unit]
  type PFNGLVERTEXATTRIBI1IPROC = CFunctionPtr2[GLuint, GLint, Unit]
  type PFNGLVERTEXATTRIBI2IPROC = CFunctionPtr3[GLuint, GLint, GLint, Unit]
  type PFNGLVERTEXATTRIBI3IPROC = CFunctionPtr4[GLuint, GLint, GLint, GLint, Unit]
  type PFNGLVERTEXATTRIBI4IPROC = CFunctionPtr5[GLuint, GLint, GLint, GLint, GLint, Unit]
  type PFNGLVERTEXATTRIBI1UIPROC = CFunctionPtr2[GLuint, GLuint, Unit]
  type PFNGLVERTEXATTRIBI2UIPROC = CFunctionPtr3[GLuint, GLuint, GLuint, Unit]
  type PFNGLVERTEXATTRIBI3UIPROC = CFunctionPtr4[GLuint, GLuint, GLuint, GLuint, Unit]
  type PFNGLVERTEXATTRIBI4UIPROC = CFunctionPtr5[GLuint, GLuint, GLuint, GLuint, GLuint, Unit]
  type PFNGLVERTEXATTRIBI1IVPROC = CFunctionPtr2[GLuint, Ptr[GLint], Unit]
  type PFNGLVERTEXATTRIBI2IVPROC = CFunctionPtr2[GLuint, Ptr[GLint], Unit]
  type PFNGLVERTEXATTRIBI3IVPROC = CFunctionPtr2[GLuint, Ptr[GLint], Unit]
  type PFNGLVERTEXATTRIBI4IVPROC = CFunctionPtr2[GLuint, Ptr[GLint], Unit]
  type PFNGLVERTEXATTRIBI1UIVPROC = CFunctionPtr2[GLuint, Ptr[GLuint], Unit]
  type PFNGLVERTEXATTRIBI2UIVPROC = CFunctionPtr2[GLuint, Ptr[GLuint], Unit]
  type PFNGLVERTEXATTRIBI3UIVPROC = CFunctionPtr2[GLuint, Ptr[GLuint], Unit]
  type PFNGLVERTEXATTRIBI4UIVPROC = CFunctionPtr2[GLuint, Ptr[GLuint], Unit]
  type PFNGLVERTEXATTRIBI4BVPROC = CFunctionPtr2[GLuint, Ptr[GLbyte], Unit]
  type PFNGLVERTEXATTRIBI4SVPROC = CFunctionPtr2[GLuint, Ptr[GLshort], Unit]
  type PFNGLVERTEXATTRIBI4UBVPROC = CFunctionPtr2[GLuint, Ptr[GLubyte], Unit]
  type PFNGLVERTEXATTRIBI4USVPROC = CFunctionPtr2[GLuint, Ptr[GLushort], Unit]
  type PFNGLGETUNIFORMUIVPROC = CFunctionPtr3[GLuint, GLint, Ptr[GLuint], Unit]
  type PFNGLBINDFRAGDATALOCATIONPROC = CFunctionPtr3[GLuint, GLuint, Ptr[GLchar], Unit]
  type PFNGLGETFRAGDATALOCATIONPROC = CFunctionPtr2[GLuint, Ptr[GLchar], GLint]
  type PFNGLUNIFORM1UIPROC = CFunctionPtr2[GLint, GLuint, Unit]
  type PFNGLUNIFORM2UIPROC = CFunctionPtr3[GLint, GLuint, GLuint, Unit]
  type PFNGLUNIFORM3UIPROC = CFunctionPtr4[GLint, GLuint, GLuint, GLuint, Unit]
  type PFNGLUNIFORM4UIPROC = CFunctionPtr5[GLint, GLuint, GLuint, GLuint, GLuint, Unit]
  type PFNGLUNIFORM1UIVPROC = CFunctionPtr3[GLint, GLsizei, Ptr[GLuint], Unit]
  type PFNGLUNIFORM2UIVPROC = CFunctionPtr3[GLint, GLsizei, Ptr[GLuint], Unit]
  type PFNGLUNIFORM3UIVPROC = CFunctionPtr3[GLint, GLsizei, Ptr[GLuint], Unit]
  type PFNGLUNIFORM4UIVPROC = CFunctionPtr3[GLint, GLsizei, Ptr[GLuint], Unit]
  type PFNGLTEXPARAMETERIIVPROC = CFunctionPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  type PFNGLTEXPARAMETERIUIVPROC = CFunctionPtr3[GLenum, GLenum, Ptr[GLuint], Unit]
  type PFNGLGETTEXPARAMETERIIVPROC = CFunctionPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  type PFNGLGETTEXPARAMETERIUIVPROC = CFunctionPtr3[GLenum, GLenum, Ptr[GLuint], Unit]
  type PFNGLCLEARBUFFERIVPROC = CFunctionPtr3[GLenum, GLint, Ptr[GLint], Unit]
  type PFNGLCLEARBUFFERUIVPROC = CFunctionPtr3[GLenum, GLint, Ptr[GLuint], Unit]
  type PFNGLCLEARBUFFERFVPROC = CFunctionPtr3[GLenum, GLint, Ptr[GLfloat], Unit]
  type PFNGLCLEARBUFFERFIPROC = CFunctionPtr4[GLenum, GLint, GLfloat, GLint, Unit]
  type PFNGLGETSTRINGIPROC = CFunctionPtr2[GLenum, GLuint, Ptr[GLubyte]]
  type PFNGLISRENDERBUFFERPROC = CFunctionPtr1[GLuint, GLboolean]
  type PFNGLBINDRENDERBUFFERPROC = CFunctionPtr2[GLenum, GLuint, Unit]
  type PFNGLDELETERENDERBUFFERSPROC = CFunctionPtr2[GLsizei, Ptr[GLuint], Unit]
  type PFNGLGENRENDERBUFFERSPROC = CFunctionPtr2[GLsizei, Ptr[GLuint], Unit]
  type PFNGLRENDERBUFFERSTORAGEPROC = CFunctionPtr4[GLenum, GLenum, GLsizei, GLsizei, Unit]
  type PFNGLGETRENDERBUFFERPARAMETERIVPROC = CFunctionPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  type PFNGLISFRAMEBUFFERPROC = CFunctionPtr1[GLuint, GLboolean]
  type PFNGLBINDFRAMEBUFFERPROC = CFunctionPtr2[GLenum, GLuint, Unit]
  type PFNGLDELETEFRAMEBUFFERSPROC = CFunctionPtr2[GLsizei, Ptr[GLuint], Unit]
  type PFNGLGENFRAMEBUFFERSPROC = CFunctionPtr2[GLsizei, Ptr[GLuint], Unit]
  type PFNGLCHECKFRAMEBUFFERSTATUSPROC = CFunctionPtr1[GLenum, GLenum]
  type PFNGLFRAMEBUFFERTEXTURE1DPROC = CFunctionPtr5[GLenum, GLenum, GLenum, GLuint, GLint, Unit]
  type PFNGLFRAMEBUFFERTEXTURE2DPROC = CFunctionPtr5[GLenum, GLenum, GLenum, GLuint, GLint, Unit]
  type PFNGLFRAMEBUFFERTEXTURE3DPROC = CFunctionPtr6[GLenum, GLenum, GLenum, GLuint, GLint, GLint, Unit]
  type PFNGLFRAMEBUFFERRENDERBUFFERPROC = CFunctionPtr4[GLenum, GLenum, GLenum, GLuint, Unit]
  type PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC = CFunctionPtr4[GLenum, GLenum, GLenum, Ptr[GLint], Unit]
  type PFNGLGENERATEMIPMAPPROC = CFunctionPtr1[GLenum, Unit]
  type PFNGLBLITFRAMEBUFFERPROC = CFunctionPtr10[GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum, Unit]
  type PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROC = CFunctionPtr5[GLenum, GLsizei, GLenum, GLsizei, GLsizei, Unit]
  type PFNGLFRAMEBUFFERTEXTURELAYERPROC = CFunctionPtr5[GLenum, GLenum, GLuint, GLint, GLint, Unit]
  type PFNGLMAPBUFFERRANGEPROC = CFunctionPtr4[GLenum, GLintptr, GLsizeiptr, GLbitfield, Unit]
  type PFNGLFLUSHMAPPEDBUFFERRANGEPROC = CFunctionPtr3[GLenum, GLintptr, GLsizeiptr, Unit]
  type PFNGLBINDVERTEXARRAYPROC = CFunctionPtr1[GLuint, Unit]
  type PFNGLDELETEVERTEXARRAYSPROC = CFunctionPtr2[GLsizei, Ptr[GLuint], Unit]
  type PFNGLGENVERTEXARRAYSPROC = CFunctionPtr2[GLsizei, Ptr[GLuint], Unit]
  type PFNGLISVERTEXARRAYPROC = CFunctionPtr1[GLuint, GLboolean]

  def glColorMaski(index: GLuint, r: GLboolean, g: GLboolean, b: GLboolean, a: GLboolean): Unit = extern
  def glGetBooleani_v(target: GLenum, index: GLuint, data: Ptr[GLboolean]): Unit = extern
  def glGetIntegeri_v(target: GLenum, index: GLuint, data: Ptr[GLint]): Unit = extern
  def glEnablei(target: GLenum, index: GLuint): Unit = extern
  def glDisablei(target: GLenum, index: GLuint): Unit = extern
  def glIsEnabledi(target: GLenum, index: GLuint): GLboolean = extern
  def glBeginTransformFeedback(primitiveMode: GLenum): Unit = extern
  def glEndTransformFeedback(): Unit = extern
  def glBindBufferRange(target: GLenum, index: GLuint, buffer: GLuint, offset: GLintptr, size: GLsizeiptr): Unit = extern
  def glBindBufferBase(target: GLenum, index: GLuint, buffer: GLuint): Unit = extern
  def glTransformFeedbackVaryings(program: GLuint, count: GLsizei, varyings: Ptr[Ptr[GLchar]], bufferMode: GLenum): Unit = extern
  def glGetTransformFeedbackVarying(program: GLuint, index: GLuint, bufSize: GLsizei, length: Ptr[GLsizei], size: Ptr[GLsizei], type_ : Ptr[GLenum], name: Ptr[GLchar]): Unit = extern
  def glClampColor(target: GLenum, clamp: GLenum): Unit = extern
  def glBeginConditionalRender(id: GLuint, mode: GLenum): Unit = extern
  def glEndConditionalRender(): Unit = extern
  def glVertexAttribIPointer(index: GLuint, size: GLint, type_ : GLenum, stride: GLsizei, pointer: Ptr[Byte]): Unit = extern
  def glGetVertexAttribIiv(index: GLuint, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGetVertexAttribIuiv(index: GLuint, pname: GLenum, params: Ptr[GLuint]): Unit = extern
  def glVertexAttribI1i(index: GLuint, x: GLint): Unit = extern
  def glVertexAttribI2i(index: GLuint, x: GLint, y: GLint): Unit = extern
  def glVertexAttribI3i(index: GLuint, x: GLint, y: GLint, z: GLint): Unit = extern
  def glVertexAttribI4i(index: GLuint, x: GLint, y: GLint, z: GLint, w: GLint): Unit = extern
  def glVertexAttribI1ui(index: GLuint, x: GLuint): Unit = extern
  def glVertexAttribI2ui(index: GLuint, x: GLuint, y: GLuint): Unit = extern
  def glVertexAttribI3ui(index: GLuint, x: GLuint, y: GLuint, z: GLuint): Unit = extern
  def glVertexAttribI4ui(index: GLuint, x: GLuint, y: GLuint, z: GLuint, w: GLuint): Unit = extern
  def glVertexAttribI1iv(index: GLuint, v: Ptr[GLint]): Unit = extern
  def glVertexAttribI2iv(index: GLuint, v: Ptr[GLint]): Unit = extern
  def glVertexAttribI3iv(index: GLuint, v: Ptr[GLint]): Unit = extern
  def glVertexAttribI4iv(index: GLuint, v: Ptr[GLint]): Unit = extern
  def glVertexAttribI1uiv(index: GLuint, v: Ptr[GLuint]): Unit = extern
  def glVertexAttribI2uiv(index: GLuint, v: Ptr[GLuint]): Unit = extern
  def glVertexAttribI3uiv(index: GLuint, v: Ptr[GLuint]): Unit = extern
  def glVertexAttribI4uiv(index: GLuint, v: Ptr[GLuint]): Unit = extern
  def glVertexAttribI4bv(index: GLuint, v: Ptr[GLbyte]): Unit = extern
  def glVertexAttribI4sv(index: GLuint, v: Ptr[GLshort]): Unit = extern
  def glVertexAttribI4ubv(index: GLuint, v: Ptr[GLubyte]): Unit = extern
  def glVertexAttribI4usv(index: GLuint, v: Ptr[GLushort]): Unit = extern
  def glGetUniformuiv(program: GLuint, location: GLint, params: Ptr[GLuint]): Unit = extern
  def glBindFragDataLocation(program: GLuint, color: GLuint, name: Ptr[GLchar]): Unit = extern
  def glGetFragDataLocation(program: GLuint, name: Ptr[GLchar]): GLint = extern
  def glUniform1ui(location: GLint, v0: GLuint): Unit = extern
  def glUniform2ui(location: GLint, v0: GLuint, v1: GLuint): Unit = extern
  def glUniform3ui(location: GLint, v0: GLuint, v1: GLuint, v2: GLuint): Unit = extern
  def glUniform4ui(location: GLint, v0: GLuint, v1: GLuint, v2: GLuint, v3: GLuint): Unit = extern
  def glUniform1uiv(location: GLint, count: GLsizei, value: Ptr[GLuint]): Unit = extern
  def glUniform2uiv(location: GLint, count: GLsizei, value: Ptr[GLuint]): Unit = extern
  def glUniform3uiv(location: GLint, count: GLsizei, value: Ptr[GLuint]): Unit = extern
  def glUniform4uiv(location: GLint, count: GLsizei, value: Ptr[GLuint]): Unit = extern
  def glTexParameterIiv(target: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glTexParameterIuiv(target: GLenum, pname: GLenum, params: Ptr[GLuint]): Unit = extern
  def glGetTexParameterIiv(target: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGetTexParameterIuiv(target: GLenum, pname: GLenum, params: Ptr[GLuint]): Unit = extern
  def glClearBufferiv(buffer: GLenum, drawbuffer: GLint, value: Ptr[GLint]): Unit = extern
  def glClearBufferuiv(buffer: GLenum, drawbuffer: GLint, value: Ptr[GLuint]): Unit = extern
  def glClearBufferfv(buffer: GLenum, drawbuffer: GLint, value: Ptr[GLfloat]): Unit = extern
  def glClearBufferfi(buffer: GLenum, drawbuffer: GLint, depth: GLfloat, stencil: GLint): Unit = extern
  def glGetStringi(name: GLenum, index: GLuint): Ptr[GLubyte] = extern
  def glIsRenderbuffer(renderbuffer: GLuint): GLboolean = extern
  def glBindRenderbuffer(target: GLenum, renderbuffer: GLuint): Unit = extern
  def glDeleteRenderbuffers(n: GLsizei, renderbuffers: Ptr[GLuint]): Unit = extern
  def glGenRenderbuffers(n: GLsizei, renderbuffers: Ptr[GLuint]): Unit = extern
  def glRenderbufferStorage(target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei): Unit = extern
  def glGetRenderbufferParameteriv(target: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glIsFramebuffer(framebuffer: GLuint): GLboolean = extern
  def glBindFramebuffer(target: GLenum, framebuffer: GLuint): Unit = extern
  def glDeleteFramebuffers(n: GLsizei, framebuffers: Ptr[GLuint]): Unit = extern
  def glGenFramebuffers(n: GLsizei, framebuffers: Ptr[GLuint]): Unit = extern
  def glCheckFramebufferStatus(target: GLenum): GLenum = extern
  def glFramebufferTexture1D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: GLuint, level: GLint): Unit = extern
  def glFramebufferTexture2D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: GLuint, level: GLint): Unit = extern
  def glFramebufferTexture3D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: GLuint, level: GLint, zoffset: GLint): Unit = extern
  def glFramebufferRenderbuffer(target: GLenum, attachment: GLenum, renderbuffertarget: GLenum, renderbuffer: GLuint): Unit = extern
  def glGetFramebufferAttachmentParameteriv(target: GLenum, attachment: GLenum, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGenerateMipmap(target: GLenum): Unit = extern
  def glBlitFramebuffer(srcX0: GLint, srcY0: GLint, srcX1: GLint, srcY1: GLint, dstX0: GLint, dstY0: GLint, dstX1: GLint, dstY1: GLint, mask: GLbitfield, filter: GLenum): Unit = extern
  def glRenderbufferStorageMultisample(target: GLenum, samples: GLsizei, internalformat: GLenum, width: GLsizei, height: GLsizei): Unit = extern
  def glFramebufferTextureLayer(target: GLenum, attachment: GLenum, texture: GLuint, level: GLint, layer: GLint): Unit = extern
  def APIENTRYglMapBufferRange(target: GLenum, offset: GLintptr, length: GLsizeiptr, access: GLbitfield): Unit = extern
  def glFlushMappedBufferRange(target: GLenum, offset: GLintptr, length: GLsizeiptr): Unit = extern
  def glBindVertexArray(array: GLuint): Unit = extern
  def glDeleteVertexArrays(n: GLsizei, arrays: Ptr[GLuint]): Unit = extern
  def glGenVertexArrays(n: GLsizei, arrays: Ptr[GLuint]): Unit = extern
  def glIsVertexArray(array: GLuint): GLboolean = extern
  /*
   * End OpenGL 3.0
   */

  /*
   * OpenGL 3.1
   */
  type PFNGLDRAWARRAYSINSTANCEDPROC = CFunctionPtr4[GLenum, GLint, GLsizei, GLsizei, Unit]
  type PFNGLDRAWELEMENTSINSTANCEDPROC = CFunctionPtr5[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, Unit]
  type PFNGLTEXBUFFERPROC = CFunctionPtr3[GLenum, GLenum, GLuint, Unit]
  type PFNGLPRIMITIVERESTARTINDEXPROC = CFunctionPtr1[GLuint, Unit]
  type PFNGLCOPYBUFFERSUBDATAPROC = CFunctionPtr5[GLenum, GLenum, GLintptr, GLintptr, GLsizeiptr, Unit]
  type PFNGLGETUNIFORMINDICESPROC = CFunctionPtr4[GLuint, GLsizei, Ptr[Ptr[GLchar]], Ptr[GLuint], Unit]
  type PFNGLGETACTIVEUNIFORMSIVPROC = CFunctionPtr5[GLuint, GLsizei, Ptr[GLuint], GLenum, Ptr[GLint], Unit]
  type PFNGLGETACTIVEUNIFORMNAMEPROC = CFunctionPtr5[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
  type PFNGLGETUNIFORMBLOCKINDEXPROC = CFunctionPtr2[GLuint, Ptr[GLchar], GLuint]
  type PFNGLGETACTIVEUNIFORMBLOCKIVPROC = CFunctionPtr4[GLuint, GLuint, GLenum, Ptr[GLint], Unit]
  type PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC = CFunctionPtr5[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
  type PFNGLUNIFORMBLOCKBINDINGPROC = CFunctionPtr3[GLuint, GLuint, GLuint, Unit]

  def glDrawArraysInstanced(mode: GLenum, first: GLint, count: GLsizei, instancecount: GLsizei): Unit = extern
  def glDrawElementsInstanced(mode: GLenum, count: GLsizei, type_ : GLenum, indices: Ptr[Byte], instancecount: GLsizei): Unit = extern
  def glTexBuffer(target: GLenum, internalformat: GLenum, buffer: GLuint): Unit = extern
  def glPrimitiveRestartIndex(index: GLuint): Unit = extern
  def glCopyBufferSubData(readTarget: GLenum, writeTarget: GLenum, readOffset: GLintptr, writeOffset: GLintptr, size: GLsizeiptr): Unit = extern
  def glGetUniformIndices(program: GLuint, uniformCount: GLsizei, uniformNames: Ptr[Ptr[GLchar]],uniformIndices: Ptr[GLuint]): Unit = extern
  def glGetActiveUniformsiv(program: GLuint, uniformCount: GLsizei, uniformIndices: Ptr[GLuint], pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGetActiveUniformName(program: GLuint, uniformIndex: GLuint, bufSize: GLsizei, length: Ptr[GLsizei], uniformName: Ptr[GLchar]): Unit = extern
  def glGetUniformBlockIndex (program: GLuint, uniformBlockName: Ptr[GLchar]): GLuint = extern
  def glGetActiveUniformBlockiv(program: GLuint, uniformBlockIndex: GLuint, pname: GLenum, params: Ptr[GLint]): Unit = extern
  def glGetActiveUniformBlockName(program: GLuint, uniformBlockIndex: GLuint, bufSize: GLsizei, length: Ptr[GLsizei], uniformBlockName: Ptr[GLchar]): Unit = extern
  def glUniformBlockBinding(program: GLuint, uniformBlockIndex: GLuint, uniformBlockBinding: GLuint): Unit = extern
  /*
   * End OpenGL 3.1
   */

  /*
   * OpenGL 3.2
   */
  type PFNGLDRAWELEMENTSBASEVERTEXPROC = CFunctionPtr5[GLenum, GLsizei, GLenum, Ptr[Byte], GLint, Unit]
  type PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC = CFunctionPtr7[GLenum, GLuint, GLuint, GLsizei, GLenum, Ptr[Byte], GLint, Unit]
  type PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC = CFunctionPtr6[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, GLint, Unit]
  type PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC = CFunctionPtr6[GLenum, Ptr[GLsizei], GLenum, Ptr[Ptr[Byte]], GLsizei, Ptr[GLint], Unit]
  type PFNGLPROVOKINGVERTEXPROC = CFunctionPtr1[GLenum, Unit]
  type PFNGLFENCESYNCPROC = CFunctionPtr2[GLenum, GLbitfield, GLsync]
  type PFNGLISSYNCPROC = CFunctionPtr1[GLsync, GLboolean]
  type FNGLDELETESYNCPROC = CFunctionPtr1[GLsync, Unit]
  type PFNGLCLIENTWAITSYNCPROC = CFunctionPtr3[GLsync, GLbitfield, GLuint64, GLenum]
  type PFNGLWAITSYNCPROC = CFunctionPtr3[GLsync, GLbitfield, GLuint64, Unit]
  type PFNGLGETINTEGER64VPROC = CFunctionPtr2[GLenum, Ptr[GLint64], Unit]
  type PFNGLGETSYNCIVPROC = CFunctionPtr5[GLsync, GLenum, GLsizei, Ptr[GLsizei], Ptr[GLint], Unit]
  type PFNGLGETINTEGER64I_VPROC = CFunctionPtr3[GLenum, GLuint, Ptr[GLint64], Unit]
  type PFNGLGETBUFFERPARAMETERI64VPROC = CFunctionPtr3[GLenum, GLenum, Ptr[GLint64], Unit]
  type PFNGLFRAMEBUFFERTEXTUREPROC = CFunctionPtr4[GLenum, GLenum, GLuint, GLint, Unit]
  type PFNGLTEXIMAGE2DMULTISAMPLEPROC = CFunctionPtr6[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLboolean, Unit]
  type PFNGLTEXIMAGE3DMULTISAMPLEPROC = CFunctionPtr7[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean, Unit]
  type PFNGLGETMULTISAMPLEFVPROC = CFunctionPtr3[GLenum, GLuint, Ptr[GLfloat], Unit]
  type PFNGLSAMPLEMASKIPROC = CFunctionPtr2[GLuint, GLbitfield, Unit]

  def glDrawElementsBaseVertex(mode: GLenum, count: GLsizei, type_ : GLenum, indices: Ptr[Byte], basevertex: GLint): Unit = extern
  def glDrawRangeElementsBaseVertex(mode: GLenum, start: GLuint, end: GLuint, count: GLsizei, type_ : GLenum, indices: Ptr[Byte], basevertex: GLint): Unit = extern
  def glDrawElementsInstancedBaseVertex(mode: GLenum, count: GLsizei, type_ : GLenum, indices: Ptr[Byte], instancecount: GLsizei, basevertex: GLint): Unit = extern
  def glMultiDrawElementsBaseVertex(mode: GLenum, count: Ptr[GLsizei], type_ : GLenum, indices: Ptr[Ptr[Byte]], drawcount: GLsizei, basevertex: Ptr[GLint]): Unit = extern
  def glProvokingVertex(mode: GLenum): Unit = extern
  def glFenceSync(condition: GLenum, flags: GLbitfield): GLsync = extern
  def glIsSync(sync: GLsync): GLboolean = extern
  def glDeleteSync(sync: GLsync): Unit = extern
  def glClientWaitSync(sync: GLsync, flags: GLbitfield, timeout: GLuint64): GLenum = extern
  def glWaitSync(sync: GLsync, flags: GLbitfield, timeout: GLuint64): Unit = extern
  def glGetInteger64v(pname: GLenum, data: Ptr[GLint64]): Unit = extern
  def glGetSynciv(sync: GLsync, pname: GLenum, bufSize: GLsizei, length: Ptr[GLsizei], values: Ptr[GLint]): Unit = extern
  def glGetInteger64i_v(target: GLenum, index: GLuint, data: Ptr[GLint64]): Unit = extern
  def glGetBufferParameteri64v(target: GLenum, pname: GLenum, params: Ptr[GLint64]): Unit = extern
  def glFramebufferTexture(target: GLenum, attachment: GLenum, texture: GLuint, level: GLint): Unit = extern
  def glTexImage2DMultisample(target: GLenum, samples: GLsizei, internalformat: GLenum, width: GLsizei, height: GLsizei, fixedsamplelocations: GLboolean): Unit = extern
  def glTexImage3DMultisample(target: GLenum, samples: GLsizei, internalformat: GLenum, width: GLsizei, height: GLsizei, depth: GLsizei, fixedsamplelocations: GLboolean): Unit = extern
  def glGetMultisamplefv(pname: GLenum, index: GLuint, val_ : Ptr[GLfloat]): Unit = extern
  def glSampleMaski(index: GLuint, mask: GLbitfield): Unit = extern
  /*
   * End OpenGL 3.2
   */
}

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
   * OpenGL 1.4
   */
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
  //already defined above
  //def glBlendColor(red: GLfloat, green: GLfloat, blue: GLfloat, alpha: GLfloat): Unit = extern
  //def glBlendEquation(mode: GLenum): Unit = extern
}

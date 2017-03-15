package gl

import scalanative.native._

object Extras {
  import GL._

  /* Boolean values */
  val GL_FALSE: UByte = 0.toUByte
  val GL_TRUE: UByte = 1.toUByte

  /* Data types */
  val GL_BYTE: UShort = 0x1400.toUShort
  val GL_UNSIGNED_BYTE: UShort = 0x1401.toUShort
  val GL_SHORT: UShort = 0x1402.toUShort
  val GL_UNSIGNED_SHORT: UShort = 0x1403.toUShort
  val GL_INT: UShort = 0x1404.toUShort
  val GL_UNSIGNED_INT: UShort = 0x1405.toUShort
  val GL_FLOAT: UShort = 0x1406.toUShort
  val GL_2_BYTES: UShort = 0x1407.toUShort
  val GL_3_BYTES: UShort = 0x1408.toUShort
  val GL_4_BYTES: UShort = 0x1409.toUShort
  val GL_DOUBLE: UShort = 0x140A.toUShort

  /* Primitives */
  val GL_POINTS: UShort = 0x0000.toUShort
  val GL_LINES: UShort = 0x0001.toUShort
  val GL_LINE_LOOP: UShort = 0x0002.toUShort
  val GL_LINE_STRIP: UShort = 0x0003.toUShort
  val GL_TRIANGLES: UShort = 0x0004.toUShort
  val GL_TRIANGLE_STRIP: UShort = 0x0005.toUShort
  val GL_TRIANGLE_FAN: UShort = 0x0006.toUShort
  val GL_QUADS: UShort = 0x0007.toUShort
  val GL_QUAD_STRIP: UShort = 0x0008.toUShort
  val GL_POLYGON: UShort = 0x0009.toUShort


  /* Matrix Mode */
  val GL_MATRIX_MODE: GLenum = 0x0BA0.toUInt
  val GL_MODELVIEW: GLenum = 0x1700.toUInt
  val GL_PROJECTION: GLenum = 0x1701.toUInt
  val GL_TEXTURE: GLenum = 0x1702.toUInt

  /* glPush/PopAttrib bits */
  val GL_CURRENT_BIT: GLbitfield =         0x00000001
  val GL_POINT_BIT: GLbitfield =           0x00000002
  val GL_LINE_BIT: GLbitfield =            0x00000004
  val GL_POLYGON_BIT: GLbitfield =         0x00000008
  val GL_POLYGON_STIPPLE_BIT: GLbitfield = 0x00000010
  val GL_PIXEL_MODE_BIT: GLbitfield =      0x00000020
  val GL_LIGHTING_BIT: GLbitfield =        0x00000040
  val GL_FOG_BIT: GLbitfield =             0x00000080
  val GL_DEPTH_BUFFER_BIT: GLbitfield =    0x00000100
  val GL_ACCUM_BUFFER_BIT: GLbitfield =    0x00000200
  val GL_STENCIL_BUFFER_BIT: GLbitfield =  0x00000400
  val GL_VIEWPORT_BIT: GLbitfield =        0x00000800
  val GL_TRANSFORM_BIT: GLbitfield =       0x00001000
  val GL_ENABLE_BIT: GLbitfield =          0x00002000
  val GL_COLOR_BUFFER_BIT: GLbitfield =    0x00004000
  val GL_HINT_BIT: GLbitfield =            0x00008000
  val GL_EVAL_BIT: GLbitfield =            0x00010000
  val GL_LIST_BIT: GLbitfield =            0x00020000
  val GL_TEXTURE_BIT: GLbitfield =         0x00040000
  val GL_SCISSOR_BIT: GLbitfield =         0x00080000
  val GL_ALL_ATTRIB_BITS: GLbitfield =     0x000FFFFF

}

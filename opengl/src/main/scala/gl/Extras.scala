package gl

import scalanative.native._

object Extras {
  import GL._

  val GL_VERSION_1_1: UByte = 1.toUByte
  val GL_VERSION_1_2: UByte = 1.toUByte
  val GL_VERSION_1_3: UByte = 1.toUByte
  val GL_ARB_imaging: UByte = 1.toUByte

  /*
   * Constants
   */

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

  /* Vertex Arrays */
  val GL_VERTEX_ARRAY: UShort = 0x8074.toUShort
  val GL_NORMAL_ARRAY: UShort = 0x8075.toUShort
  val GL_COLOR_ARRAY: UShort = 0x8076.toUShort
  val GL_INDEX_ARRAY: UShort = 0x8077.toUShort
  val GL_TEXTURE_COORD_ARRAY: UShort = 0x8078.toUShort
  val GL_EDGE_FLAG_ARRAY: UShort = 0x8079.toUShort
  val GL_VERTEX_ARRAY_SIZE: UShort = 0x807A.toUShort
  val GL_VERTEX_ARRAY_TYPE: UShort = 0x807B.toUShort
  val GL_VERTEX_ARRAY_STRIDE: UShort = 0x807C.toUShort
  val GL_NORMAL_ARRAY_TYPE: UShort = 0x807E.toUShort
  val GL_NORMAL_ARRAY_STRIDE: UShort = 0x807F.toUShort
  val GL_COLOR_ARRAY_SIZE: UShort = 0x8081.toUShort
  val GL_COLOR_ARRAY_TYPE: UShort = 0x8082.toUShort
  val GL_COLOR_ARRAY_STRIDE: UShort = 0x8083.toUShort
  val GL_INDEX_ARRAY_TYPE: UShort = 0x8085.toUShort
  val GL_INDEX_ARRAY_STRIDE: UShort = 0x8086.toUShort
  val GL_TEXTURE_COORD_ARRAY_SIZE: UShort = 0x8088.toUShort
  val GL_TEXTURE_COORD_ARRAY_TYPE: UShort = 0x8089.toUShort
  val GL_TEXTURE_COORD_ARRAY_STRIDE: UShort = 0x808A.toUShort
  val GL_EDGE_FLAG_ARRAY_STRIDE: UShort = 0x808C.toUShort
  val GL_VERTEX_ARRAY_POINTER: UShort = 0x808E.toUShort
  val GL_NORMAL_ARRAY_POINTER: UShort = 0x808F.toUShort
  val GL_COLOR_ARRAY_POINTER: UShort = 0x8090.toUShort
  val GL_INDEX_ARRAY_POINTER: UShort = 0x8091.toUShort
  val GL_TEXTURE_COORD_ARRAY_POINTER: UShort = 0x8092.toUShort
  val GL_EDGE_FLAG_ARRAY_POINTER: UShort = 0x8093.toUShort
  val GL_V2F: UShort = 0x2A20.toUShort
  val GL_V3F: UShort = 0x2A21.toUShort
  val GL_C4UB_V2F: UShort = 0x2A22.toUShort
  val GL_C4UB_V3F: UShort = 0x2A23.toUShort
  val GL_C3F_V3F: UShort = 0x2A24.toUShort
  val GL_N3F_V3F: UShort = 0x2A25.toUShort
  val GL_C4F_N3F_V3F: UShort = 0x2A26.toUShort
  val GL_T2F_V3F: UShort = 0x2A27.toUShort
  val GL_T4F_V4F: UShort = 0x2A28.toUShort
  val GL_T2F_C4UB_V3F: UShort = 0x2A29.toUShort
  val GL_T2F_C3F_V3F: UShort = 0x2A2A.toUShort
  val GL_T2F_N3F_V3F: UShort = 0x2A2B.toUShort
  val GL_T2F_C4F_N3F_V3F: UShort = 0x2A2C.toUShort
  val GL_T4F_C4F_N3F_V4F: UShort = 0x2A2D.toUShort

  /* Matrix Mode */
  val GL_MATRIX_MODE: GLenum = 0x0BA0.toUInt
  val GL_MODELVIEW: GLenum = 0x1700.toUInt
  val GL_PROJECTION: GLenum = 0x1701.toUInt
  val GL_TEXTURE: GLenum = 0x1702.toUInt

  /* Points */
  val GL_POINT_SMOOTH: UShort = 0x0B10.toUShort
  val GL_POINT_SIZE: UShort = 0x0B11.toUShort
  val GL_POINT_SIZE_GRANULARITY: UShort = 0x0B13.toUShort
  val GL_POINT_SIZE_RANGE: UShort = 0x0B12.toUShort
  
  /* Lines */
  val GL_LINE_SMOOTH: UShort = 0x0B20.toUShort
  val GL_LINE_STIPPLE: UShort = 0x0B24.toUShort
  val GL_LINE_STIPPLE_PATTERN: UShort = 0x0B25.toUShort
  val GL_LINE_STIPPLE_REPEAT: UShort = 0x0B26.toUShort
  val GL_LINE_WIDTH: UShort = 0x0B21.toUShort
  val GL_LINE_WIDTH_GRANULARITY: UShort = 0x0B23.toUShort
  val GL_LINE_WIDTH_RANGE: UShort = 0x0B22.toUShort
  
  /* Polygons */
  val GL_POINT: UShort = 0x1B00.toUShort
  val GL_LINE: UShort = 0x1B01.toUShort
  val GL_FILL: UShort = 0x1B02.toUShort
  val GL_CW: UShort = 0x0900.toUShort
  val GL_CCW: UShort = 0x0901.toUShort
  val GL_FRONT: UShort = 0x0404.toUShort
  val GL_BACK: UShort = 0x0405.toUShort
  val GL_POLYGON_MODE: UShort = 0x0B40.toUShort
  val GL_POLYGON_SMOOTH: UShort = 0x0B41.toUShort
  val GL_POLYGON_STIPPLE: UShort = 0x0B42.toUShort
  val GL_EDGE_FLAG: UShort = 0x0B43.toUShort
  val GL_CULL_FACE: UShort = 0x0B44.toUShort
  val GL_CULL_FACE_MODE: UShort = 0x0B45.toUShort
  val GL_FRONT_FACE: UShort = 0x0B46.toUShort
  val GL_POLYGON_OFFSET_FACTOR: UShort = 0x8038.toUShort
  val GL_POLYGON_OFFSET_UNITS: UShort = 0x2A00.toUShort
  val GL_POLYGON_OFFSET_POINT: UShort = 0x2A01.toUShort
  val GL_POLYGON_OFFSET_LINE: UShort = 0x2A02.toUShort
  val GL_POLYGON_OFFSET_FILL: UShort = 0x8037.toUShort

  /* Display Lists */
  val GL_COMPILE: UShort = 0x1300.toUShort
  val GL_COMPILE_AND_EXECUTE: UShort = 0x1301.toUShort
  val GL_LIST_BASE: UShort = 0x0B32.toUShort
  val GL_LIST_INDEX: UShort = 0x0B33.toUShort
  val GL_LIST_MODE: UShort = 0x0B30.toUShort
  
  /* Depth buffer */
  val GL_NEVER: UShort = 0x0200.toUShort
  val GL_LESS: UShort = 0x0201.toUShort
  val GL_EQUAL: UShort = 0x0202.toUShort
  val GL_LEQUAL: UShort = 0x0203.toUShort
  val GL_GREATER: UShort = 0x0204.toUShort
  val GL_NOTEQUAL: UShort = 0x0205.toUShort
  val GL_GEQUAL: UShort = 0x0206.toUShort
  val GL_ALWAYS: UShort = 0x0207.toUShort
  val GL_DEPTH_TEST: UShort = 0x0B71.toUShort
  val GL_DEPTH_BITS: UShort = 0x0D56.toUShort
  val GL_DEPTH_CLEAR_VALUE: UShort = 0x0B73.toUShort
  val GL_DEPTH_FUNC: UShort = 0x0B74.toUShort
  val GL_DEPTH_RANGE: UShort = 0x0B70.toUShort
  val GL_DEPTH_WRITEMASK: UShort = 0x0B72.toUShort
  val GL_DEPTH_COMPONENT: UShort = 0x1902.toUShort
  
  /* Lighting */
  val GL_LIGHTING: UShort = 0x0B50.toUShort
  val GL_LIGHT0: UShort = 0x4000.toUShort
  val GL_LIGHT1: UShort = 0x4001.toUShort
  val GL_LIGHT2: UShort = 0x4002.toUShort
  val GL_LIGHT3: UShort = 0x4003.toUShort
  val GL_LIGHT4: UShort = 0x4004.toUShort
  val GL_LIGHT5: UShort = 0x4005.toUShort
  val GL_LIGHT6: UShort = 0x4006.toUShort
  val GL_LIGHT7: UShort = 0x4007.toUShort
  val GL_SPOT_EXPONENT: UShort = 0x1205.toUShort
  val GL_SPOT_CUTOFF: UShort = 0x1206.toUShort
  val GL_CONSTANT_ATTENUATION: UShort = 0x1207.toUShort
  val GL_LINEAR_ATTENUATION: UShort = 0x1208.toUShort
  val GL_QUADRATIC_ATTENUATION: UShort = 0x1209.toUShort
  val GL_AMBIENT: UShort = 0x1200.toUShort
  val GL_DIFFUSE: UShort = 0x1201.toUShort
  val GL_SPECULAR: UShort = 0x1202.toUShort
  val GL_SHININESS: UShort = 0x1601.toUShort
  val GL_EMISSION: UShort = 0x1600.toUShort
  val GL_POSITION: UShort = 0x1203.toUShort
  val GL_SPOT_DIRECTION: UShort = 0x1204.toUShort
  val GL_AMBIENT_AND_DIFFUSE: UShort = 0x1602.toUShort
  val GL_COLOR_INDEXES: UShort = 0x1603.toUShort
  val GL_LIGHT_MODEL_TWO_SIDE: UShort = 0x0B52.toUShort
  val GL_LIGHT_MODEL_LOCAL_VIEWER: UShort = 0x0B51.toUShort
  val GL_LIGHT_MODEL_AMBIENT: UShort = 0x0B53.toUShort
  val GL_FRONT_AND_BACK: UShort = 0x0408.toUShort
  val GL_SHADE_MODEL: UShort = 0x0B54.toUShort
  val GL_FLAT: UShort = 0x1D00.toUShort
  val GL_SMOOTH: UShort = 0x1D01.toUShort
  val GL_COLOR_MATERIAL: UShort = 0x0B57.toUShort
  val GL_COLOR_MATERIAL_FACE: UShort = 0x0B55.toUShort
  val GL_COLOR_MATERIAL_PARAMETER: UShort = 0x0B56.toUShort
  val GL_NORMALIZE: UShort = 0x0BA1.toUShort
  
  /* User clipping planes */
  val GL_CLIP_PLANE0: UShort = 0x3000.toUShort
  val GL_CLIP_PLANE1: UShort = 0x3001.toUShort
  val GL_CLIP_PLANE2: UShort = 0x3002.toUShort
  val GL_CLIP_PLANE3: UShort = 0x3003.toUShort
  val GL_CLIP_PLANE4: UShort = 0x3004.toUShort
  val GL_CLIP_PLANE5: UShort = 0x3005.toUShort

  /* Accumulation buffer */
  val GL_ACCUM_RED_BITS: UShort = 0x0D58.toUShort
  val GL_ACCUM_GREEN_BITS: UShort = 0x0D59.toUShort
  val GL_ACCUM_BLUE_BITS: UShort = 0x0D5A.toUShort
  val GL_ACCUM_ALPHA_BITS: UShort = 0x0D5B.toUShort
  val GL_ACCUM_CLEAR_VALUE: UShort = 0x0B80.toUShort
  val GL_ACCUM: UShort = 0x0100.toUShort
  val GL_ADD: UShort = 0x0104.toUShort
  val GL_LOAD: UShort = 0x0101.toUShort
  val GL_MULT: UShort = 0x0103.toUShort
  val GL_RETURN: UShort = 0x0102.toUShort
  
  /* Alpha testing */
  val GL_ALPHA_TEST: UShort = 0x0BC0.toUShort
  val GL_ALPHA_TEST_REF: UShort = 0x0BC2.toUShort
  val GL_ALPHA_TEST_FUNC: UShort = 0x0BC1.toUShort
  
  /* Blending */
  val GL_BLEND: UShort = 0x0BE2.toUShort
  val GL_BLEND_SRC: UShort = 0x0BE1.toUShort
  val GL_BLEND_DST: UShort = 0x0BE0.toUShort
  val GL_ZERO: UShort = 0.toUShort
  val GL_ONE: UShort = 1.toUShort
  val GL_SRC_COLOR: UShort = 0x0300.toUShort
  val GL_ONE_MINUS_SRC_COLOR: UShort = 0x0301.toUShort
  val GL_SRC_ALPHA: UShort = 0x0302.toUShort
  val GL_ONE_MINUS_SRC_ALPHA: UShort = 0x0303.toUShort
  val GL_DST_ALPHA: UShort = 0x0304.toUShort
  val GL_ONE_MINUS_DST_ALPHA: UShort = 0x0305.toUShort
  val GL_DST_COLOR: UShort = 0x0306.toUShort
  val GL_ONE_MINUS_DST_COLOR: UShort = 0x0307.toUShort
  val GL_SRC_ALPHA_SATURATE: UShort = 0x0308.toUShort
  
  /* Render Mode */
  val GL_FEEDBACK: UShort = 0x1C01.toUShort
  val GL_RENDER: UShort = 0x1C00.toUShort
  val GL_SELECT: UShort = 0x1C02.toUShort
  
  /* Feedback */
  val GL_2D: UShort = 0x0600.toUShort
  val GL_3D: UShort = 0x0601.toUShort
  val GL_3D_COLOR: UShort = 0x0602.toUShort
  val GL_3D_COLOR_TEXTURE: UShort = 0x0603.toUShort
  val GL_4D_COLOR_TEXTURE: UShort = 0x0604.toUShort
  val GL_POINT_TOKEN: UShort = 0x0701.toUShort
  val GL_LINE_TOKEN: UShort = 0x0702.toUShort
  val GL_LINE_RESET_TOKEN: UShort = 0x0707.toUShort
  val GL_POLYGON_TOKEN: UShort = 0x0703.toUShort
  val GL_BITMAP_TOKEN: UShort = 0x0704.toUShort
  val GL_DRAW_PIXEL_TOKEN: UShort = 0x0705.toUShort
  val GL_COPY_PIXEL_TOKEN: UShort = 0x0706.toUShort
  val GL_PASS_THROUGH_TOKEN: UShort = 0x0700.toUShort
  val GL_FEEDBACK_BUFFER_POINTER: UShort = 0x0DF0.toUShort
  val GL_FEEDBACK_BUFFER_SIZE: UShort = 0x0DF1.toUShort
  val GL_FEEDBACK_BUFFER_TYPE: UShort = 0x0DF2.toUShort
  
  /* Selection */
  val GL_SELECTION_BUFFER_POINTER: UShort = 0x0DF3.toUShort
  val GL_SELECTION_BUFFER_SIZE: UShort = 0x0DF4.toUShort

  /* Fog */
  val GL_FOG: Short = 0x0B60.toShort
  val GL_FOG_MODE: Short = 0x0B65.toShort
  val GL_FOG_DENSITY: Short = 0x0B62.toShort
  val GL_FOG_COLOR: Short = 0x0B66.toShort
  val GL_FOG_INDEX: Short = 0x0B61.toShort
  val GL_FOG_START: Short = 0x0B63.toShort
  val GL_FOG_END: Short = 0x0B64.toShort
  val GL_LINEAR: Short = 0x2601.toShort
  val GL_EXP: Short = 0x0800.toShort
  val GL_EXP2: Short = 0x0801.toShort
  
  /* Logic Ops */
  val GL_LOGIC_OP: UShort = 0x0BF1.toUShort
  val GL_INDEX_LOGIC_OP: UShort = 0x0BF1.toUShort
  val GL_COLOR_LOGIC_OP: UShort = 0x0BF2.toUShort
  val GL_LOGIC_OP_MODE: UShort = 0x0BF0.toUShort
  val GL_CLEAR: UShort = 0x1500.toUShort
  val GL_SET: UShort = 0x150F.toUShort
  val GL_COPY: UShort = 0x1503.toUShort
  val GL_COPY_INVERTED: UShort = 0x150C.toUShort
  val GL_NOOP: UShort = 0x1505.toUShort
  val GL_INVERT: UShort = 0x150A.toUShort
  val GL_AND: UShort = 0x1501.toUShort
  val GL_NAND: UShort = 0x150E.toUShort
  val GL_OR: UShort = 0x1507.toUShort
  val GL_NOR: UShort = 0x1508.toUShort
  val GL_XOR: UShort = 0x1506.toUShort
  val GL_EQUIV: UShort = 0x1509.toUShort
  val GL_AND_REVERSE: UShort = 0x1502.toUShort
  val GL_AND_INVERTED: UShort = 0x1504.toUShort
  val GL_OR_REVERSE: UShort = 0x150B.toUShort
  val GL_OR_INVERTED: UShort = 0x150D.toUShort
  
  /* Stencil */
  val GL_STENCIL_BITS: UShort = 0x0D57.toUShort
  val GL_STENCIL_TEST: UShort = 0x0B90.toUShort
  val GL_STENCIL_CLEAR_VALUE: UShort = 0x0B91.toUShort
  val GL_STENCIL_FUNC: UShort = 0x0B92.toUShort
  val GL_STENCIL_VALUE_MASK: UShort = 0x0B93.toUShort
  val GL_STENCIL_FAIL: UShort = 0x0B94.toUShort
  val GL_STENCIL_PASS_DEPTH_FAIL: UShort = 0x0B95.toUShort
  val GL_STENCIL_PASS_DEPTH_PASS: UShort = 0x0B96.toUShort
  val GL_STENCIL_REF: UShort = 0x0B97.toUShort
  val GL_STENCIL_WRITEMASK: UShort = 0x0B98.toUShort
  val GL_STENCIL_INDEX: UShort = 0x1901.toUShort
  val GL_KEEP: UShort = 0x1E00.toUShort
  val GL_REPLACE: UShort = 0x1E01.toUShort
  val GL_INCR: UShort = 0x1E02.toUShort
  val GL_DECR: UShort = 0x1E03.toUShort

  /* Buffers, Pixel Drawing/Reading */
  val GL_NONE: UShort = 0.toUShort
  val GL_LEFT: UShort = 0x0406.toUShort
  val GL_RIGHT: UShort = 0x0407.toUShort
  /*val GL_FRONT: UShort = 0x0404.toUShort*/
  /*val GL_BACK: UShort = 0x0405.toUShort*/
  /*val GL_FRONT_AND_BACK: UShort = 0x0408.toUShort*/
  val GL_FRONT_LEFT: UShort = 0x0400.toUShort
  val GL_FRONT_RIGHT: UShort = 0x0401.toUShort
  val GL_BACK_LEFT: UShort = 0x0402.toUShort
  val GL_BACK_RIGHT: UShort = 0x0403.toUShort
  val GL_AUX0: UShort = 0x0409.toUShort
  val GL_AUX1: UShort = 0x040A.toUShort
  val GL_AUX2: UShort = 0x040B.toUShort
  val GL_AUX3: UShort = 0x040C.toUShort
  val GL_COLOR_INDEX: UShort = 0x1900.toUShort
  val GL_RED: UShort = 0x1903.toUShort
  val GL_GREEN: UShort = 0x1904.toUShort
  val GL_BLUE: UShort = 0x1905.toUShort
  val GL_ALPHA: UShort = 0x1906.toUShort
  val GL_LUMINANCE: UShort = 0x1909.toUShort
  val GL_LUMINANCE_ALPHA: UShort = 0x190A.toUShort
  val GL_ALPHA_BITS: UShort = 0x0D55.toUShort
  val GL_RED_BITS: UShort = 0x0D52.toUShort
  val GL_GREEN_BITS: UShort = 0x0D53.toUShort
  val GL_BLUE_BITS: UShort = 0x0D54.toUShort
  val GL_INDEX_BITS: UShort = 0x0D51.toUShort
  val GL_SUBPIXEL_BITS: UShort = 0x0D50.toUShort
  val GL_AUX_BUFFERS: UShort = 0x0C00.toUShort
  val GL_READ_BUFFER: UShort = 0x0C02.toUShort
  val GL_DRAW_BUFFER: UShort = 0x0C01.toUShort
  val GL_DOUBLEBUFFER: UShort = 0x0C32.toUShort
  val GL_STEREO: UShort = 0x0C33.toUShort
  val GL_BITMAP: UShort = 0x1A00.toUShort
  val GL_COLOR: UShort = 0x1800.toUShort
  val GL_DEPTH: UShort = 0x1801.toUShort
  val GL_STENCIL: UShort = 0x1802.toUShort
  val GL_DITHER: UShort = 0x0BD0.toUShort
  val GL_RGB: UShort = 0x1907.toUShort
  val GL_RGBA: UShort = 0x1908.toUShort
  
  /* Implementation limits */
  val GL_MAX_LIST_NESTING: UShort = 0x0B31.toUShort
  val GL_MAX_EVAL_ORDER: UShort = 0x0D30.toUShort
  val GL_MAX_LIGHTS: UShort = 0x0D31.toUShort
  val GL_MAX_CLIP_PLANES: UShort = 0x0D32.toUShort
  val GL_MAX_TEXTURE_SIZE: UShort = 0x0D33.toUShort
  val GL_MAX_PIXEL_MAP_TABLE: UShort = 0x0D34.toUShort
  val GL_MAX_ATTRIB_STACK_DEPTH: UShort = 0x0D35.toUShort
  val GL_MAX_MODELVIEW_STACK_DEPTH: UShort = 0x0D36.toUShort
  val GL_MAX_NAME_STACK_DEPTH: UShort = 0x0D37.toUShort
  val GL_MAX_PROJECTION_STACK_DEPTH: UShort = 0x0D38.toUShort
  val GL_MAX_TEXTURE_STACK_DEPTH: UShort = 0x0D39.toUShort
  val GL_MAX_VIEWPORT_DIMS: UShort = 0x0D3A.toUShort
  val GL_MAX_CLIENT_ATTRIB_STACK_DEPTH: UShort = 0x0D3B.toUShort

  /* Gets */
  val GL_ATTRIB_STACK_DEPTH: UShort = 0x0BB0.toUShort
  val GL_CLIENT_ATTRIB_STACK_DEPTH: UShort = 0x0BB1.toUShort
  val GL_COLOR_CLEAR_VALUE: UShort = 0x0C22.toUShort
  val GL_COLOR_WRITEMASK: UShort = 0x0C23.toUShort
  val GL_CURRENT_INDEX: UShort = 0x0B01.toUShort
  val GL_CURRENT_COLOR: UShort = 0x0B00.toUShort
  val GL_CURRENT_NORMAL: UShort = 0x0B02.toUShort
  val GL_CURRENT_RASTER_COLOR: UShort = 0x0B04.toUShort
  val GL_CURRENT_RASTER_DISTANCE: UShort = 0x0B09.toUShort
  val GL_CURRENT_RASTER_INDEX: UShort = 0x0B05.toUShort
  val GL_CURRENT_RASTER_POSITION: UShort = 0x0B07.toUShort
  val GL_CURRENT_RASTER_TEXTURE_COORDS: UShort = 0x0B06.toUShort
  val GL_CURRENT_RASTER_POSITION_VALID: UShort = 0x0B08.toUShort
  val GL_CURRENT_TEXTURE_COORDS: UShort = 0x0B03.toUShort
  val GL_INDEX_CLEAR_VALUE: UShort = 0x0C20.toUShort
  val GL_INDEX_MODE: UShort = 0x0C30.toUShort
  val GL_INDEX_WRITEMASK: UShort = 0x0C21.toUShort
  val GL_MODELVIEW_MATRIX: UShort = 0x0BA6.toUShort
  val GL_MODELVIEW_STACK_DEPTH: UShort = 0x0BA3.toUShort
  val GL_NAME_STACK_DEPTH: UShort = 0x0D70.toUShort
  val GL_PROJECTION_MATRIX: UShort = 0x0BA7.toUShort
  val GL_PROJECTION_STACK_DEPTH: UShort = 0x0BA4.toUShort
  val GL_RENDER_MODE: UShort = 0x0C40.toUShort
  val GL_RGBA_MODE: UShort = 0x0C31.toUShort
  val GL_TEXTURE_MATRIX: UShort = 0x0BA8.toUShort
  val GL_TEXTURE_STACK_DEPTH: UShort = 0x0BA5.toUShort
  val GL_VIEWPORT: UShort = 0x0BA2.toUShort
  
  /* Evaluators */
  val GL_AUTO_NORMAL: UShort = 0x0D80.toUShort
  val GL_MAP1_COLOR_4: UShort = 0x0D90.toUShort
  val GL_MAP1_INDEX: UShort = 0x0D91.toUShort
  val GL_MAP1_NORMAL: UShort = 0x0D92.toUShort
  val GL_MAP1_TEXTURE_COORD_1: UShort = 0x0D93.toUShort
  val GL_MAP1_TEXTURE_COORD_2: UShort = 0x0D94.toUShort
  val GL_MAP1_TEXTURE_COORD_3: UShort = 0x0D95.toUShort
  val GL_MAP1_TEXTURE_COORD_4: UShort = 0x0D96.toUShort
  val GL_MAP1_VERTEX_3: UShort = 0x0D97.toUShort
  val GL_MAP1_VERTEX_4: UShort = 0x0D98.toUShort
  val GL_MAP2_COLOR_4: UShort = 0x0DB0.toUShort
  val GL_MAP2_INDEX: UShort = 0x0DB1.toUShort
  val GL_MAP2_NORMAL: UShort = 0x0DB2.toUShort
  val GL_MAP2_TEXTURE_COORD_1: UShort = 0x0DB3.toUShort
  val GL_MAP2_TEXTURE_COORD_2: UShort = 0x0DB4.toUShort
  val GL_MAP2_TEXTURE_COORD_3: UShort = 0x0DB5.toUShort
  val GL_MAP2_TEXTURE_COORD_4: UShort = 0x0DB6.toUShort
  val GL_MAP2_VERTEX_3: UShort = 0x0DB7.toUShort
  val GL_MAP2_VERTEX_4: UShort = 0x0DB8.toUShort
  val GL_MAP1_GRID_DOMAIN: UShort = 0x0DD0.toUShort
  val GL_MAP1_GRID_SEGMENTS: UShort = 0x0DD1.toUShort
  val GL_MAP2_GRID_DOMAIN: UShort = 0x0DD2.toUShort
  val GL_MAP2_GRID_SEGMENTS: UShort = 0x0DD3.toUShort
  val GL_COEFF: UShort = 0x0A00.toUShort
  val GL_ORDER: UShort = 0x0A01.toUShort
  val GL_DOMAIN: UShort = 0x0A02.toUShort

  /* Hints */
  val GL_PERSPECTIVE_CORRECTION_HINT: UShort = 0x0C50.toUShort
  val GL_POINT_SMOOTH_HINT: UShort = 0x0C51.toUShort
  val GL_LINE_SMOOTH_HINT: UShort = 0x0C52.toUShort
  val GL_POLYGON_SMOOTH_HINT: UShort = 0x0C53.toUShort
  val GL_FOG_HINT: UShort = 0x0C54.toUShort
  val GL_DONT_CARE: UShort = 0x1100.toUShort
  val GL_FASTEST: UShort = 0x1101.toUShort
  val GL_NICEST: UShort = 0x1102.toUShort
  
  /* Scissor box */
  val GL_SCISSOR_BOX: UShort = 0x0C10.toUShort
  val GL_SCISSOR_TEST: UShort = 0x0C11.toUShort
  
  /* Pixel Mode / Transfer */
  val GL_MAP_COLOR: UShort = 0x0D10.toUShort
  val GL_MAP_STENCIL: UShort = 0x0D11.toUShort
  val GL_INDEX_SHIFT: UShort = 0x0D12.toUShort
  val GL_INDEX_OFFSET: UShort = 0x0D13.toUShort
  val GL_RED_SCALE: UShort = 0x0D14.toUShort
  val GL_RED_BIAS: UShort = 0x0D15.toUShort
  val GL_GREEN_SCALE: UShort = 0x0D18.toUShort
  val GL_GREEN_BIAS: UShort = 0x0D19.toUShort
  val GL_BLUE_SCALE: UShort = 0x0D1A.toUShort
  val GL_BLUE_BIAS: UShort = 0x0D1B.toUShort
  val GL_ALPHA_SCALE: UShort = 0x0D1C.toUShort
  val GL_ALPHA_BIAS: UShort = 0x0D1D.toUShort
  val GL_DEPTH_SCALE: UShort = 0x0D1E.toUShort
  val GL_DEPTH_BIAS: UShort = 0x0D1F.toUShort
  val GL_PIXEL_MAP_S_TO_S_SIZE: UShort = 0x0CB1.toUShort
  val GL_PIXEL_MAP_I_TO_I_SIZE: UShort = 0x0CB0.toUShort
  val GL_PIXEL_MAP_I_TO_R_SIZE: UShort = 0x0CB2.toUShort
  val GL_PIXEL_MAP_I_TO_G_SIZE: UShort = 0x0CB3.toUShort
  val GL_PIXEL_MAP_I_TO_B_SIZE: UShort = 0x0CB4.toUShort
  val GL_PIXEL_MAP_I_TO_A_SIZE: UShort = 0x0CB5.toUShort
  val GL_PIXEL_MAP_R_TO_R_SIZE: UShort = 0x0CB6.toUShort
  val GL_PIXEL_MAP_G_TO_G_SIZE: UShort = 0x0CB7.toUShort
  val GL_PIXEL_MAP_B_TO_B_SIZE: UShort = 0x0CB8.toUShort
  val GL_PIXEL_MAP_A_TO_A_SIZE: UShort = 0x0CB9.toUShort
  val GL_PIXEL_MAP_S_TO_S: UShort = 0x0C71.toUShort
  val GL_PIXEL_MAP_I_TO_I: UShort = 0x0C70.toUShort
  val GL_PIXEL_MAP_I_TO_R: UShort = 0x0C72.toUShort
  val GL_PIXEL_MAP_I_TO_G: UShort = 0x0C73.toUShort
  val GL_PIXEL_MAP_I_TO_B: UShort = 0x0C74.toUShort
  val GL_PIXEL_MAP_I_TO_A: UShort = 0x0C75.toUShort
  val GL_PIXEL_MAP_R_TO_R: UShort = 0x0C76.toUShort
  val GL_PIXEL_MAP_G_TO_G: UShort = 0x0C77.toUShort
  val GL_PIXEL_MAP_B_TO_B: UShort = 0x0C78.toUShort
  val GL_PIXEL_MAP_A_TO_A: UShort = 0x0C79.toUShort
  val GL_PACK_ALIGNMENT: UShort = 0x0D05.toUShort
  val GL_PACK_LSB_FIRST: UShort = 0x0D01.toUShort
  val GL_PACK_ROW_LENGTH: UShort = 0x0D02.toUShort
  val GL_PACK_SKIP_PIXELS: UShort = 0x0D04.toUShort
  val GL_PACK_SKIP_ROWS: UShort = 0x0D03.toUShort
  val GL_PACK_SWAP_BYTES: UShort = 0x0D00.toUShort
  val GL_UNPACK_ALIGNMENT: UShort = 0x0CF5.toUShort
  val GL_UNPACK_LSB_FIRST: UShort = 0x0CF1.toUShort
  val GL_UNPACK_ROW_LENGTH: UShort = 0x0CF2.toUShort
  val GL_UNPACK_SKIP_PIXELS: UShort = 0x0CF4.toUShort
  val GL_UNPACK_SKIP_ROWS: UShort = 0x0CF3.toUShort
  val GL_UNPACK_SWAP_BYTES: UShort = 0x0CF0.toUShort
  val GL_ZOOM_X: UShort = 0x0D16.toUShort
  val GL_ZOOM_Y: UShort = 0x0D17.toUShort

  /* Texture mapping */
  val GL_TEXTURE_ENV: UShort = 0x2300.toUShort
  val GL_TEXTURE_ENV_MODE: UShort = 0x2200.toUShort
  val GL_TEXTURE_1D: UShort = 0x0DE0.toUShort
  val GL_TEXTURE_2D: UShort = 0x0DE1.toUShort
  val GL_TEXTURE_WRAP_S: UShort = 0x2802.toUShort
  val GL_TEXTURE_WRAP_T: UShort = 0x2803.toUShort
  val GL_TEXTURE_MAG_FILTER: UShort = 0x2800.toUShort
  val GL_TEXTURE_MIN_FILTER: UShort = 0x2801.toUShort
  val GL_TEXTURE_ENV_COLOR: UShort = 0x2201.toUShort
  val GL_TEXTURE_GEN_S: UShort = 0x0C60.toUShort
  val GL_TEXTURE_GEN_T: UShort = 0x0C61.toUShort
  val GL_TEXTURE_GEN_R: UShort = 0x0C62.toUShort
  val GL_TEXTURE_GEN_Q: UShort = 0x0C63.toUShort
  val GL_TEXTURE_GEN_MODE: UShort = 0x2500.toUShort
  val GL_TEXTURE_BORDER_COLOR: UShort = 0x1004.toUShort
  val GL_TEXTURE_WIDTH: UShort = 0x1000.toUShort
  val GL_TEXTURE_HEIGHT: UShort = 0x1001.toUShort
  val GL_TEXTURE_BORDER: UShort = 0x1005.toUShort
  val GL_TEXTURE_COMPONENTS: UShort = 0x1003.toUShort
  val GL_TEXTURE_RED_SIZE: UShort = 0x805C.toUShort
  val GL_TEXTURE_GREEN_SIZE: UShort = 0x805D.toUShort
  val GL_TEXTURE_BLUE_SIZE: UShort = 0x805E.toUShort
  val GL_TEXTURE_ALPHA_SIZE: UShort = 0x805F.toUShort
  val GL_TEXTURE_LUMINANCE_SIZE: UShort = 0x8060.toUShort
  val GL_TEXTURE_INTENSITY_SIZE: UShort = 0x8061.toUShort
  val GL_NEAREST_MIPMAP_NEAREST: UShort = 0x2700.toUShort
  val GL_NEAREST_MIPMAP_LINEAR: UShort = 0x2702.toUShort
  val GL_LINEAR_MIPMAP_NEAREST: UShort = 0x2701.toUShort
  val GL_LINEAR_MIPMAP_LINEAR: UShort = 0x2703.toUShort
  val GL_OBJECT_LINEAR: UShort = 0x2401.toUShort
  val GL_OBJECT_PLANE: UShort = 0x2501.toUShort
  val GL_EYE_LINEAR: UShort = 0x2400.toUShort
  val GL_EYE_PLANE: UShort = 0x2502.toUShort
  val GL_SPHERE_MAP: UShort = 0x2402.toUShort
  val GL_DECAL: UShort = 0x2101.toUShort
  val GL_MODULATE: UShort = 0x2100.toUShort
  val GL_NEAREST: UShort = 0x2600.toUShort
  val GL_REPEAT: UShort = 0x2901.toUShort
  val GL_CLAMP: UShort = 0x2900.toUShort
  val GL_S: UShort = 0x2000.toUShort
  val GL_T: UShort = 0x2001.toUShort
  val GL_R: UShort = 0x2002.toUShort
  val GL_Q: UShort = 0x2003.toUShort
  
  /* Utility */
  val GL_VENDOR: UShort = 0x1F00.toUShort
  val GL_RENDERER: UShort = 0x1F01.toUShort
  val GL_VERSION: UShort = 0x1F02.toUShort
  val GL_EXTENSIONS: UShort = 0x1F03.toUShort
  
  /* Errors */
  val GL_NO_ERROR: UShort = 0.toUShort
  val GL_INVALID_ENUM: UShort = 0x0500.toUShort
  val GL_INVALID_VALUE: UShort = 0x0501.toUShort
  val GL_INVALID_OPERATION: UShort = 0x0502.toUShort
  val GL_STACK_OVERFLOW: UShort = 0x0503.toUShort
  val GL_STACK_UNDERFLOW: UShort = 0x0504.toUShort
  val GL_OUT_OF_MEMORY: UShort = 0x0505.toUShort

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

  /* OpenGL 1.1 */
  val GL_PROXY_TEXTURE_1D: UShort = 0x8063.toUShort
  val GL_PROXY_TEXTURE_2D: UShort = 0x8064.toUShort
  val GL_TEXTURE_PRIORITY: UShort = 0x8066.toUShort
  val GL_TEXTURE_RESIDENT: UShort = 0x8067.toUShort
  val GL_TEXTURE_BINDING_1D: UShort = 0x8068.toUShort
  val GL_TEXTURE_BINDING_2D: UShort = 0x8069.toUShort
  val GL_TEXTURE_INTERNAL_FORMAT: UShort = 0x1003.toUShort
  val GL_ALPHA4: UShort = 0x803B.toUShort
  val GL_ALPHA8: UShort = 0x803C.toUShort
  val GL_ALPHA12: UShort = 0x803D.toUShort
  val GL_ALPHA16: UShort = 0x803E.toUShort
  val GL_LUMINANCE4: UShort = 0x803F.toUShort
  val GL_LUMINANCE8: UShort = 0x8040.toUShort
  val GL_LUMINANCE12: UShort = 0x8041.toUShort
  val GL_LUMINANCE16: UShort = 0x8042.toUShort
  val GL_LUMINANCE4_ALPHA4: UShort = 0x8043.toUShort
  val GL_LUMINANCE6_ALPHA2: UShort = 0x8044.toUShort
  val GL_LUMINANCE8_ALPHA8: UShort = 0x8045.toUShort
  val GL_LUMINANCE12_ALPHA4: UShort = 0x8046.toUShort
  val GL_LUMINANCE12_ALPHA12: UShort = 0x8047.toUShort
  val GL_LUMINANCE16_ALPHA16: UShort = 0x8048.toUShort
  val GL_INTENSITY: UShort = 0x8049.toUShort
  val GL_INTENSITY4: UShort = 0x804A.toUShort
  val GL_INTENSITY8: UShort = 0x804B.toUShort
  val GL_INTENSITY12: UShort = 0x804C.toUShort
  val GL_INTENSITY16: UShort = 0x804D.toUShort
  val GL_R3_G3_B2: UShort = 0x2A10.toUShort
  val GL_RGB4: UShort = 0x804F.toUShort
  val GL_RGB5: UShort = 0x8050.toUShort
  val GL_RGB8: UShort = 0x8051.toUShort
  val GL_RGB10: UShort = 0x8052.toUShort
  val GL_RGB12: UShort = 0x8053.toUShort
  val GL_RGB16: UShort = 0x8054.toUShort
  val GL_RGBA2: UShort = 0x8055.toUShort
  val GL_RGBA4: UShort = 0x8056.toUShort
  val GL_RGB5_A1: UShort = 0x8057.toUShort
  val GL_RGBA8: UShort = 0x8058.toUShort
  val GL_RGB10_A2: UShort = 0x8059.toUShort
  val GL_RGBA12: UShort = 0x805A.toUShort
  val GL_RGBA16: UShort = 0x805B.toUShort
  val GL_CLIENT_PIXEL_STORE_BIT: UInt = 0x00000001.toUInt
  val GL_CLIENT_VERTEX_ARRAY_BIT: UInt = 0x00000002.toUInt
  val GL_ALL_CLIENT_ATTRIB_BITS: UInt = 0xFFFFFFFF.toUInt
  val GL_CLIENT_ALL_ATTRIB_BITS: UInt = 0xFFFFFFFF.toUInt

  /*
   * OpenGL 1.2
   */
  val GL_RESCALE_NORMAL: UShort = 0x803A.toUShort
  val GL_CLAMP_TO_EDGE: UShort = 0x812F.toUShort
  val GL_MAX_ELEMENTS_VERTICES: UShort = 0x80E8.toUShort
  val GL_MAX_ELEMENTS_INDICES: UShort = 0x80E9.toUShort
  val GL_BGR: UShort = 0x80E0.toUShort
  val GL_BGRA: UShort = 0x80E1.toUShort
  val GL_UNSIGNED_BYTE_3_3_2: UShort = 0x8032.toUShort
  val GL_UNSIGNED_BYTE_2_3_3_REV: UShort = 0x8362.toUShort
  val GL_UNSIGNED_SHORT_5_6_5: UShort = 0x8363.toUShort
  val GL_UNSIGNED_SHORT_5_6_5_REV: UShort = 0x8364.toUShort
  val GL_UNSIGNED_SHORT_4_4_4_4: UShort = 0x8033.toUShort
  val GL_UNSIGNED_SHORT_4_4_4_4_REV: UShort = 0x8365.toUShort
  val GL_UNSIGNED_SHORT_5_5_5_1: UShort = 0x8034.toUShort
  val GL_UNSIGNED_SHORT_1_5_5_5_REV: UShort = 0x8366.toUShort
  val GL_UNSIGNED_INT_8_8_8_8: UShort = 0x8035.toUShort
  val GL_UNSIGNED_INT_8_8_8_8_REV: UShort = 0x8367.toUShort
  val GL_UNSIGNED_INT_10_10_10_2: UShort = 0x8036.toUShort
  val GL_UNSIGNED_INT_2_10_10_10_REV: UShort = 0x8368.toUShort
  val GL_LIGHT_MODEL_COLOR_CONTROL: UShort = 0x81F8.toUShort
  val GL_SINGLE_COLOR: UShort = 0x81F9.toUShort
  val GL_SEPARATE_SPECULAR_COLOR: UShort = 0x81FA.toUShort
  val GL_TEXTURE_MIN_LOD: UShort = 0x813A.toUShort
  val GL_TEXTURE_MAX_LOD: UShort = 0x813B.toUShort
  val GL_TEXTURE_BASE_LEVEL: UShort = 0x813C.toUShort
  val GL_TEXTURE_MAX_LEVEL: UShort = 0x813D.toUShort
  val GL_SMOOTH_POINT_SIZE_RANGE: UShort = 0x0B12.toUShort
  val GL_SMOOTH_POINT_SIZE_GRANULARITY: UShort = 0x0B13.toUShort
  val GL_SMOOTH_LINE_WIDTH_RANGE: UShort = 0x0B22.toUShort
  val GL_SMOOTH_LINE_WIDTH_GRANULARITY: UShort = 0x0B23.toUShort
  val GL_ALIASED_POINT_SIZE_RANGE: UShort = 0x846D.toUShort
  val GL_ALIASED_LINE_WIDTH_RANGE: UShort = 0x846E.toUShort
  val GL_PACK_SKIP_IMAGES: UShort = 0x806B.toUShort
  val GL_PACK_IMAGE_HEIGHT: UShort = 0x806C.toUShort
  val GL_UNPACK_SKIP_IMAGES: UShort = 0x806D.toUShort
  val GL_UNPACK_IMAGE_HEIGHT: UShort = 0x806E.toUShort
  val GL_TEXTURE_3D: UShort = 0x806F.toUShort
  val GL_PROXY_TEXTURE_3D: UShort = 0x8070.toUShort
  val GL_TEXTURE_DEPTH: UShort = 0x8071.toUShort
  val GL_TEXTURE_WRAP_R: UShort = 0x8072.toUShort
  val GL_MAX_3D_TEXTURE_SIZE: UShort = 0x8073.toUShort
  val GL_TEXTURE_BINDING_3D: UShort = 0x806A.toUShort

  /*
   * GL_ARB_imaging
   */
  val GL_CONSTANT_COLOR: UShort = 0x8001.toUShort
  val GL_ONE_MINUS_CONSTANT_COLOR: UShort = 0x8002.toUShort
  val GL_CONSTANT_ALPHA: UShort = 0x8003.toUShort
  val GL_ONE_MINUS_CONSTANT_ALPHA: UShort = 0x8004.toUShort
  val GL_COLOR_TABLE: UShort = 0x80D0.toUShort
  val GL_POST_CONVOLUTION_COLOR_TABLE: UShort = 0x80D1.toUShort
  val GL_POST_COLOR_MATRIX_COLOR_TABLE: UShort = 0x80D2.toUShort
  val GL_PROXY_COLOR_TABLE: UShort = 0x80D3.toUShort
  val GL_PROXY_POST_CONVOLUTION_COLOR_TABLE: UShort = 0x80D4.toUShort
  val GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE: UShort = 0x80D5.toUShort
  val GL_COLOR_TABLE_SCALE: UShort = 0x80D6.toUShort
  val GL_COLOR_TABLE_BIAS: UShort = 0x80D7.toUShort
  val GL_COLOR_TABLE_FORMAT: UShort = 0x80D8.toUShort
  val GL_COLOR_TABLE_WIDTH: UShort = 0x80D9.toUShort
  val GL_COLOR_TABLE_RED_SIZE: UShort = 0x80DA.toUShort
  val GL_COLOR_TABLE_GREEN_SIZE: UShort = 0x80DB.toUShort
  val GL_COLOR_TABLE_BLUE_SIZE: UShort = 0x80DC.toUShort
  val GL_COLOR_TABLE_ALPHA_SIZE: UShort = 0x80DD.toUShort
  val GL_COLOR_TABLE_LUMINANCE_SIZE: UShort = 0x80DE.toUShort
  val GL_COLOR_TABLE_INTENSITY_SIZE: UShort = 0x80DF.toUShort
  val GL_CONVOLUTION_1D: UShort = 0x8010.toUShort
  val GL_CONVOLUTION_2D: UShort = 0x8011.toUShort
  val GL_SEPARABLE_2D: UShort = 0x8012.toUShort
  val GL_CONVOLUTION_BORDER_MODE: UShort = 0x8013.toUShort
  val GL_CONVOLUTION_FILTER_SCALE: UShort = 0x8014.toUShort
  val GL_CONVOLUTION_FILTER_BIAS: UShort = 0x8015.toUShort
  val GL_REDUCE: UShort = 0x8016.toUShort
  val GL_CONVOLUTION_FORMAT: UShort = 0x8017.toUShort
  val GL_CONVOLUTION_WIDTH: UShort = 0x8018.toUShort
  val GL_CONVOLUTION_HEIGHT: UShort = 0x8019.toUShort
  val GL_MAX_CONVOLUTION_WIDTH: UShort = 0x801A.toUShort
  val GL_MAX_CONVOLUTION_HEIGHT: UShort = 0x801B.toUShort
  val GL_POST_CONVOLUTION_RED_SCALE: UShort = 0x801C.toUShort
  val GL_POST_CONVOLUTION_GREEN_SCALE: UShort = 0x801D.toUShort
  val GL_POST_CONVOLUTION_BLUE_SCALE: UShort = 0x801E.toUShort
  val GL_POST_CONVOLUTION_ALPHA_SCALE: UShort = 0x801F.toUShort
  val GL_POST_CONVOLUTION_RED_BIAS: UShort = 0x8020.toUShort
  val GL_POST_CONVOLUTION_GREEN_BIAS: UShort = 0x8021.toUShort
  val GL_POST_CONVOLUTION_BLUE_BIAS: UShort = 0x8022.toUShort
  val GL_POST_CONVOLUTION_ALPHA_BIAS: UShort = 0x8023.toUShort
  val GL_CONSTANT_BORDER: UShort = 0x8151.toUShort
  val GL_REPLICATE_BORDER: UShort = 0x8153.toUShort
  val GL_CONVOLUTION_BORDER_COLOR: UShort = 0x8154.toUShort
  val GL_COLOR_MATRIX: UShort = 0x80B1.toUShort
  val GL_COLOR_MATRIX_STACK_DEPTH: UShort = 0x80B2.toUShort
  val GL_MAX_COLOR_MATRIX_STACK_DEPTH: UShort = 0x80B3.toUShort
  val GL_POST_COLOR_MATRIX_RED_SCALE: UShort = 0x80B4.toUShort
  val GL_POST_COLOR_MATRIX_GREEN_SCALE: UShort = 0x80B5.toUShort
  val GL_POST_COLOR_MATRIX_BLUE_SCALE: UShort = 0x80B6.toUShort
  val GL_POST_COLOR_MATRIX_ALPHA_SCALE: UShort = 0x80B7.toUShort
  val GL_POST_COLOR_MATRIX_RED_BIAS: UShort = 0x80B8.toUShort
  val GL_POST_COLOR_MATRIX_GREEN_BIAS: UShort = 0x80B9.toUShort
  val GL_POST_COLOR_MATRIX_BLUE_BIAS: UShort = 0x80BA.toUShort
  val GL_POST_COLOR_MATRIX_ALPHA_BIAS: UShort = 0x80BB.toUShort
  val GL_HISTOGRAM: UShort = 0x8024.toUShort
  val GL_PROXY_HISTOGRAM: UShort = 0x8025.toUShort
  val GL_HISTOGRAM_WIDTH: UShort = 0x8026.toUShort
  val GL_HISTOGRAM_FORMAT: UShort = 0x8027.toUShort
  val GL_HISTOGRAM_RED_SIZE: UShort = 0x8028.toUShort
  val GL_HISTOGRAM_GREEN_SIZE: UShort = 0x8029.toUShort
  val GL_HISTOGRAM_BLUE_SIZE: UShort = 0x802A.toUShort
  val GL_HISTOGRAM_ALPHA_SIZE: UShort = 0x802B.toUShort
  val GL_HISTOGRAM_LUMINANCE_SIZE: UShort = 0x802C.toUShort
  val GL_HISTOGRAM_SINK: UShort = 0x802D.toUShort
  val GL_MINMAX: UShort = 0x802E.toUShort
  val GL_MINMAX_FORMAT: UShort = 0x802F.toUShort
  val GL_MINMAX_SINK: UShort = 0x8030.toUShort
  val GL_TABLE_TOO_LARGE: UShort = 0x8031.toUShort
  val GL_BLEND_EQUATION: UShort = 0x8009.toUShort
  val GL_MIN: UShort = 0x8007.toUShort
  val GL_MAX: UShort = 0x8008.toUShort
  val GL_FUNC_ADD: UShort = 0x8006.toUShort
  val GL_FUNC_SUBTRACT: UShort = 0x800A.toUShort
  val GL_FUNC_REVERSE_SUBTRACT: UShort = 0x800B.toUShort
  val GL_BLEND_COLOR: UShort = 0x8005.toUShort

  /*
   * OpenGL 1.3
   */

  /* multitexture */
  val GL_TEXTURE0: UShort = 0x84C0.toUShort
  val GL_TEXTURE1: UShort = 0x84C1.toUShort
  val GL_TEXTURE2: UShort = 0x84C2.toUShort
  val GL_TEXTURE3: UShort = 0x84C3.toUShort
  val GL_TEXTURE4: UShort = 0x84C4.toUShort
  val GL_TEXTURE5: UShort = 0x84C5.toUShort
  val GL_TEXTURE6: UShort = 0x84C6.toUShort
  val GL_TEXTURE7: UShort = 0x84C7.toUShort
  val GL_TEXTURE8: UShort = 0x84C8.toUShort
  val GL_TEXTURE9: UShort = 0x84C9.toUShort
  val GL_TEXTURE10: UShort = 0x84CA.toUShort
  val GL_TEXTURE11: UShort = 0x84CB.toUShort
  val GL_TEXTURE12: UShort = 0x84CC.toUShort
  val GL_TEXTURE13: UShort = 0x84CD.toUShort
  val GL_TEXTURE14: UShort = 0x84CE.toUShort
  val GL_TEXTURE15: UShort = 0x84CF.toUShort
  val GL_TEXTURE16: UShort = 0x84D0.toUShort
  val GL_TEXTURE17: UShort = 0x84D1.toUShort
  val GL_TEXTURE18: UShort = 0x84D2.toUShort
  val GL_TEXTURE19: UShort = 0x84D3.toUShort
  val GL_TEXTURE20: UShort = 0x84D4.toUShort
  val GL_TEXTURE21: UShort = 0x84D5.toUShort
  val GL_TEXTURE22: UShort = 0x84D6.toUShort
  val GL_TEXTURE23: UShort = 0x84D7.toUShort
  val GL_TEXTURE24: UShort = 0x84D8.toUShort
  val GL_TEXTURE25: UShort = 0x84D9.toUShort
  val GL_TEXTURE26: UShort = 0x84DA.toUShort
  val GL_TEXTURE27: UShort = 0x84DB.toUShort
  val GL_TEXTURE28: UShort = 0x84DC.toUShort
  val GL_TEXTURE29: UShort = 0x84DD.toUShort
  val GL_TEXTURE30: UShort = 0x84DE.toUShort
  val GL_TEXTURE31: UShort = 0x84DF.toUShort
  val GL_ACTIVE_TEXTURE: UShort = 0x84E0.toUShort
  val GL_CLIENT_ACTIVE_TEXTURE: UShort = 0x84E1.toUShort
  val GL_MAX_TEXTURE_UNITS: UShort = 0x84E2.toUShort
  /* texture_cube_map */
  val GL_NORMAL_MAP: UShort = 0x8511.toUShort
  val GL_REFLECTION_MAP: UShort = 0x8512.toUShort
  val GL_TEXTURE_CUBE_MAP: UShort = 0x8513.toUShort
  val GL_TEXTURE_BINDING_CUBE_MAP: UShort = 0x8514.toUShort
  val GL_TEXTURE_CUBE_MAP_POSITIVE_X: UShort = 0x8515.toUShort
  val GL_TEXTURE_CUBE_MAP_NEGATIVE_X: UShort = 0x8516.toUShort
  val GL_TEXTURE_CUBE_MAP_POSITIVE_Y: UShort = 0x8517.toUShort
  val GL_TEXTURE_CUBE_MAP_NEGATIVE_Y: UShort = 0x8518.toUShort
  val GL_TEXTURE_CUBE_MAP_POSITIVE_Z: UShort = 0x8519.toUShort
  val GL_TEXTURE_CUBE_MAP_NEGATIVE_Z: UShort = 0x851A.toUShort
  val GL_PROXY_TEXTURE_CUBE_MAP: UShort = 0x851B.toUShort
  val GL_MAX_CUBE_MAP_TEXTURE_SIZE: UShort = 0x851C.toUShort
  /* texture_compression */
  val GL_COMPRESSED_ALPHA: UShort = 0x84E9.toUShort
  val GL_COMPRESSED_LUMINANCE: UShort = 0x84EA.toUShort
  val GL_COMPRESSED_LUMINANCE_ALPHA: UShort = 0x84EB.toUShort
  val GL_COMPRESSED_INTENSITY: UShort = 0x84EC.toUShort
  val GL_COMPRESSED_RGB: UShort = 0x84ED.toUShort
  val GL_COMPRESSED_RGBA: UShort = 0x84EE.toUShort
  val GL_TEXTURE_COMPRESSION_HINT: UShort = 0x84EF.toUShort
  val GL_TEXTURE_COMPRESSED_IMAGE_SIZE: UShort = 0x86A0.toUShort
  val GL_TEXTURE_COMPRESSED: UShort = 0x86A1.toUShort
  val GL_NUM_COMPRESSED_TEXTURE_FORMATS: UShort = 0x86A2.toUShort
  val GL_COMPRESSED_TEXTURE_FORMATS: UShort = 0x86A3.toUShort
  /* multisample */
  val GL_MULTISAMPLE: UShort = 0x809D.toUShort
  val GL_SAMPLE_ALPHA_TO_COVERAGE: UShort = 0x809E.toUShort
  val GL_SAMPLE_ALPHA_TO_ONE: UShort = 0x809F.toUShort
  val GL_SAMPLE_COVERAGE: UShort = 0x80A0.toUShort
  val GL_SAMPLE_BUFFERS: UShort = 0x80A8.toUShort
  val GL_SAMPLES: UShort = 0x80A9.toUShort
  val GL_SAMPLE_COVERAGE_VALUE: UShort = 0x80AA.toUShort
  val GL_SAMPLE_COVERAGE_INVERT: UShort = 0x80AB.toUShort
  val GL_MULTISAMPLE_BIT: UInt = 0x20000000.toUInt
  /* transpose_matrix */
  val GL_TRANSPOSE_MODELVIEW_MATRIX: UShort = 0x84E3.toUShort
  val GL_TRANSPOSE_PROJECTION_MATRIX: UShort = 0x84E4.toUShort
  val GL_TRANSPOSE_TEXTURE_MATRIX: UShort = 0x84E5.toUShort
  val GL_TRANSPOSE_COLOR_MATRIX: UShort = 0x84E6.toUShort
  /* texture_env_combine */
  val GL_COMBINE: UShort = 0x8570.toUShort
  val GL_COMBINE_RGB: UShort = 0x8571.toUShort
  val GL_COMBINE_ALPHA: UShort = 0x8572.toUShort
  val GL_SOURCE0_RGB: UShort = 0x8580.toUShort
  val GL_SOURCE1_RGB: UShort = 0x8581.toUShort
  val GL_SOURCE2_RGB: UShort = 0x8582.toUShort
  val GL_SOURCE0_ALPHA: UShort = 0x8588.toUShort
  val GL_SOURCE1_ALPHA: UShort = 0x8589.toUShort
  val GL_SOURCE2_ALPHA: UShort = 0x858A.toUShort
  val GL_OPERAND0_RGB: UShort = 0x8590.toUShort
  val GL_OPERAND1_RGB: UShort = 0x8591.toUShort
  val GL_OPERAND2_RGB: UShort = 0x8592.toUShort
  val GL_OPERAND0_ALPHA: UShort = 0x8598.toUShort
  val GL_OPERAND1_ALPHA: UShort = 0x8599.toUShort
  val GL_OPERAND2_ALPHA: UShort = 0x859A.toUShort
  val GL_RGB_SCALE: UShort = 0x8573.toUShort
  val GL_ADD_SIGNED: UShort = 0x8574.toUShort
  val GL_INTERPOLATE: UShort = 0x8575.toUShort
  val GL_SUBTRACT: UShort = 0x84E7.toUShort
  val GL_CONSTANT: UShort = 0x8576.toUShort
  val GL_PRIMARY_COLOR: UShort = 0x8577.toUShort
  val GL_PREVIOUS: UShort = 0x8578.toUShort
  /* texture_env_dot3 */
  val GL_DOT3_RGB: UShort = 0x86AE.toUShort
  val GL_DOT3_RGBA: UShort = 0x86AF.toUShort
  /* texture_border_clamp */
  val GL_CLAMP_TO_BORDER: UShort = 0x812D.toUShort

}

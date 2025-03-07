/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.nio.ShortBuffer;
/*     */ import org.lwjgl.BufferChecks;
/*     */ import org.lwjgl.MemoryUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class GL42
/*     */ {
/*     */   public static final int GL_COMPRESSED_RGBA_BPTC_UNORM = 36492;
/*     */   public static final int GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM = 36493;
/*     */   public static final int GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT = 36494;
/*     */   public static final int GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT = 36495;
/*     */   public static final int GL_UNPACK_COMPRESSED_BLOCK_WIDTH = 37159;
/*     */   public static final int GL_UNPACK_COMPRESSED_BLOCK_HEIGHT = 37160;
/*     */   public static final int GL_UNPACK_COMPRESSED_BLOCK_DEPTH = 37161;
/*     */   public static final int GL_UNPACK_COMPRESSED_BLOCK_SIZE = 37162;
/*     */   public static final int GL_PACK_COMPRESSED_BLOCK_WIDTH = 37163;
/*     */   public static final int GL_PACK_COMPRESSED_BLOCK_HEIGHT = 37164;
/*     */   public static final int GL_PACK_COMPRESSED_BLOCK_DEPTH = 37165;
/*     */   public static final int GL_PACK_COMPRESSED_BLOCK_SIZE = 37166;
/*     */   public static final int GL_ATOMIC_COUNTER_BUFFER = 37568;
/*     */   public static final int GL_ATOMIC_COUNTER_BUFFER_BINDING = 37569;
/*     */   public static final int GL_ATOMIC_COUNTER_BUFFER_START = 37570;
/*     */   public static final int GL_ATOMIC_COUNTER_BUFFER_SIZE = 37571;
/*     */   public static final int GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE = 37572;
/*     */   public static final int GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS = 37573;
/*     */   public static final int GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES = 37574;
/*     */   public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER = 37575;
/*     */   public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER = 37576;
/*     */   public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER = 37577;
/*     */   public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER = 37578;
/*     */   public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER = 37579;
/*     */   public static final int GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS = 37580;
/*     */   public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS = 37581;
/*     */   public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = 37582;
/*     */   public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS = 37583;
/*     */   public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS = 37584;
/*     */   public static final int GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS = 37585;
/*     */   public static final int GL_MAX_VERTEX_ATOMIC_COUNTERS = 37586;
/*     */   public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS = 37587;
/*     */   public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS = 37588;
/*     */   public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTERS = 37589;
/*     */   public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTERS = 37590;
/*     */   public static final int GL_MAX_COMBINED_ATOMIC_COUNTERS = 37591;
/*     */   public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE = 37592;
/*     */   public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS = 37596;
/*     */   public static final int GL_ACTIVE_ATOMIC_COUNTER_BUFFERS = 37593;
/*     */   public static final int GL_UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX = 37594;
/*     */   public static final int GL_UNSIGNED_INT_ATOMIC_COUNTER = 37595;
/*     */   public static final int GL_TEXTURE_IMMUTABLE_FORMAT = 37167;
/*     */   public static final int GL_MAX_IMAGE_UNITS = 36664;
/*     */   public static final int GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS = 36665;
/*     */   public static final int GL_MAX_IMAGE_SAMPLES = 36973;
/*     */   public static final int GL_MAX_VERTEX_IMAGE_UNIFORMS = 37066;
/*     */   public static final int GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS = 37067;
/*     */   public static final int GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS = 37068;
/*     */   public static final int GL_MAX_GEOMETRY_IMAGE_UNIFORMS = 37069;
/*     */   public static final int GL_MAX_FRAGMENT_IMAGE_UNIFORMS = 37070;
/*     */   public static final int GL_MAX_COMBINED_IMAGE_UNIFORMS = 37071;
/*     */   public static final int GL_IMAGE_BINDING_NAME = 36666;
/*     */   public static final int GL_IMAGE_BINDING_LEVEL = 36667;
/*     */   public static final int GL_IMAGE_BINDING_LAYERED = 36668;
/*     */   public static final int GL_IMAGE_BINDING_LAYER = 36669;
/*     */   public static final int GL_IMAGE_BINDING_ACCESS = 36670;
/*     */   public static final int GL_IMAGE_BINDING_FORMAT = 36974;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT = 1;
/*     */   public static final int GL_ELEMENT_ARRAY_BARRIER_BIT = 2;
/*     */   public static final int GL_UNIFORM_BARRIER_BIT = 4;
/*     */   public static final int GL_TEXTURE_FETCH_BARRIER_BIT = 8;
/*     */   public static final int GL_SHADER_IMAGE_ACCESS_BARRIER_BIT = 32;
/*     */   public static final int GL_COMMAND_BARRIER_BIT = 64;
/*     */   public static final int GL_PIXEL_BUFFER_BARRIER_BIT = 128;
/*     */   public static final int GL_TEXTURE_UPDATE_BARRIER_BIT = 256;
/*     */   public static final int GL_BUFFER_UPDATE_BARRIER_BIT = 512;
/*     */   public static final int GL_FRAMEBUFFER_BARRIER_BIT = 1024;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_BARRIER_BIT = 2048;
/*     */   public static final int GL_ATOMIC_COUNTER_BARRIER_BIT = 4096;
/*     */   public static final int GL_ALL_BARRIER_BITS = -1;
/*     */   public static final int GL_IMAGE_1D = 36940;
/*     */   public static final int GL_IMAGE_2D = 36941;
/*     */   public static final int GL_IMAGE_3D = 36942;
/*     */   public static final int GL_IMAGE_2D_RECT = 36943;
/*     */   public static final int GL_IMAGE_CUBE = 36944;
/*     */   public static final int GL_IMAGE_BUFFER = 36945;
/*     */   public static final int GL_IMAGE_1D_ARRAY = 36946;
/*     */   public static final int GL_IMAGE_2D_ARRAY = 36947;
/*     */   public static final int GL_IMAGE_CUBE_MAP_ARRAY = 36948;
/*     */   public static final int GL_IMAGE_2D_MULTISAMPLE = 36949;
/*     */   public static final int GL_IMAGE_2D_MULTISAMPLE_ARRAY = 36950;
/*     */   public static final int GL_INT_IMAGE_1D = 36951;
/*     */   public static final int GL_INT_IMAGE_2D = 36952;
/*     */   public static final int GL_INT_IMAGE_3D = 36953;
/*     */   public static final int GL_INT_IMAGE_2D_RECT = 36954;
/*     */   public static final int GL_INT_IMAGE_CUBE = 36955;
/*     */   public static final int GL_INT_IMAGE_BUFFER = 36956;
/*     */   public static final int GL_INT_IMAGE_1D_ARRAY = 36957;
/*     */   public static final int GL_INT_IMAGE_2D_ARRAY = 36958;
/*     */   public static final int GL_INT_IMAGE_CUBE_MAP_ARRAY = 36959;
/*     */   public static final int GL_INT_IMAGE_2D_MULTISAMPLE = 36960;
/*     */   public static final int GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 36961;
/*     */   public static final int GL_UNSIGNED_INT_IMAGE_1D = 36962;
/*     */   public static final int GL_UNSIGNED_INT_IMAGE_2D = 36963;
/*     */   public static final int GL_UNSIGNED_INT_IMAGE_3D = 36964;
/*     */   public static final int GL_UNSIGNED_INT_IMAGE_2D_RECT = 36965;
/*     */   public static final int GL_UNSIGNED_INT_IMAGE_CUBE = 36966;
/*     */   public static final int GL_UNSIGNED_INT_IMAGE_BUFFER = 36967;
/*     */   public static final int GL_UNSIGNED_INT_IMAGE_1D_ARRAY = 36968;
/*     */   public static final int GL_UNSIGNED_INT_IMAGE_2D_ARRAY = 36969;
/*     */   public static final int GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY = 36970;
/*     */   public static final int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE = 36971;
/*     */   public static final int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 36972;
/*     */   public static final int GL_IMAGE_FORMAT_COMPATIBILITY_TYPE = 37063;
/*     */   public static final int GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE = 37064;
/*     */   public static final int IMAGE_FORMAT_COMPATIBILITY_BY_CLASS = 37065;
/*     */   public static final int GL_NUM_SAMPLE_COUNTS = 37760;
/*     */   public static final int GL_MIN_MAP_BUFFER_ALIGNMENT = 37052;
/*     */   
/*     */   public static void glGetActiveAtomicCounterBuffer(int program, int bufferIndex, int pname, IntBuffer params) {
/* 209 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 210 */     long function_pointer = caps.glGetActiveAtomicCounterBufferiv;
/* 211 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 212 */     BufferChecks.checkBuffer(params, 1);
/* 213 */     nglGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, MemoryUtil.getAddress(params), function_pointer);
/*     */   }
/*     */   
/*     */   static native void nglGetActiveAtomicCounterBufferiv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*     */   
/*     */   public static int glGetActiveAtomicCounterBuffer(int program, int bufferIndex, int pname) {
/* 219 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 220 */     long function_pointer = caps.glGetActiveAtomicCounterBufferiv;
/* 221 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 222 */     IntBuffer params = APIUtil.getBufferInt(caps);
/* 223 */     nglGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, MemoryUtil.getAddress(params), function_pointer);
/* 224 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glTexStorage1D(int target, int levels, int internalformat, int width) {
/* 228 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 229 */     long function_pointer = caps.glTexStorage1D;
/* 230 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 231 */     nglTexStorage1D(target, levels, internalformat, width, function_pointer);
/*     */   }
/*     */   static native void nglTexStorage1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glTexStorage2D(int target, int levels, int internalformat, int width, int height) {
/* 236 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 237 */     long function_pointer = caps.glTexStorage2D;
/* 238 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 239 */     nglTexStorage2D(target, levels, internalformat, width, height, function_pointer);
/*     */   }
/*     */   static native void nglTexStorage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth) {
/* 244 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 245 */     long function_pointer = caps.glTexStorage3D;
/* 246 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 247 */     nglTexStorage3D(target, levels, internalformat, width, height, depth, function_pointer);
/*     */   }
/*     */   static native void nglTexStorage3D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*     */   
/*     */   public static void glDrawTransformFeedbackInstanced(int mode, int id, int primcount) {
/* 252 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 253 */     long function_pointer = caps.glDrawTransformFeedbackInstanced;
/* 254 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 255 */     nglDrawTransformFeedbackInstanced(mode, id, primcount, function_pointer);
/*     */   }
/*     */   static native void nglDrawTransformFeedbackInstanced(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glDrawTransformFeedbackStreamInstanced(int mode, int id, int stream, int primcount) {
/* 260 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 261 */     long function_pointer = caps.glDrawTransformFeedbackStreamInstanced;
/* 262 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 263 */     nglDrawTransformFeedbackStreamInstanced(mode, id, stream, primcount, function_pointer);
/*     */   }
/*     */   static native void nglDrawTransformFeedbackStreamInstanced(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glDrawArraysInstancedBaseInstance(int mode, int first, int count, int primcount, int baseinstance) {
/* 268 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 269 */     long function_pointer = caps.glDrawArraysInstancedBaseInstance;
/* 270 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 271 */     nglDrawArraysInstancedBaseInstance(mode, first, count, primcount, baseinstance, function_pointer);
/*     */   }
/*     */   static native void nglDrawArraysInstancedBaseInstance(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glDrawElementsInstancedBaseInstance(int mode, ByteBuffer indices, int primcount, int baseinstance) {
/* 276 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 277 */     long function_pointer = caps.glDrawElementsInstancedBaseInstance;
/* 278 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 279 */     GLChecks.ensureElementVBOdisabled(caps);
/* 280 */     BufferChecks.checkDirect(indices);
/* 281 */     nglDrawElementsInstancedBaseInstance(mode, indices.remaining(), 5121, MemoryUtil.getAddress(indices), primcount, baseinstance, function_pointer);
/*     */   }
/*     */   public static void glDrawElementsInstancedBaseInstance(int mode, IntBuffer indices, int primcount, int baseinstance) {
/* 284 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 285 */     long function_pointer = caps.glDrawElementsInstancedBaseInstance;
/* 286 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 287 */     GLChecks.ensureElementVBOdisabled(caps);
/* 288 */     BufferChecks.checkDirect(indices);
/* 289 */     nglDrawElementsInstancedBaseInstance(mode, indices.remaining(), 5125, MemoryUtil.getAddress(indices), primcount, baseinstance, function_pointer);
/*     */   }
/*     */   public static void glDrawElementsInstancedBaseInstance(int mode, ShortBuffer indices, int primcount, int baseinstance) {
/* 292 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 293 */     long function_pointer = caps.glDrawElementsInstancedBaseInstance;
/* 294 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 295 */     GLChecks.ensureElementVBOdisabled(caps);
/* 296 */     BufferChecks.checkDirect(indices);
/* 297 */     nglDrawElementsInstancedBaseInstance(mode, indices.remaining(), 5123, MemoryUtil.getAddress(indices), primcount, baseinstance, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glDrawElementsInstancedBaseInstance(int mode, int indices_count, int type, long indices_buffer_offset, int primcount, int baseinstance) {
/* 301 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 302 */     long function_pointer = caps.glDrawElementsInstancedBaseInstance;
/* 303 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 304 */     GLChecks.ensureElementVBOenabled(caps);
/* 305 */     nglDrawElementsInstancedBaseInstanceBO(mode, indices_count, type, indices_buffer_offset, primcount, baseinstance, function_pointer);
/*     */   }
/*     */   static native void nglDrawElementsInstancedBaseInstance(int paramInt1, int paramInt2, int paramInt3, long paramLong1, int paramInt4, int paramInt5, long paramLong2);
/*     */   static native void nglDrawElementsInstancedBaseInstanceBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, int paramInt4, int paramInt5, long paramLong2);
/*     */   public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, ByteBuffer indices, int primcount, int basevertex, int baseinstance) {
/* 310 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 311 */     long function_pointer = caps.glDrawElementsInstancedBaseVertexBaseInstance;
/* 312 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 313 */     GLChecks.ensureElementVBOdisabled(caps);
/* 314 */     BufferChecks.checkDirect(indices);
/* 315 */     nglDrawElementsInstancedBaseVertexBaseInstance(mode, indices.remaining(), 5121, MemoryUtil.getAddress(indices), primcount, basevertex, baseinstance, function_pointer);
/*     */   }
/*     */   public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, IntBuffer indices, int primcount, int basevertex, int baseinstance) {
/* 318 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 319 */     long function_pointer = caps.glDrawElementsInstancedBaseVertexBaseInstance;
/* 320 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 321 */     GLChecks.ensureElementVBOdisabled(caps);
/* 322 */     BufferChecks.checkDirect(indices);
/* 323 */     nglDrawElementsInstancedBaseVertexBaseInstance(mode, indices.remaining(), 5125, MemoryUtil.getAddress(indices), primcount, basevertex, baseinstance, function_pointer);
/*     */   }
/*     */   public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, ShortBuffer indices, int primcount, int basevertex, int baseinstance) {
/* 326 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 327 */     long function_pointer = caps.glDrawElementsInstancedBaseVertexBaseInstance;
/* 328 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 329 */     GLChecks.ensureElementVBOdisabled(caps);
/* 330 */     BufferChecks.checkDirect(indices);
/* 331 */     nglDrawElementsInstancedBaseVertexBaseInstance(mode, indices.remaining(), 5123, MemoryUtil.getAddress(indices), primcount, basevertex, baseinstance, function_pointer);
/*     */   }
/*     */   static native void nglDrawElementsInstancedBaseVertexBaseInstance(int paramInt1, int paramInt2, int paramInt3, long paramLong1, int paramInt4, int paramInt5, int paramInt6, long paramLong2);
/*     */   public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int indices_count, int type, long indices_buffer_offset, int primcount, int basevertex, int baseinstance) {
/* 335 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 336 */     long function_pointer = caps.glDrawElementsInstancedBaseVertexBaseInstance;
/* 337 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 338 */     GLChecks.ensureElementVBOenabled(caps);
/* 339 */     nglDrawElementsInstancedBaseVertexBaseInstanceBO(mode, indices_count, type, indices_buffer_offset, primcount, basevertex, baseinstance, function_pointer);
/*     */   }
/*     */   static native void nglDrawElementsInstancedBaseVertexBaseInstanceBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, int paramInt4, int paramInt5, int paramInt6, long paramLong2);
/*     */   
/*     */   public static void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
/* 344 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 345 */     long function_pointer = caps.glBindImageTexture;
/* 346 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 347 */     nglBindImageTexture(unit, texture, level, layered, layer, access, format, function_pointer);
/*     */   }
/*     */   static native void nglBindImageTexture(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*     */   
/*     */   public static void glMemoryBarrier(int barriers) {
/* 352 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 353 */     long function_pointer = caps.glMemoryBarrier;
/* 354 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 355 */     nglMemoryBarrier(barriers, function_pointer);
/*     */   }
/*     */   static native void nglMemoryBarrier(int paramInt, long paramLong);
/*     */   
/*     */   public static void glGetInternalformat(int target, int internalformat, int pname, IntBuffer params) {
/* 360 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 361 */     long function_pointer = caps.glGetInternalformativ;
/* 362 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 363 */     BufferChecks.checkDirect(params);
/* 364 */     nglGetInternalformativ(target, internalformat, pname, params.remaining(), MemoryUtil.getAddress(params), function_pointer);
/*     */   }
/*     */   
/*     */   static native void nglGetInternalformativ(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
/*     */   
/*     */   public static int glGetInternalformat(int target, int internalformat, int pname) {
/* 370 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 371 */     long function_pointer = caps.glGetInternalformativ;
/* 372 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 373 */     IntBuffer params = APIUtil.getBufferInt(caps);
/* 374 */     nglGetInternalformativ(target, internalformat, pname, 1, MemoryUtil.getAddress(params), function_pointer);
/* 375 */     return params.get(0);
/*     */   }
/*     */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\GL42.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
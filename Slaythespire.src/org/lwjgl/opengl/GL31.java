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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class GL31
/*     */ {
/*     */   public static final int GL_RED_SNORM = 36752;
/*     */   public static final int GL_RG_SNORM = 36753;
/*     */   public static final int GL_RGB_SNORM = 36754;
/*     */   public static final int GL_RGBA_SNORM = 36755;
/*     */   public static final int GL_R8_SNORM = 36756;
/*     */   public static final int GL_RG8_SNORM = 36757;
/*     */   public static final int GL_RGB8_SNORM = 36758;
/*     */   public static final int GL_RGBA8_SNORM = 36759;
/*     */   public static final int GL_R16_SNORM = 36760;
/*     */   public static final int GL_RG16_SNORM = 36761;
/*     */   public static final int GL_RGB16_SNORM = 36762;
/*     */   public static final int GL_RGBA16_SNORM = 36763;
/*     */   public static final int GL_SIGNED_NORMALIZED = 36764;
/*     */   public static final int GL_COPY_READ_BUFFER_BINDING = 36662;
/*     */   public static final int GL_COPY_WRITE_BUFFER_BINDING = 36663;
/*     */   public static final int GL_COPY_READ_BUFFER = 36662;
/*     */   public static final int GL_COPY_WRITE_BUFFER = 36663;
/*     */   public static final int GL_PRIMITIVE_RESTART = 36765;
/*     */   public static final int GL_PRIMITIVE_RESTART_INDEX = 36766;
/*     */   public static final int GL_TEXTURE_BUFFER = 35882;
/*     */   public static final int GL_MAX_TEXTURE_BUFFER_SIZE = 35883;
/*     */   public static final int GL_TEXTURE_BINDING_BUFFER = 35884;
/*     */   public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 35885;
/*     */   public static final int GL_TEXTURE_BUFFER_FORMAT = 35886;
/*     */   public static final int GL_TEXTURE_RECTANGLE = 34037;
/*     */   public static final int GL_TEXTURE_BINDING_RECTANGLE = 34038;
/*     */   public static final int GL_PROXY_TEXTURE_RECTANGLE = 34039;
/*     */   public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE = 34040;
/*     */   public static final int GL_SAMPLER_2D_RECT = 35683;
/*     */   public static final int GL_SAMPLER_2D_RECT_SHADOW = 35684;
/*     */   public static final int GL_UNIFORM_BUFFER = 35345;
/*     */   public static final int GL_UNIFORM_BUFFER_BINDING = 35368;
/*     */   public static final int GL_UNIFORM_BUFFER_START = 35369;
/*     */   public static final int GL_UNIFORM_BUFFER_SIZE = 35370;
/*     */   public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS = 35371;
/*     */   public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS = 35372;
/*     */   public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 35373;
/*     */   public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS = 35374;
/*     */   public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS = 35375;
/*     */   public static final int GL_MAX_UNIFORM_BLOCK_SIZE = 35376;
/*     */   public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 35377;
/*     */   public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 35378;
/*     */   public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 35379;
/*     */   public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 35380;
/*     */   public static final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 35381;
/*     */   public static final int GL_ACTIVE_UNIFORM_BLOCKS = 35382;
/*     */   public static final int GL_UNIFORM_TYPE = 35383;
/*     */   public static final int GL_UNIFORM_SIZE = 35384;
/*     */   public static final int GL_UNIFORM_NAME_LENGTH = 35385;
/*     */   public static final int GL_UNIFORM_BLOCK_INDEX = 35386;
/*     */   public static final int GL_UNIFORM_OFFSET = 35387;
/*     */   public static final int GL_UNIFORM_ARRAY_STRIDE = 35388;
/*     */   public static final int GL_UNIFORM_MATRIX_STRIDE = 35389;
/*     */   public static final int GL_UNIFORM_IS_ROW_MAJOR = 35390;
/*     */   public static final int GL_UNIFORM_BLOCK_BINDING = 35391;
/*     */   public static final int GL_UNIFORM_BLOCK_DATA_SIZE = 35392;
/*     */   public static final int GL_UNIFORM_BLOCK_NAME_LENGTH = 35393;
/*     */   public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 35394;
/*     */   public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 35395;
/*     */   public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 35396;
/*     */   public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 35397;
/*     */   public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 35398;
/*     */   public static final int GL_INVALID_INDEX = -1;
/*     */   
/*     */   public static void glDrawArraysInstanced(int mode, int first, int count, int primcount) {
/* 173 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 174 */     long function_pointer = caps.glDrawArraysInstanced;
/* 175 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 176 */     nglDrawArraysInstanced(mode, first, count, primcount, function_pointer);
/*     */   }
/*     */   static native void nglDrawArraysInstanced(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glDrawElementsInstanced(int mode, ByteBuffer indices, int primcount) {
/* 181 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 182 */     long function_pointer = caps.glDrawElementsInstanced;
/* 183 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 184 */     GLChecks.ensureElementVBOdisabled(caps);
/* 185 */     BufferChecks.checkDirect(indices);
/* 186 */     nglDrawElementsInstanced(mode, indices.remaining(), 5121, MemoryUtil.getAddress(indices), primcount, function_pointer);
/*     */   }
/*     */   public static void glDrawElementsInstanced(int mode, IntBuffer indices, int primcount) {
/* 189 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 190 */     long function_pointer = caps.glDrawElementsInstanced;
/* 191 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 192 */     GLChecks.ensureElementVBOdisabled(caps);
/* 193 */     BufferChecks.checkDirect(indices);
/* 194 */     nglDrawElementsInstanced(mode, indices.remaining(), 5125, MemoryUtil.getAddress(indices), primcount, function_pointer);
/*     */   }
/*     */   public static void glDrawElementsInstanced(int mode, ShortBuffer indices, int primcount) {
/* 197 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 198 */     long function_pointer = caps.glDrawElementsInstanced;
/* 199 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 200 */     GLChecks.ensureElementVBOdisabled(caps);
/* 201 */     BufferChecks.checkDirect(indices);
/* 202 */     nglDrawElementsInstanced(mode, indices.remaining(), 5123, MemoryUtil.getAddress(indices), primcount, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glDrawElementsInstanced(int mode, int indices_count, int type, long indices_buffer_offset, int primcount) {
/* 206 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 207 */     long function_pointer = caps.glDrawElementsInstanced;
/* 208 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 209 */     GLChecks.ensureElementVBOenabled(caps);
/* 210 */     nglDrawElementsInstancedBO(mode, indices_count, type, indices_buffer_offset, primcount, function_pointer);
/*     */   }
/*     */   static native void nglDrawElementsInstanced(int paramInt1, int paramInt2, int paramInt3, long paramLong1, int paramInt4, long paramLong2);
/*     */   static native void nglDrawElementsInstancedBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, int paramInt4, long paramLong2);
/*     */   public static void glCopyBufferSubData(int readtarget, int writetarget, long readoffset, long writeoffset, long size) {
/* 215 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 216 */     long function_pointer = caps.glCopyBufferSubData;
/* 217 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 218 */     nglCopyBufferSubData(readtarget, writetarget, readoffset, writeoffset, size, function_pointer);
/*     */   }
/*     */   static native void nglCopyBufferSubData(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   public static void glPrimitiveRestartIndex(int index) {
/* 223 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 224 */     long function_pointer = caps.glPrimitiveRestartIndex;
/* 225 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 226 */     nglPrimitiveRestartIndex(index, function_pointer);
/*     */   }
/*     */   static native void nglPrimitiveRestartIndex(int paramInt, long paramLong);
/*     */   
/*     */   public static void glTexBuffer(int target, int internalformat, int buffer) {
/* 231 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 232 */     long function_pointer = caps.glTexBuffer;
/* 233 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 234 */     nglTexBuffer(target, internalformat, buffer, function_pointer);
/*     */   }
/*     */   static native void nglTexBuffer(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetUniformIndices(int program, ByteBuffer uniformNames, IntBuffer uniformIndices) {
/* 239 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 240 */     long function_pointer = caps.glGetUniformIndices;
/* 241 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 242 */     BufferChecks.checkDirect(uniformNames);
/* 243 */     BufferChecks.checkNullTerminated(uniformNames, uniformIndices.remaining());
/* 244 */     BufferChecks.checkDirect(uniformIndices);
/* 245 */     nglGetUniformIndices(program, uniformIndices.remaining(), MemoryUtil.getAddress(uniformNames), MemoryUtil.getAddress(uniformIndices), function_pointer);
/*     */   }
/*     */   
/*     */   static native void nglGetUniformIndices(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   public static void glGetUniformIndices(int program, CharSequence[] uniformNames, IntBuffer uniformIndices) {
/* 251 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 252 */     long function_pointer = caps.glGetUniformIndices;
/* 253 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 254 */     BufferChecks.checkArray((Object[])uniformNames);
/* 255 */     BufferChecks.checkBuffer(uniformIndices, uniformNames.length);
/* 256 */     nglGetUniformIndices(program, uniformNames.length, APIUtil.getBufferNT(caps, uniformNames), MemoryUtil.getAddress(uniformIndices), function_pointer);
/*     */   }
/*     */   
/*     */   public static void glGetActiveUniforms(int program, IntBuffer uniformIndices, int pname, IntBuffer params) {
/* 260 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 261 */     long function_pointer = caps.glGetActiveUniformsiv;
/* 262 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 263 */     BufferChecks.checkDirect(uniformIndices);
/* 264 */     BufferChecks.checkBuffer(params, uniformIndices.remaining());
/* 265 */     nglGetActiveUniformsiv(program, uniformIndices.remaining(), MemoryUtil.getAddress(uniformIndices), pname, MemoryUtil.getAddress(params), function_pointer);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static native void nglGetActiveUniformsiv(int paramInt1, int paramInt2, long paramLong1, int paramInt3, long paramLong2, long paramLong3);
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static int glGetActiveUniforms(int program, int uniformIndex, int pname) {
/* 276 */     return glGetActiveUniformsi(program, uniformIndex, pname);
/*     */   }
/*     */ 
/*     */   
/*     */   public static int glGetActiveUniformsi(int program, int uniformIndex, int pname) {
/* 281 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 282 */     long function_pointer = caps.glGetActiveUniformsiv;
/* 283 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 284 */     IntBuffer params = APIUtil.getBufferInt(caps);
/* 285 */     nglGetActiveUniformsiv(program, 1, MemoryUtil.getAddress(params.put(1, uniformIndex), 1), pname, MemoryUtil.getAddress(params), function_pointer);
/* 286 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetActiveUniformName(int program, int uniformIndex, IntBuffer length, ByteBuffer uniformName) {
/* 290 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 291 */     long function_pointer = caps.glGetActiveUniformName;
/* 292 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 293 */     if (length != null)
/* 294 */       BufferChecks.checkBuffer(length, 1); 
/* 295 */     BufferChecks.checkDirect(uniformName);
/* 296 */     nglGetActiveUniformName(program, uniformIndex, uniformName.remaining(), MemoryUtil.getAddressSafe(length), MemoryUtil.getAddress(uniformName), function_pointer);
/*     */   }
/*     */   
/*     */   static native void nglGetActiveUniformName(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   public static String glGetActiveUniformName(int program, int uniformIndex, int bufSize) {
/* 302 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 303 */     long function_pointer = caps.glGetActiveUniformName;
/* 304 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 305 */     IntBuffer uniformName_length = APIUtil.getLengths(caps);
/* 306 */     ByteBuffer uniformName = APIUtil.getBufferByte(caps, bufSize);
/* 307 */     nglGetActiveUniformName(program, uniformIndex, bufSize, MemoryUtil.getAddress0(uniformName_length), MemoryUtil.getAddress(uniformName), function_pointer);
/* 308 */     uniformName.limit(uniformName_length.get(0));
/* 309 */     return APIUtil.getString(caps, uniformName);
/*     */   }
/*     */   
/*     */   public static int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName) {
/* 313 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 314 */     long function_pointer = caps.glGetUniformBlockIndex;
/* 315 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 316 */     BufferChecks.checkDirect(uniformBlockName);
/* 317 */     BufferChecks.checkNullTerminated(uniformBlockName);
/* 318 */     int __result = nglGetUniformBlockIndex(program, MemoryUtil.getAddress(uniformBlockName), function_pointer);
/* 319 */     return __result;
/*     */   }
/*     */   
/*     */   static native int nglGetUniformBlockIndex(int paramInt, long paramLong1, long paramLong2);
/*     */   
/*     */   public static int glGetUniformBlockIndex(int program, CharSequence uniformBlockName) {
/* 325 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 326 */     long function_pointer = caps.glGetUniformBlockIndex;
/* 327 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 328 */     int __result = nglGetUniformBlockIndex(program, APIUtil.getBufferNT(caps, uniformBlockName), function_pointer);
/* 329 */     return __result;
/*     */   }
/*     */   
/*     */   public static void glGetActiveUniformBlock(int program, int uniformBlockIndex, int pname, IntBuffer params) {
/* 333 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 334 */     long function_pointer = caps.glGetActiveUniformBlockiv;
/* 335 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 336 */     BufferChecks.checkBuffer(params, 16);
/* 337 */     nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, MemoryUtil.getAddress(params), function_pointer);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static native void nglGetActiveUniformBlockiv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static int glGetActiveUniformBlock(int program, int uniformBlockIndex, int pname) {
/* 348 */     return glGetActiveUniformBlocki(program, uniformBlockIndex, pname);
/*     */   }
/*     */ 
/*     */   
/*     */   public static int glGetActiveUniformBlocki(int program, int uniformBlockIndex, int pname) {
/* 353 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 354 */     long function_pointer = caps.glGetActiveUniformBlockiv;
/* 355 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 356 */     IntBuffer params = APIUtil.getBufferInt(caps);
/* 357 */     nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, MemoryUtil.getAddress(params), function_pointer);
/* 358 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, IntBuffer length, ByteBuffer uniformBlockName) {
/* 362 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 363 */     long function_pointer = caps.glGetActiveUniformBlockName;
/* 364 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 365 */     if (length != null)
/* 366 */       BufferChecks.checkBuffer(length, 1); 
/* 367 */     BufferChecks.checkDirect(uniformBlockName);
/* 368 */     nglGetActiveUniformBlockName(program, uniformBlockIndex, uniformBlockName.remaining(), MemoryUtil.getAddressSafe(length), MemoryUtil.getAddress(uniformBlockName), function_pointer);
/*     */   }
/*     */   
/*     */   static native void nglGetActiveUniformBlockName(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize) {
/* 374 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 375 */     long function_pointer = caps.glGetActiveUniformBlockName;
/* 376 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 377 */     IntBuffer uniformBlockName_length = APIUtil.getLengths(caps);
/* 378 */     ByteBuffer uniformBlockName = APIUtil.getBufferByte(caps, bufSize);
/* 379 */     nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, MemoryUtil.getAddress0(uniformBlockName_length), MemoryUtil.getAddress(uniformBlockName), function_pointer);
/* 380 */     uniformBlockName.limit(uniformBlockName_length.get(0));
/* 381 */     return APIUtil.getString(caps, uniformBlockName);
/*     */   }
/*     */   
/*     */   public static void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
/* 385 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 386 */     long function_pointer = caps.glUniformBlockBinding;
/* 387 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 388 */     nglUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding, function_pointer);
/*     */   }
/*     */   
/*     */   static native void nglUniformBlockBinding(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\GL31.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import org.lwjgl.BufferChecks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class EXTGeometryShader4
/*    */ {
/*    */   public static final int GL_GEOMETRY_SHADER_EXT = 36313;
/*    */   public static final int GL_GEOMETRY_VERTICES_OUT_EXT = 36314;
/*    */   public static final int GL_GEOMETRY_INPUT_TYPE_EXT = 36315;
/*    */   public static final int GL_GEOMETRY_OUTPUT_TYPE_EXT = 36316;
/*    */   public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT = 35881;
/*    */   public static final int GL_MAX_GEOMETRY_VARYING_COMPONENTS_EXT = 36317;
/*    */   public static final int GL_MAX_VERTEX_VARYING_COMPONENTS_EXT = 36318;
/*    */   public static final int GL_MAX_VARYING_COMPONENTS_EXT = 35659;
/*    */   public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT = 36319;
/*    */   public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES_EXT = 36320;
/*    */   public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT = 36321;
/*    */   public static final int GL_LINES_ADJACENCY_EXT = 10;
/*    */   public static final int GL_LINE_STRIP_ADJACENCY_EXT = 11;
/*    */   public static final int GL_TRIANGLES_ADJACENCY_EXT = 12;
/*    */   public static final int GL_TRIANGLE_STRIP_ADJACENCY_EXT = 13;
/*    */   public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT = 36264;
/*    */   public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_EXT = 36265;
/*    */   public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_EXT = 36263;
/*    */   public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT = 36052;
/*    */   public static final int GL_PROGRAM_POINT_SIZE_EXT = 34370;
/*    */   
/*    */   static native void nglProgramParameteriEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*    */   
/*    */   public static void glProgramParameteriEXT(int program, int pname, int value) {
/* 69 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 70 */     long function_pointer = caps.glProgramParameteriEXT;
/* 71 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 72 */     nglProgramParameteriEXT(program, pname, value, function_pointer);
/*    */   }
/*    */   static native void nglFramebufferTextureEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*    */   
/*    */   public static void glFramebufferTextureEXT(int target, int attachment, int texture, int level) {
/* 77 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 78 */     long function_pointer = caps.glFramebufferTextureEXT;
/* 79 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 80 */     nglFramebufferTextureEXT(target, attachment, texture, level, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glFramebufferTextureLayerEXT(int target, int attachment, int texture, int level, int layer) {
/* 85 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 86 */     long function_pointer = caps.glFramebufferTextureLayerEXT;
/* 87 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 88 */     nglFramebufferTextureLayerEXT(target, attachment, texture, level, layer, function_pointer);
/*    */   }
/*    */   static native void nglFramebufferTextureLayerEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*    */   
/*    */   public static void glFramebufferTextureFaceEXT(int target, int attachment, int texture, int level, int face) {
/* 93 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 94 */     long function_pointer = caps.glFramebufferTextureFaceEXT;
/* 95 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 96 */     nglFramebufferTextureFaceEXT(target, attachment, texture, level, face, function_pointer);
/*    */   }
/*    */   
/*    */   static native void nglFramebufferTextureFaceEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\EXTGeometryShader4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
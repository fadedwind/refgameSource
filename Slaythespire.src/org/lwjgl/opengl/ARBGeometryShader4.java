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
/*    */ public final class ARBGeometryShader4
/*    */ {
/*    */   public static final int GL_GEOMETRY_SHADER_ARB = 36313;
/*    */   public static final int GL_GEOMETRY_VERTICES_OUT_ARB = 36314;
/*    */   public static final int GL_GEOMETRY_INPUT_TYPE_ARB = 36315;
/*    */   public static final int GL_GEOMETRY_OUTPUT_TYPE_ARB = 36316;
/*    */   public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_ARB = 35881;
/*    */   public static final int GL_MAX_GEOMETRY_VARYING_COMPONENTS_ARB = 36317;
/*    */   public static final int GL_MAX_VERTEX_VARYING_COMPONENTS_ARB = 36318;
/*    */   public static final int GL_MAX_VARYING_COMPONENTS_ARB = 35659;
/*    */   public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_ARB = 36319;
/*    */   public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES_ARB = 36320;
/*    */   public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_ARB = 36321;
/*    */   public static final int GL_LINES_ADJACENCY_ARB = 10;
/*    */   public static final int GL_LINE_STRIP_ADJACENCY_ARB = 11;
/*    */   public static final int GL_TRIANGLES_ADJACENCY_ARB = 12;
/*    */   public static final int GL_TRIANGLE_STRIP_ADJACENCY_ARB = 13;
/*    */   public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_ARB = 36264;
/*    */   public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_ARB = 36265;
/*    */   public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_ARB = 36263;
/*    */   public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_ARB = 36052;
/*    */   public static final int GL_PROGRAM_POINT_SIZE_ARB = 34370;
/*    */   
/*    */   static native void nglProgramParameteriARB(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*    */   
/*    */   public static void glProgramParameteriARB(int program, int pname, int value) {
/* 69 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 70 */     long function_pointer = caps.glProgramParameteriARB;
/* 71 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 72 */     nglProgramParameteriARB(program, pname, value, function_pointer);
/*    */   }
/*    */   static native void nglFramebufferTextureARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*    */   
/*    */   public static void glFramebufferTextureARB(int target, int attachment, int texture, int level) {
/* 77 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 78 */     long function_pointer = caps.glFramebufferTextureARB;
/* 79 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 80 */     nglFramebufferTextureARB(target, attachment, texture, level, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glFramebufferTextureLayerARB(int target, int attachment, int texture, int level, int layer) {
/* 85 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 86 */     long function_pointer = caps.glFramebufferTextureLayerARB;
/* 87 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 88 */     nglFramebufferTextureLayerARB(target, attachment, texture, level, layer, function_pointer);
/*    */   }
/*    */   static native void nglFramebufferTextureLayerARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*    */   
/*    */   public static void glFramebufferTextureFaceARB(int target, int attachment, int texture, int level, int face) {
/* 93 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 94 */     long function_pointer = caps.glFramebufferTextureFaceARB;
/* 95 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 96 */     nglFramebufferTextureFaceARB(target, attachment, texture, level, face, function_pointer);
/*    */   }
/*    */   
/*    */   static native void nglFramebufferTextureFaceARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\ARBGeometryShader4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
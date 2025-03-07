/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.DoubleBuffer;
/*    */ import java.nio.FloatBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ import org.lwjgl.MemoryUtil;
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
/*    */ public final class APPLEVertexProgramEvaluators
/*    */ {
/*    */   public static final int GL_VERTEX_ATTRIB_MAP1_APPLE = 35328;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP2_APPLE = 35329;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP1_SIZE_APPLE = 35330;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP1_COEFF_APPLE = 35331;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP1_ORDER_APPLE = 35332;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP1_DOMAIN_APPLE = 35333;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP2_SIZE_APPLE = 35334;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP2_COEFF_APPLE = 35335;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP2_ORDER_APPLE = 35336;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP2_DOMAIN_APPLE = 35337;
/*    */   
/*    */   static native void nglEnableVertexAttribAPPLE(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glEnableVertexAttribAPPLE(int index, int pname) {
/* 33 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 34 */     long function_pointer = caps.glEnableVertexAttribAPPLE;
/* 35 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 36 */     nglEnableVertexAttribAPPLE(index, pname, function_pointer);
/*    */   }
/*    */   static native void nglDisableVertexAttribAPPLE(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glDisableVertexAttribAPPLE(int index, int pname) {
/* 41 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 42 */     long function_pointer = caps.glDisableVertexAttribAPPLE;
/* 43 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 44 */     nglDisableVertexAttribAPPLE(index, pname, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean glIsVertexAttribEnabledAPPLE(int index, int pname) {
/* 49 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 50 */     long function_pointer = caps.glIsVertexAttribEnabledAPPLE;
/* 51 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 52 */     boolean __result = nglIsVertexAttribEnabledAPPLE(index, pname, function_pointer);
/* 53 */     return __result;
/*    */   }
/*    */   static native boolean nglIsVertexAttribEnabledAPPLE(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glMapVertexAttrib1dAPPLE(int index, int size, double u1, double u2, int stride, int order, DoubleBuffer points) {
/* 58 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 59 */     long function_pointer = caps.glMapVertexAttrib1dAPPLE;
/* 60 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 61 */     BufferChecks.checkDirect(points);
/* 62 */     nglMapVertexAttrib1dAPPLE(index, size, u1, u2, stride, order, MemoryUtil.getAddress(points), function_pointer);
/*    */   }
/*    */   static native void nglMapVertexAttrib1dAPPLE(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
/*    */   
/*    */   public static void glMapVertexAttrib1fAPPLE(int index, int size, float u1, float u2, int stride, int order, FloatBuffer points) {
/* 67 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 68 */     long function_pointer = caps.glMapVertexAttrib1fAPPLE;
/* 69 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 70 */     BufferChecks.checkDirect(points);
/* 71 */     nglMapVertexAttrib1fAPPLE(index, size, u1, u2, stride, order, MemoryUtil.getAddress(points), function_pointer);
/*    */   }
/*    */   static native void nglMapVertexAttrib1fAPPLE(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
/*    */   
/*    */   public static void glMapVertexAttrib2dAPPLE(int index, int size, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, DoubleBuffer points) {
/* 76 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 77 */     long function_pointer = caps.glMapVertexAttrib2dAPPLE;
/* 78 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 79 */     BufferChecks.checkDirect(points);
/* 80 */     nglMapVertexAttrib2dAPPLE(index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, MemoryUtil.getAddress(points), function_pointer);
/*    */   }
/*    */   static native void nglMapVertexAttrib2dAPPLE(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, int paramInt4, double paramDouble3, double paramDouble4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
/*    */   
/*    */   public static void glMapVertexAttrib2fAPPLE(int index, int size, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, FloatBuffer points) {
/* 85 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 86 */     long function_pointer = caps.glMapVertexAttrib2fAPPLE;
/* 87 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 88 */     BufferChecks.checkDirect(points);
/* 89 */     nglMapVertexAttrib2fAPPLE(index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, MemoryUtil.getAddress(points), function_pointer);
/*    */   }
/*    */   
/*    */   static native void nglMapVertexAttrib2fAPPLE(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, float paramFloat3, float paramFloat4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\APPLEVertexProgramEvaluators.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
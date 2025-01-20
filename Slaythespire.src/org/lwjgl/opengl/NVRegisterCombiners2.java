/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.FloatBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ import org.lwjgl.MemoryUtil;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class NVRegisterCombiners2
/*    */ {
/*    */   public static final int GL_PER_STAGE_CONSTANTS_NV = 34101;
/*    */   
/*    */   public static void glCombinerStageParameterNV(int stage, int pname, FloatBuffer params) {
/* 15 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 16 */     long function_pointer = caps.glCombinerStageParameterfvNV;
/* 17 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 18 */     BufferChecks.checkBuffer(params, 4);
/* 19 */     nglCombinerStageParameterfvNV(stage, pname, MemoryUtil.getAddress(params), function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glGetCombinerStageParameterNV(int stage, int pname, FloatBuffer params) {
/* 24 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 25 */     long function_pointer = caps.glGetCombinerStageParameterfvNV;
/* 26 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 27 */     BufferChecks.checkBuffer(params, 4);
/* 28 */     nglGetCombinerStageParameterfvNV(stage, pname, MemoryUtil.getAddress(params), function_pointer);
/*    */   }
/*    */   
/*    */   static native void nglCombinerStageParameterfvNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*    */   
/*    */   static native void nglGetCombinerStageParameterfvNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\NVRegisterCombiners2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
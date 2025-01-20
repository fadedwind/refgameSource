/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.FloatBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ import org.lwjgl.MemoryUtil;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class EXTGpuProgramParameters
/*    */ {
/*    */   public static void glProgramEnvParameters4EXT(int target, int index, int count, FloatBuffer params) {
/* 13 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 14 */     long function_pointer = caps.glProgramEnvParameters4fvEXT;
/* 15 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 16 */     BufferChecks.checkBuffer(params, count << 2);
/* 17 */     nglProgramEnvParameters4fvEXT(target, index, count, MemoryUtil.getAddress(params), function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glProgramLocalParameters4EXT(int target, int index, int count, FloatBuffer params) {
/* 22 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 23 */     long function_pointer = caps.glProgramLocalParameters4fvEXT;
/* 24 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 25 */     BufferChecks.checkBuffer(params, count << 2);
/* 26 */     nglProgramLocalParameters4fvEXT(target, index, count, MemoryUtil.getAddress(params), function_pointer);
/*    */   }
/*    */   
/*    */   static native void nglProgramEnvParameters4fvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*    */   
/*    */   static native void nglProgramLocalParameters4fvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\EXTGpuProgramParameters.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
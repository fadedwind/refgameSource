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
/*    */ public final class ARBColorBufferFloat
/*    */ {
/*    */   public static final int GL_RGBA_FLOAT_MODE_ARB = 34848;
/*    */   public static final int GL_CLAMP_VERTEX_COLOR_ARB = 35098;
/*    */   public static final int GL_CLAMP_FRAGMENT_COLOR_ARB = 35099;
/*    */   public static final int GL_CLAMP_READ_COLOR_ARB = 35100;
/*    */   public static final int GL_FIXED_ONLY_ARB = 35101;
/*    */   public static final int WGL_TYPE_RGBA_FLOAT_ARB = 8608;
/*    */   public static final int GLX_RGBA_FLOAT_TYPE = 8377;
/*    */   public static final int GLX_RGBA_FLOAT_BIT = 4;
/*    */   
/*    */   public static void glClampColorARB(int target, int clamp) {
/* 51 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 52 */     long function_pointer = caps.glClampColorARB;
/* 53 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 54 */     nglClampColorARB(target, clamp, function_pointer);
/*    */   }
/*    */   
/*    */   static native void nglClampColorARB(int paramInt1, int paramInt2, long paramLong);
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\ARBColorBufferFloat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
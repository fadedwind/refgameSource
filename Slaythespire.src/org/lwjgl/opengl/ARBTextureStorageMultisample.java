/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import org.lwjgl.BufferChecks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ARBTextureStorageMultisample
/*    */ {
/*    */   public static void glTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
/* 13 */     GL43.glTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
/*    */   }
/*    */   
/*    */   public static void glTexStorage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
/* 17 */     GL43.glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
/*    */   }
/*    */   
/*    */   public static void glTextureStorage2DMultisampleEXT(int texture, int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
/* 21 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 22 */     long function_pointer = caps.glTextureStorage2DMultisampleEXT;
/* 23 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 24 */     nglTextureStorage2DMultisampleEXT(texture, target, samples, internalformat, width, height, fixedsamplelocations, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glTextureStorage3DMultisampleEXT(int texture, int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
/* 29 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 30 */     long function_pointer = caps.glTextureStorage3DMultisampleEXT;
/* 31 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 32 */     nglTextureStorage3DMultisampleEXT(texture, target, samples, internalformat, width, height, depth, fixedsamplelocations, function_pointer);
/*    */   }
/*    */   
/*    */   static native void nglTextureStorage2DMultisampleEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, long paramLong);
/*    */   
/*    */   static native void nglTextureStorage3DMultisampleEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean, long paramLong);
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\ARBTextureStorageMultisample.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
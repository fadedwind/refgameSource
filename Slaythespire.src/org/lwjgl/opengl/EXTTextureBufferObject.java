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
/*    */ public final class EXTTextureBufferObject
/*    */ {
/*    */   public static final int GL_TEXTURE_BUFFER_EXT = 35882;
/*    */   public static final int GL_MAX_TEXTURE_BUFFER_SIZE_EXT = 35883;
/*    */   public static final int GL_TEXTURE_BINDING_BUFFER_EXT = 35884;
/*    */   public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT = 35885;
/*    */   public static final int GL_TEXTURE_BUFFER_FORMAT_EXT = 35886;
/*    */   
/*    */   public static void glTexBufferEXT(int target, int internalformat, int buffer) {
/* 31 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 32 */     long function_pointer = caps.glTexBufferEXT;
/* 33 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 34 */     nglTexBufferEXT(target, internalformat, buffer, function_pointer);
/*    */   }
/*    */   
/*    */   static native void nglTexBufferEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\EXTTextureBufferObject.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
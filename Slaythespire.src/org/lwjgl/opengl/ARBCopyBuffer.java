/*    */ package org.lwjgl.opengl;
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
/*    */ public final class ARBCopyBuffer
/*    */ {
/*    */   public static final int GL_COPY_READ_BUFFER = 36662;
/*    */   public static final int GL_COPY_WRITE_BUFFER = 36663;
/*    */   
/*    */   public static void glCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
/* 23 */     GL31.glCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size);
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\ARBCopyBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
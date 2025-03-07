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
/*    */ public final class ARBSparseBuffer
/*    */ {
/*    */   public static final int GL_SPARSE_STORAGE_BIT_ARB = 1024;
/*    */   public static final int GL_SPARSE_BUFFER_PAGE_SIZE_ARB = 33528;
/*    */   
/*    */   public static void glBufferPageCommitmentARB(int target, long offset, long size, boolean commit) {
/* 24 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 25 */     long function_pointer = caps.glBufferPageCommitmentARB;
/* 26 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 27 */     nglBufferPageCommitmentARB(target, offset, size, commit, function_pointer);
/*    */   }
/*    */   
/*    */   static native void nglBufferPageCommitmentARB(int paramInt, long paramLong1, long paramLong2, boolean paramBoolean, long paramLong3);
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\ARBSparseBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
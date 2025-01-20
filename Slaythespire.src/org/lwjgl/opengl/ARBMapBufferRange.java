/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.ByteBuffer;
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
/*    */ public final class ARBMapBufferRange
/*    */ {
/*    */   public static final int GL_MAP_READ_BIT = 1;
/*    */   public static final int GL_MAP_WRITE_BIT = 2;
/*    */   public static final int GL_MAP_INVALIDATE_RANGE_BIT = 4;
/*    */   public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 8;
/*    */   public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 16;
/*    */   public static final int GL_MAP_UNSYNCHRONIZED_BIT = 32;
/*    */   
/*    */   public static ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer) {
/* 37 */     return GL30.glMapBufferRange(target, offset, length, access, old_buffer);
/*    */   }
/*    */   
/*    */   public static void glFlushMappedBufferRange(int target, long offset, long length) {
/* 41 */     GL30.glFlushMappedBufferRange(target, offset, length);
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\ARBMapBufferRange.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
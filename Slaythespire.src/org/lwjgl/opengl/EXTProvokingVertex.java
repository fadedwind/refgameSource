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
/*    */ public final class EXTProvokingVertex
/*    */ {
/*    */   public static final int GL_FIRST_VERTEX_CONVENTION_EXT = 36429;
/*    */   public static final int GL_LAST_VERTEX_CONVENTION_EXT = 36430;
/*    */   public static final int GL_PROVOKING_VERTEX_EXT = 36431;
/*    */   public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION_EXT = 36428;
/*    */   
/*    */   public static void glProvokingVertexEXT(int mode) {
/* 26 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 27 */     long function_pointer = caps.glProvokingVertexEXT;
/* 28 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 29 */     nglProvokingVertexEXT(mode, function_pointer);
/*    */   }
/*    */   
/*    */   static native void nglProvokingVertexEXT(int paramInt, long paramLong);
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\EXTProvokingVertex.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
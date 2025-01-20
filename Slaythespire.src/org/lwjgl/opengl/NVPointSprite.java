/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.IntBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ import org.lwjgl.MemoryUtil;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class NVPointSprite
/*    */ {
/*    */   public static final int GL_POINT_SPRITE_NV = 34913;
/*    */   public static final int GL_COORD_REPLACE_NV = 34914;
/*    */   public static final int GL_POINT_SPRITE_R_MODE_NV = 34915;
/*    */   
/*    */   public static void glPointParameteriNV(int pname, int param) {
/* 17 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 18 */     long function_pointer = caps.glPointParameteriNV;
/* 19 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 20 */     nglPointParameteriNV(pname, param, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glPointParameterNV(int pname, IntBuffer params) {
/* 25 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 26 */     long function_pointer = caps.glPointParameterivNV;
/* 27 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 28 */     BufferChecks.checkBuffer(params, 4);
/* 29 */     nglPointParameterivNV(pname, MemoryUtil.getAddress(params), function_pointer);
/*    */   }
/*    */   
/*    */   static native void nglPointParameteriNV(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   static native void nglPointParameterivNV(int paramInt, long paramLong1, long paramLong2);
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\NVPointSprite.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
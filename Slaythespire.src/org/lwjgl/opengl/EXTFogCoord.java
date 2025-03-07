/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.DoubleBuffer;
/*    */ import java.nio.FloatBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ import org.lwjgl.LWJGLUtil;
/*    */ import org.lwjgl.MemoryUtil;
/*    */ 
/*    */ public final class EXTFogCoord {
/*    */   public static final int GL_FOG_COORDINATE_SOURCE_EXT = 33872;
/*    */   public static final int GL_FOG_COORDINATE_EXT = 33873;
/*    */   public static final int GL_FRAGMENT_DEPTH_EXT = 33874;
/*    */   public static final int GL_CURRENT_FOG_COORDINATE_EXT = 33875;
/*    */   public static final int GL_FOG_COORDINATE_ARRAY_TYPE_EXT = 33876;
/*    */   public static final int GL_FOG_COORDINATE_ARRAY_STRIDE_EXT = 33877;
/*    */   public static final int GL_FOG_COORDINATE_ARRAY_POINTER_EXT = 33878;
/*    */   public static final int GL_FOG_COORDINATE_ARRAY_EXT = 33879;
/*    */   
/*    */   static native void nglFogCoordfEXT(float paramFloat, long paramLong);
/*    */   
/*    */   public static void glFogCoordfEXT(float coord) {
/* 22 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 23 */     long function_pointer = caps.glFogCoordfEXT;
/* 24 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 25 */     nglFogCoordfEXT(coord, function_pointer);
/*    */   }
/*    */   static native void nglFogCoorddEXT(double paramDouble, long paramLong);
/*    */   
/*    */   public static void glFogCoorddEXT(double coord) {
/* 30 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 31 */     long function_pointer = caps.glFogCoorddEXT;
/* 32 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 33 */     nglFogCoorddEXT(coord, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glFogCoordPointerEXT(int stride, DoubleBuffer data) {
/* 38 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 39 */     long function_pointer = caps.glFogCoordPointerEXT;
/* 40 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 41 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 42 */     BufferChecks.checkDirect(data);
/* 43 */     if (LWJGLUtil.CHECKS) (StateTracker.getReferences(caps)).EXT_fog_coord_glFogCoordPointerEXT_data = data; 
/* 44 */     nglFogCoordPointerEXT(5130, stride, MemoryUtil.getAddress(data), function_pointer);
/*    */   }
/*    */   public static void glFogCoordPointerEXT(int stride, FloatBuffer data) {
/* 47 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 48 */     long function_pointer = caps.glFogCoordPointerEXT;
/* 49 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 50 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 51 */     BufferChecks.checkDirect(data);
/* 52 */     if (LWJGLUtil.CHECKS) (StateTracker.getReferences(caps)).EXT_fog_coord_glFogCoordPointerEXT_data = data; 
/* 53 */     nglFogCoordPointerEXT(5126, stride, MemoryUtil.getAddress(data), function_pointer);
/*    */   }
/*    */   
/*    */   public static void glFogCoordPointerEXT(int type, int stride, long data_buffer_offset) {
/* 57 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 58 */     long function_pointer = caps.glFogCoordPointerEXT;
/* 59 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 60 */     GLChecks.ensureArrayVBOenabled(caps);
/* 61 */     nglFogCoordPointerEXTBO(type, stride, data_buffer_offset, function_pointer);
/*    */   }
/*    */   
/*    */   static native void nglFogCoordPointerEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*    */   
/*    */   static native void nglFogCoordPointerEXTBO(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\EXTFogCoord.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
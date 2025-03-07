/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.IntBuffer;
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
/*    */ public final class ARBES2Compatibility
/*    */ {
/*    */   public static final int GL_SHADER_COMPILER = 36346;
/*    */   public static final int GL_NUM_SHADER_BINARY_FORMATS = 36345;
/*    */   public static final int GL_MAX_VERTEX_UNIFORM_VECTORS = 36347;
/*    */   public static final int GL_MAX_VARYING_VECTORS = 36348;
/*    */   public static final int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 36349;
/*    */   public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE = 35738;
/*    */   public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 35739;
/*    */   public static final int GL_FIXED = 5132;
/*    */   public static final int GL_LOW_FLOAT = 36336;
/*    */   public static final int GL_MEDIUM_FLOAT = 36337;
/*    */   public static final int GL_HIGH_FLOAT = 36338;
/*    */   public static final int GL_LOW_INT = 36339;
/*    */   public static final int GL_MEDIUM_INT = 36340;
/*    */   public static final int GL_HIGH_INT = 36341;
/*    */   public static final int GL_RGB565 = 36194;
/*    */   
/*    */   public static void glReleaseShaderCompiler() {
/* 46 */     GL41.glReleaseShaderCompiler();
/*    */   }
/*    */   
/*    */   public static void glShaderBinary(IntBuffer shaders, int binaryformat, ByteBuffer binary) {
/* 50 */     GL41.glShaderBinary(shaders, binaryformat, binary);
/*    */   }
/*    */   
/*    */   public static void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range, IntBuffer precision) {
/* 54 */     GL41.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
/*    */   }
/*    */   
/*    */   public static void glDepthRangef(float n, float f) {
/* 58 */     GL41.glDepthRangef(n, f);
/*    */   }
/*    */   
/*    */   public static void glClearDepthf(float d) {
/* 62 */     GL41.glClearDepthf(d);
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\ARBES2Compatibility.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
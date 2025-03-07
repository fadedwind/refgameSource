/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.FloatBuffer;
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
/*    */ public final class ARBTextureMultisample
/*    */ {
/*    */   public static final int GL_SAMPLE_POSITION = 36432;
/*    */   public static final int GL_SAMPLE_MASK = 36433;
/*    */   public static final int GL_SAMPLE_MASK_VALUE = 36434;
/*    */   public static final int GL_TEXTURE_2D_MULTISAMPLE = 37120;
/*    */   public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 37121;
/*    */   public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 37122;
/*    */   public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 37123;
/*    */   public static final int GL_MAX_SAMPLE_MASK_WORDS = 36441;
/*    */   public static final int GL_MAX_COLOR_TEXTURE_SAMPLES = 37134;
/*    */   public static final int GL_MAX_DEPTH_TEXTURE_SAMPLES = 37135;
/*    */   public static final int GL_MAX_INTEGER_SAMPLES = 37136;
/*    */   public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE = 37124;
/*    */   public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 37125;
/*    */   public static final int GL_TEXTURE_SAMPLES = 37126;
/*    */   public static final int GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 37127;
/*    */   public static final int GL_SAMPLER_2D_MULTISAMPLE = 37128;
/*    */   public static final int GL_INT_SAMPLER_2D_MULTISAMPLE = 37129;
/*    */   public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = 37130;
/*    */   public static final int GL_SAMPLER_2D_MULTISAMPLE_ARRAY = 37131;
/*    */   public static final int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 37132;
/*    */   public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 37133;
/*    */   
/*    */   public static void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
/* 80 */     GL32.glTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
/*    */   }
/*    */   
/*    */   public static void glTexImage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
/* 84 */     GL32.glTexImage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
/*    */   }
/*    */   
/*    */   public static void glGetMultisample(int pname, int index, FloatBuffer val) {
/* 88 */     GL32.glGetMultisample(pname, index, val);
/*    */   }
/*    */   
/*    */   public static void glSampleMaski(int index, int mask) {
/* 92 */     GL32.glSampleMaski(index, mask);
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\ARBTextureMultisample.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
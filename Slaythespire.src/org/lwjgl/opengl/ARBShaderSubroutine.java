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
/*    */ public final class ARBShaderSubroutine
/*    */ {
/*    */   public static final int GL_ACTIVE_SUBROUTINES = 36325;
/*    */   public static final int GL_ACTIVE_SUBROUTINE_UNIFORMS = 36326;
/*    */   public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS = 36423;
/*    */   public static final int GL_ACTIVE_SUBROUTINE_MAX_LENGTH = 36424;
/*    */   public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 36425;
/*    */   public static final int GL_MAX_SUBROUTINES = 36327;
/*    */   public static final int GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 36328;
/*    */   public static final int GL_NUM_COMPATIBLE_SUBROUTINES = 36426;
/*    */   public static final int GL_COMPATIBLE_SUBROUTINES = 36427;
/*    */   
/*    */   public static int glGetSubroutineUniformLocation(int program, int shadertype, ByteBuffer name) {
/* 35 */     return GL40.glGetSubroutineUniformLocation(program, shadertype, name);
/*    */   }
/*    */ 
/*    */   
/*    */   public static int glGetSubroutineUniformLocation(int program, int shadertype, CharSequence name) {
/* 40 */     return GL40.glGetSubroutineUniformLocation(program, shadertype, name);
/*    */   }
/*    */   
/*    */   public static int glGetSubroutineIndex(int program, int shadertype, ByteBuffer name) {
/* 44 */     return GL40.glGetSubroutineIndex(program, shadertype, name);
/*    */   }
/*    */ 
/*    */   
/*    */   public static int glGetSubroutineIndex(int program, int shadertype, CharSequence name) {
/* 49 */     return GL40.glGetSubroutineIndex(program, shadertype, name);
/*    */   }
/*    */   
/*    */   public static void glGetActiveSubroutineUniform(int program, int shadertype, int index, int pname, IntBuffer values) {
/* 53 */     GL40.glGetActiveSubroutineUniform(program, shadertype, index, pname, values);
/*    */   }
/*    */ 
/*    */   
/*    */   public static int glGetActiveSubroutineUniformi(int program, int shadertype, int index, int pname) {
/* 58 */     return GL40.glGetActiveSubroutineUniformi(program, shadertype, index, pname);
/*    */   }
/*    */   
/*    */   public static void glGetActiveSubroutineUniformName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
/* 62 */     GL40.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
/*    */   }
/*    */ 
/*    */   
/*    */   public static String glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize) {
/* 67 */     return GL40.glGetActiveSubroutineUniformName(program, shadertype, index, bufsize);
/*    */   }
/*    */   
/*    */   public static void glGetActiveSubroutineName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
/* 71 */     GL40.glGetActiveSubroutineName(program, shadertype, index, length, name);
/*    */   }
/*    */ 
/*    */   
/*    */   public static String glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize) {
/* 76 */     return GL40.glGetActiveSubroutineName(program, shadertype, index, bufsize);
/*    */   }
/*    */   
/*    */   public static void glUniformSubroutinesu(int shadertype, IntBuffer indices) {
/* 80 */     GL40.glUniformSubroutinesu(shadertype, indices);
/*    */   }
/*    */   
/*    */   public static void glGetUniformSubroutineu(int shadertype, int location, IntBuffer params) {
/* 84 */     GL40.glGetUniformSubroutineu(shadertype, location, params);
/*    */   }
/*    */ 
/*    */   
/*    */   public static int glGetUniformSubroutineui(int shadertype, int location) {
/* 89 */     return GL40.glGetUniformSubroutineui(shadertype, location);
/*    */   }
/*    */   
/*    */   public static void glGetProgramStage(int program, int shadertype, int pname, IntBuffer values) {
/* 93 */     GL40.glGetProgramStage(program, shadertype, pname, values);
/*    */   }
/*    */ 
/*    */   
/*    */   public static int glGetProgramStagei(int program, int shadertype, int pname) {
/* 98 */     return GL40.glGetProgramStagei(program, shadertype, pname);
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\ARBShaderSubroutine.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
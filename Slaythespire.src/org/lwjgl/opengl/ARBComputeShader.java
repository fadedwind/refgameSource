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
/*    */ public final class ARBComputeShader
/*    */ {
/*    */   public static final int GL_COMPUTE_SHADER = 37305;
/*    */   public static final int GL_MAX_COMPUTE_UNIFORM_BLOCKS = 37307;
/*    */   public static final int GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS = 37308;
/*    */   public static final int GL_MAX_COMPUTE_IMAGE_UNIFORMS = 37309;
/*    */   public static final int GL_MAX_COMPUTE_SHARED_MEMORY_SIZE = 33378;
/*    */   public static final int GL_MAX_COMPUTE_UNIFORM_COMPONENTS = 33379;
/*    */   public static final int GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS = 33380;
/*    */   public static final int GL_MAX_COMPUTE_ATOMIC_COUNTERS = 33381;
/*    */   public static final int GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS = 33382;
/*    */   public static final int GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS = 37099;
/*    */   public static final int GL_MAX_COMPUTE_WORK_GROUP_COUNT = 37310;
/*    */   public static final int GL_MAX_COMPUTE_WORK_GROUP_SIZE = 37311;
/*    */   public static final int GL_COMPUTE_WORK_GROUP_SIZE = 33383;
/*    */   public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER = 37100;
/*    */   public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER = 37101;
/*    */   public static final int GL_DISPATCH_INDIRECT_BUFFER = 37102;
/*    */   public static final int GL_DISPATCH_INDIRECT_BUFFER_BINDING = 37103;
/*    */   public static final int GL_COMPUTE_SHADER_BIT = 32;
/*    */   
/*    */   public static void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
/* 73 */     GL43.glDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
/*    */   }
/*    */   
/*    */   public static void glDispatchComputeIndirect(long indirect) {
/* 77 */     GL43.glDispatchComputeIndirect(indirect);
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\ARBComputeShader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
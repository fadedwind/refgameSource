/*     */ package org.lwjgl.opencl;
/*     */ 
/*     */ import org.lwjgl.PointerBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class CLCommandQueue
/*     */   extends CLObjectChild<CLContext>
/*     */ {
/*  43 */   private static final InfoUtil<CLCommandQueue> util = CLPlatform.getInfoUtilInstance(CLCommandQueue.class, "CL_COMMAND_QUEUE_UTIL");
/*     */   
/*     */   private final CLDevice device;
/*     */   
/*     */   private final CLObjectRegistry<CLEvent> clEvents;
/*     */   
/*     */   CLCommandQueue(long pointer, CLContext context, CLDevice device) {
/*  50 */     super(pointer, context);
/*  51 */     if (isValid()) {
/*  52 */       this.device = device;
/*  53 */       this.clEvents = new CLObjectRegistry<CLEvent>();
/*  54 */       context.getCLCommandQueueRegistry().registerObject(this);
/*     */     } else {
/*  56 */       this.device = null;
/*  57 */       this.clEvents = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public CLDevice getCLDevice() {
/*  62 */     return this.device;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CLEvent getCLEvent(long id) {
/*  73 */     return this.clEvents.getObject(id);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getInfoInt(int param_name) {
/*  86 */     return util.getInfoInt(this, param_name);
/*     */   }
/*     */ 
/*     */   
/*     */   CLObjectRegistry<CLEvent> getCLEventRegistry() {
/*  91 */     return this.clEvents;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void registerCLEvent(PointerBuffer event) {
/*  99 */     if (event != null)
/* 100 */       new CLEvent(event.get(event.position()), this); 
/*     */   }
/*     */   
/*     */   int release() {
/*     */     try {
/* 105 */       return super.release();
/*     */     } finally {
/* 107 */       if (!isValid())
/* 108 */         getParent().getCLCommandQueueRegistry().unregisterObject(this); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opencl\CLCommandQueue.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
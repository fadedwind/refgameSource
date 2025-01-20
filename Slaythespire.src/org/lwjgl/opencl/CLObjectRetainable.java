/*    */ package org.lwjgl.opencl;
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
/*    */ abstract class CLObjectRetainable
/*    */   extends CLObject
/*    */ {
/*    */   private int refCount;
/*    */   
/*    */   protected CLObjectRetainable(long pointer) {
/* 44 */     super(pointer);
/*    */     
/* 46 */     if (super.isValid())
/* 47 */       this.refCount = 1; 
/*    */   }
/*    */   
/*    */   public final int getReferenceCount() {
/* 51 */     return this.refCount;
/*    */   }
/*    */   
/*    */   public final boolean isValid() {
/* 55 */     return (this.refCount > 0);
/*    */   }
/*    */   
/*    */   int retain() {
/* 59 */     checkValid();
/*    */     
/* 61 */     return ++this.refCount;
/*    */   }
/*    */   
/*    */   int release() {
/* 65 */     checkValid();
/*    */     
/* 67 */     return --this.refCount;
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opencl\CLObjectRetainable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
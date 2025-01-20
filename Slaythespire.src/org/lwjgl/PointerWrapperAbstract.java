/*    */ package org.lwjgl;
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
/*    */ public abstract class PointerWrapperAbstract
/*    */   implements PointerWrapper
/*    */ {
/*    */   protected final long pointer;
/*    */   
/*    */   protected PointerWrapperAbstract(long pointer) {
/* 44 */     this.pointer = pointer;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isValid() {
/* 56 */     return (this.pointer != 0L);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final void checkValid() {
/* 65 */     if (LWJGLUtil.DEBUG && !isValid())
/* 66 */       throw new IllegalStateException("This " + getClass().getSimpleName() + " pointer is not valid."); 
/*    */   }
/*    */   
/*    */   public final long getPointer() {
/* 70 */     checkValid();
/* 71 */     return this.pointer;
/*    */   }
/*    */   
/*    */   public boolean equals(Object o) {
/* 75 */     if (this == o) return true; 
/* 76 */     if (!(o instanceof PointerWrapperAbstract)) return false;
/*    */     
/* 78 */     PointerWrapperAbstract that = (PointerWrapperAbstract)o;
/*    */     
/* 80 */     if (this.pointer != that.pointer) return false;
/*    */     
/* 82 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 86 */     return (int)(this.pointer ^ this.pointer >>> 32L);
/*    */   }
/*    */   
/*    */   public String toString() {
/* 90 */     return getClass().getSimpleName() + " pointer (0x" + Long.toHexString(this.pointer).toUpperCase() + ")";
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\PointerWrapperAbstract.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package com.sun.jna;
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
/*    */ public class FromNativeContext
/*    */ {
/*    */   private Class<?> type;
/*    */   
/*    */   FromNativeContext(Class<?> javaType) {
/* 30 */     this.type = javaType;
/*    */   }
/*    */   
/*    */   public Class<?> getTargetType() {
/* 34 */     return this.type;
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\com\sun\jna\FromNativeContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
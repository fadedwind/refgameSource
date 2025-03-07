/*    */ package com.google.gson;
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
/*    */ public enum LongSerializationPolicy
/*    */ {
/* 34 */   DEFAULT {
/*    */     public JsonElement serialize(Long value) {
/* 36 */       return new JsonPrimitive(value);
/*    */     }
/*    */   },
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 45 */   STRING {
/*    */     public JsonElement serialize(Long value) {
/* 47 */       return new JsonPrimitive(String.valueOf(value));
/*    */     }
/*    */   };
/*    */   
/*    */   public abstract JsonElement serialize(Long paramLong);
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\com\google\gson\LongSerializationPolicy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
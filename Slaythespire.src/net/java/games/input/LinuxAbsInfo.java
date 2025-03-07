/*    */ package net.java.games.input;
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
/*    */ final class LinuxAbsInfo
/*    */ {
/*    */   private int value;
/*    */   private int minimum;
/*    */   private int maximum;
/*    */   private int fuzz;
/*    */   private int flat;
/*    */   
/*    */   public final void set(int value, int min, int max, int fuzz, int flat) {
/* 39 */     this.value = value;
/* 40 */     this.minimum = min;
/* 41 */     this.maximum = max;
/* 42 */     this.fuzz = fuzz;
/* 43 */     this.flat = flat;
/*    */   }
/*    */   
/*    */   public final String toString() {
/* 47 */     return "AbsInfo: value = " + this.value + " | min = " + this.minimum + " | max = " + this.maximum + " | fuzz = " + this.fuzz + " | flat = " + this.flat;
/*    */   }
/*    */   
/*    */   public final int getValue() {
/* 51 */     return this.value;
/*    */   }
/*    */   
/*    */   final int getMax() {
/* 55 */     return this.maximum;
/*    */   }
/*    */   
/*    */   final int getMin() {
/* 59 */     return this.minimum;
/*    */   }
/*    */   
/*    */   final int getFlat() {
/* 63 */     return this.flat;
/*    */   }
/*    */   
/*    */   final int getFuzz() {
/* 67 */     return this.fuzz;
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\net\java\games\input\LinuxAbsInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */
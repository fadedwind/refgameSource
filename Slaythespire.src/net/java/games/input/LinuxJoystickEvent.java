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
/*    */ final class LinuxJoystickEvent
/*    */ {
/*    */   private long nanos;
/*    */   private int value;
/*    */   private int type;
/*    */   private int number;
/*    */   
/*    */   public final void set(long millis, int value, int type, int number) {
/* 38 */     this.nanos = millis * 1000000L;
/* 39 */     this.value = value;
/* 40 */     this.type = type;
/* 41 */     this.number = number;
/*    */   }
/*    */   
/*    */   public final int getValue() {
/* 45 */     return this.value;
/*    */   }
/*    */   
/*    */   public final int getType() {
/* 49 */     return this.type;
/*    */   }
/*    */   
/*    */   public final int getNumber() {
/* 53 */     return this.number;
/*    */   }
/*    */   
/*    */   public final long getNanos() {
/* 57 */     return this.nanos;
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\net\java\games\input\LinuxJoystickEvent.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */
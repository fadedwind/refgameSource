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
/*    */ final class RawKeyboardEvent
/*    */ {
/*    */   private long millis;
/*    */   private int make_code;
/*    */   private int flags;
/*    */   private int vkey;
/*    */   private int message;
/*    */   private long extra_information;
/*    */   
/*    */   public final void set(long millis, int make_code, int flags, int vkey, int message, long extra_information) {
/* 56 */     this.millis = millis;
/* 57 */     this.make_code = make_code;
/* 58 */     this.flags = flags;
/* 59 */     this.vkey = vkey;
/* 60 */     this.message = message;
/* 61 */     this.extra_information = extra_information;
/*    */   }
/*    */   
/*    */   public final void set(RawKeyboardEvent event) {
/* 65 */     set(event.millis, event.make_code, event.flags, event.vkey, event.message, event.extra_information);
/*    */   }
/*    */   
/*    */   public final int getVKey() {
/* 69 */     return this.vkey;
/*    */   }
/*    */   
/*    */   public final int getMessage() {
/* 73 */     return this.message;
/*    */   }
/*    */   
/*    */   public final long getNanos() {
/* 77 */     return this.millis * 1000000L;
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\net\java\games\input\RawKeyboardEvent.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */
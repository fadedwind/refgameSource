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
/*    */ public final class Event
/*    */ {
/*    */   private Component component;
/*    */   private float value;
/*    */   private long nanos;
/*    */   
/*    */   public final void set(Event other) {
/* 47 */     set(other.getComponent(), other.getValue(), other.getNanos());
/*    */   }
/*    */   
/*    */   public final void set(Component component, float value, long nanos) {
/* 51 */     this.component = component;
/* 52 */     this.value = value;
/* 53 */     this.nanos = nanos;
/*    */   }
/*    */   
/*    */   public final Component getComponent() {
/* 57 */     return this.component;
/*    */   }
/*    */   
/*    */   public final float getValue() {
/* 61 */     return this.value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final long getNanos() {
/* 70 */     return this.nanos;
/*    */   }
/*    */   
/*    */   public final String toString() {
/* 74 */     return "Event: component = " + this.component + " | value = " + this.value;
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\net\java\games\input\Event.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */
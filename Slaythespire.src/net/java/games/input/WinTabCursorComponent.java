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
/*    */ public class WinTabCursorComponent
/*    */   extends WinTabComponent
/*    */ {
/*    */   private int index;
/*    */   
/*    */   protected WinTabCursorComponent(WinTabContext context, int parentDevice, String name, Component.Identifier id, int index) {
/* 33 */     super(context, parentDevice, name, id);
/* 34 */     this.index = index;
/*    */   }
/*    */   
/*    */   public Event processPacket(WinTabPacket packet) {
/* 38 */     Event newEvent = null;
/* 39 */     if (packet.PK_CURSOR == this.index && this.lastKnownValue == 0.0F) {
/* 40 */       this.lastKnownValue = 1.0F;
/* 41 */       newEvent = new Event();
/* 42 */       newEvent.set(this, this.lastKnownValue, packet.PK_TIME * 1000L);
/* 43 */     } else if (packet.PK_CURSOR != this.index && this.lastKnownValue == 1.0F) {
/* 44 */       this.lastKnownValue = 0.0F;
/* 45 */       newEvent = new Event();
/* 46 */       newEvent.set(this, this.lastKnownValue, packet.PK_TIME * 1000L);
/*    */     } 
/*    */     
/* 49 */     return newEvent;
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\net\java\games\input\WinTabCursorComponent.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */
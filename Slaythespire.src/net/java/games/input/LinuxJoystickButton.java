/*    */ package net.java.games.input;
/*    */ 
/*    */ import java.io.IOException;
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
/*    */ final class LinuxJoystickButton
/*    */   extends AbstractComponent
/*    */ {
/*    */   private float value;
/*    */   
/*    */   public LinuxJoystickButton(Component.Identifier button_id) {
/* 51 */     super(button_id.getName(), button_id);
/*    */   }
/*    */   
/*    */   public final boolean isRelative() {
/* 55 */     return false;
/*    */   }
/*    */   
/*    */   final void setValue(float value) {
/* 59 */     this.value = value;
/*    */   }
/*    */   
/*    */   protected final float poll() throws IOException {
/* 63 */     return this.value;
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\net\java\games\input\LinuxJoystickButton.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */
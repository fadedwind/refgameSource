/*    */ package com.badlogic.gdx.scenes.scene2d.actions;
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
/*    */ public abstract class RelativeTemporalAction
/*    */   extends TemporalAction
/*    */ {
/*    */   private float lastPercent;
/*    */   
/*    */   protected void begin() {
/* 25 */     this.lastPercent = 0.0F;
/*    */   }
/*    */   
/*    */   protected void update(float percent) {
/* 29 */     updateRelative(percent - this.lastPercent);
/* 30 */     this.lastPercent = percent;
/*    */   }
/*    */   
/*    */   protected abstract void updateRelative(float paramFloat);
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\com\badlogic\gdx\scenes\scene2d\actions\RelativeTemporalAction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
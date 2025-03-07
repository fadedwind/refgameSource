/*    */ package com.megacrit.cardcrawl.actions.animations;
/*    */ 
/*    */ import com.megacrit.cardcrawl.actions.AbstractGameAction;
/*    */ import com.megacrit.cardcrawl.core.AbstractCreature;
/*    */ 
/*    */ public class FastShakeAction extends AbstractGameAction {
/*    */   private boolean called = false;
/*    */   private float shakeDur;
/*    */   
/*    */   public FastShakeAction(AbstractCreature owner, float shakeDur, float actionDur) {
/* 11 */     setValues(null, owner, 0);
/* 12 */     this.duration = actionDur;
/* 13 */     this.actionType = AbstractGameAction.ActionType.WAIT;
/* 14 */     this.shakeDur = shakeDur;
/*    */   }
/*    */ 
/*    */   
/*    */   public void update() {
/* 19 */     if (!this.called) {
/* 20 */       this.source.useShakeAnimation(this.shakeDur);
/* 21 */       this.called = true;
/*    */     } 
/* 23 */     tickDuration();
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\com\megacrit\cardcrawl\actions\animations\FastShakeAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
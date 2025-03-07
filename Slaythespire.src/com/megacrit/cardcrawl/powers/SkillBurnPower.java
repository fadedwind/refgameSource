/*    */ package com.megacrit.cardcrawl.powers;
/*    */ 
/*    */ import com.megacrit.cardcrawl.actions.AbstractGameAction;
/*    */ import com.megacrit.cardcrawl.actions.common.ReducePowerAction;
/*    */ import com.megacrit.cardcrawl.actions.utility.UseCardAction;
/*    */ import com.megacrit.cardcrawl.cards.AbstractCard;
/*    */ import com.megacrit.cardcrawl.core.AbstractCreature;
/*    */ import com.megacrit.cardcrawl.core.CardCrawlGame;
/*    */ import com.megacrit.cardcrawl.localization.PowerStrings;
/*    */ 
/*    */ public class SkillBurnPower extends AbstractPower {
/*    */   public static final String POWER_ID = "Skill Burn";
/* 13 */   private static final PowerStrings powerStrings = CardCrawlGame.languagePack.getPowerStrings("Skill Burn");
/* 14 */   public static final String NAME = powerStrings.NAME;
/* 15 */   public static final String[] DESCRIPTIONS = powerStrings.DESCRIPTIONS;
/*    */   
/*    */   private boolean justApplied = true;
/*    */   
/*    */   public SkillBurnPower(AbstractCreature owner, int amount) {
/* 20 */     this.name = NAME;
/* 21 */     this.ID = "Skill Burn";
/* 22 */     this.owner = owner;
/* 23 */     this.amount = amount;
/* 24 */     updateDescription();
/* 25 */     loadRegion("skillBurn");
/* 26 */     this.type = AbstractPower.PowerType.DEBUFF;
/* 27 */     this.isTurnBased = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void atEndOfRound() {
/* 32 */     if (this.justApplied) {
/* 33 */       this.justApplied = false;
/*    */       
/*    */       return;
/*    */     } 
/* 37 */     addToBot((AbstractGameAction)new ReducePowerAction(this.owner, this.owner, "Skill Burn", 1));
/*    */   }
/*    */ 
/*    */   
/*    */   public void updateDescription() {
/* 42 */     if (this.amount == 1) {
/* 43 */       this.description = DESCRIPTIONS[0] + this.amount + DESCRIPTIONS[1];
/*    */     } else {
/* 45 */       this.description = DESCRIPTIONS[2] + this.amount + DESCRIPTIONS[3];
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void onUseCard(AbstractCard card, UseCardAction action) {
/* 51 */     if (card.type == AbstractCard.CardType.SKILL) {
/* 52 */       flash();
/* 53 */       action.exhaustCard = true;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\com\megacrit\cardcrawl\powers\SkillBurnPower.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
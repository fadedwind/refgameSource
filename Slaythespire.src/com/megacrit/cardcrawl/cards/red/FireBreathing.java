/*    */ package com.megacrit.cardcrawl.cards.red;
/*    */ import com.megacrit.cardcrawl.actions.AbstractGameAction;
/*    */ import com.megacrit.cardcrawl.actions.common.ApplyPowerAction;
/*    */ import com.megacrit.cardcrawl.cards.AbstractCard;
/*    */ import com.megacrit.cardcrawl.characters.AbstractPlayer;
/*    */ import com.megacrit.cardcrawl.core.AbstractCreature;
/*    */ import com.megacrit.cardcrawl.core.CardCrawlGame;
/*    */ import com.megacrit.cardcrawl.monsters.AbstractMonster;
/*    */ import com.megacrit.cardcrawl.powers.AbstractPower;
/*    */ import com.megacrit.cardcrawl.powers.FireBreathingPower;
/*    */ 
/*    */ public class FireBreathing extends AbstractCard {
/* 13 */   private static final CardStrings cardStrings = CardCrawlGame.languagePack.getCardStrings("Fire Breathing"); public static final String ID = "Fire Breathing";
/*    */   
/*    */   public FireBreathing() {
/* 16 */     super("Fire Breathing", cardStrings.NAME, "red/power/fire_breathing", 1, cardStrings.DESCRIPTION, AbstractCard.CardType.POWER, AbstractCard.CardColor.RED, AbstractCard.CardRarity.UNCOMMON, AbstractCard.CardTarget.SELF);
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
/* 27 */     this.baseMagicNumber = 6;
/* 28 */     this.magicNumber = this.baseMagicNumber;
/*    */   }
/*    */ 
/*    */   
/*    */   public void use(AbstractPlayer p, AbstractMonster m) {
/* 33 */     addToBot((AbstractGameAction)new ApplyPowerAction((AbstractCreature)p, (AbstractCreature)p, (AbstractPower)new FireBreathingPower((AbstractCreature)p, this.magicNumber), this.magicNumber));
/*    */   }
/*    */ 
/*    */   
/*    */   public void upgrade() {
/* 38 */     if (!this.upgraded) {
/* 39 */       upgradeName();
/* 40 */       upgradeMagicNumber(4);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public AbstractCard makeCopy() {
/* 46 */     return new FireBreathing();
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\com\megacrit\cardcrawl\cards\red\FireBreathing.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package com.megacrit.cardcrawl.cards.blue;
/*    */ import com.megacrit.cardcrawl.actions.AbstractGameAction;
/*    */ import com.megacrit.cardcrawl.actions.common.ApplyPowerAction;
/*    */ import com.megacrit.cardcrawl.cards.AbstractCard;
/*    */ import com.megacrit.cardcrawl.characters.AbstractPlayer;
/*    */ import com.megacrit.cardcrawl.core.AbstractCreature;
/*    */ import com.megacrit.cardcrawl.core.CardCrawlGame;
/*    */ import com.megacrit.cardcrawl.monsters.AbstractMonster;
/*    */ import com.megacrit.cardcrawl.powers.AbstractPower;
/*    */ import com.megacrit.cardcrawl.powers.HeatsinkPower;
/*    */ 
/*    */ public class Heatsinks extends AbstractCard {
/* 13 */   private static final CardStrings cardStrings = CardCrawlGame.languagePack.getCardStrings("Heatsinks"); public static final String ID = "Heatsinks";
/*    */   
/*    */   public Heatsinks() {
/* 16 */     super("Heatsinks", cardStrings.NAME, "blue/power/heatsinks", 1, cardStrings.DESCRIPTION, AbstractCard.CardType.POWER, AbstractCard.CardColor.BLUE, AbstractCard.CardRarity.UNCOMMON, AbstractCard.CardTarget.SELF);
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
/* 27 */     this.baseMagicNumber = 1;
/* 28 */     this.magicNumber = this.baseMagicNumber;
/*    */   }
/*    */ 
/*    */   
/*    */   public void use(AbstractPlayer p, AbstractMonster m) {
/* 33 */     addToBot((AbstractGameAction)new ApplyPowerAction((AbstractCreature)p, (AbstractCreature)p, (AbstractPower)new HeatsinkPower((AbstractCreature)p, this.magicNumber), this.magicNumber));
/*    */   }
/*    */ 
/*    */   
/*    */   public void upgrade() {
/* 38 */     if (!this.upgraded) {
/* 39 */       upgradeName();
/* 40 */       upgradeMagicNumber(1);
/* 41 */       this.rawDescription = cardStrings.UPGRADE_DESCRIPTION;
/* 42 */       initializeDescription();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public AbstractCard makeCopy() {
/* 48 */     return new Heatsinks();
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\com\megacrit\cardcrawl\cards\blue\Heatsinks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
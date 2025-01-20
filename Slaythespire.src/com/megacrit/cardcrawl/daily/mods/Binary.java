/*    */ package com.megacrit.cardcrawl.daily.mods;
/*    */ 
/*    */ import com.megacrit.cardcrawl.core.CardCrawlGame;
/*    */ import com.megacrit.cardcrawl.localization.RunModStrings;
/*    */ 
/*    */ public class Binary extends AbstractDailyMod {
/*    */   public static final String ID = "Binary";
/*  8 */   private static final RunModStrings modStrings = CardCrawlGame.languagePack.getRunModString("Binary");
/*  9 */   public static final String NAME = modStrings.NAME, DESC = modStrings.DESCRIPTION;
/*    */   
/*    */   public Binary() {
/* 12 */     super("Binary", NAME, DESC, "binary.png", false);
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\com\megacrit\cardcrawl\daily\mods\Binary.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package com.megacrit.cardcrawl.vfx.combat;
/*    */ import com.badlogic.gdx.graphics.Color;
/*    */ import com.badlogic.gdx.graphics.g2d.SpriteBatch;
/*    */ import com.badlogic.gdx.graphics.g2d.TextureAtlas;
/*    */ import com.badlogic.gdx.graphics.g2d.TextureRegion;
/*    */ import com.badlogic.gdx.math.Interpolation;
/*    */ import com.badlogic.gdx.math.MathUtils;
/*    */ import com.megacrit.cardcrawl.core.Settings;
/*    */ import com.megacrit.cardcrawl.helpers.ImageMaster;
/*    */ import com.megacrit.cardcrawl.vfx.AbstractGameEffect;
/*    */ 
/*    */ public class PlasmaOrbActivateParticle extends AbstractGameEffect {
/*    */   private float effectDuration;
/*    */   private float x;
/*    */   private float y;
/* 16 */   private TextureAtlas.AtlasRegion img = ImageMaster.GLOW_SPARK_2; private float sX; private float sY; private float tX; private float tY;
/*    */   
/*    */   public PlasmaOrbActivateParticle(float x, float y) {
/* 19 */     this.effectDuration = 0.5F;
/* 20 */     this.duration = this.effectDuration;
/* 21 */     this.startingDuration = this.effectDuration;
/*    */     
/* 23 */     this.sX = x + MathUtils.random(-100.0F, 100.0F) * Settings.scale;
/* 24 */     this.sY = y + MathUtils.random(-30.0F, 30.0F) * Settings.scale;
/* 25 */     this.tX = x;
/* 26 */     this.tY = y;
/* 27 */     this.x = x;
/* 28 */     this.y = y;
/*    */     
/* 30 */     int tmp = MathUtils.random(2);
/* 31 */     if (tmp == 0) {
/* 32 */       this.color = Settings.LIGHT_YELLOW_COLOR.cpy();
/* 33 */     } else if (tmp == 1) {
/* 34 */       this.color = Color.CYAN.cpy();
/*    */     } else {
/* 36 */       this.color = Color.SALMON.cpy();
/*    */     } 
/*    */     
/* 39 */     this.scale = MathUtils.random(0.6F, 1.8F) * Settings.scale;
/* 40 */     this.renderBehind = true;
/*    */   }
/*    */   
/*    */   public void update() {
/* 44 */     this.x = Interpolation.swing.apply(this.sX, this.tX, this.duration);
/* 45 */     this.y = Interpolation.swing.apply(this.sY, this.tY, this.duration);
/*    */     
/* 47 */     super.update();
/*    */   }
/*    */ 
/*    */   
/*    */   public void render(SpriteBatch sb) {
/* 52 */     sb.setColor(this.color);
/* 53 */     sb.setBlendFunction(770, 1);
/* 54 */     sb.draw((TextureRegion)this.img, this.x - this.img.packedWidth / 2.0F, this.y - this.img.packedWidth / 2.0F, this.img.packedWidth / 2.0F, this.img.packedHeight / 2.0F, this.img.packedWidth, this.img.packedHeight, this.scale * 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 62 */         MathUtils.random(0.7F, 1.4F), this.scale * 
/* 63 */         MathUtils.random(0.7F, 1.4F), this.rotation);
/*    */     
/* 65 */     sb.setBlendFunction(770, 771);
/*    */   }
/*    */   
/*    */   public void dispose() {}
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\com\megacrit\cardcrawl\vfx\combat\PlasmaOrbActivateParticle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
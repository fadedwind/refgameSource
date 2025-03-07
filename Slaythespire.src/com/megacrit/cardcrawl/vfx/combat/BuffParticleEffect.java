/*    */ package com.megacrit.cardcrawl.vfx.combat;
/*    */ 
/*    */ import com.badlogic.gdx.Gdx;
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
/*    */ public class BuffParticleEffect
/*    */   extends AbstractGameEffect {
/*    */   private TextureAtlas.AtlasRegion img;
/*    */   private static final float DURATION = 0.5F;
/* 18 */   private float scale = 0.0F; private float x; private float y; private float vY;
/*    */   
/*    */   public BuffParticleEffect(float x, float y) {
/* 21 */     this.x = x + MathUtils.random(-25.0F, 25.0F) * Settings.scale;
/* 22 */     this.y = y + MathUtils.random(-20.0F, 10.0F) * Settings.scale;
/* 23 */     this.duration = 0.5F;
/* 24 */     this.rotation = MathUtils.random(-5.0F, 5.0F);
/*    */     
/* 26 */     switch (MathUtils.random(2)) {
/*    */       case 0:
/* 28 */         this.img = ImageMaster.vfxAtlas.findRegion("buffVFX1");
/*    */         break;
/*    */       case 1:
/* 31 */         this.img = ImageMaster.vfxAtlas.findRegion("buffVFX2");
/*    */         break;
/*    */       default:
/* 34 */         this.img = ImageMaster.vfxAtlas.findRegion("buffVFX3");
/*    */         break;
/*    */     } 
/*    */     
/* 38 */     this.renderBehind = MathUtils.randomBoolean();
/* 39 */     this.vY = MathUtils.random(30.0F, 50.0F) * Settings.scale;
/* 40 */     this.color = new Color(1.0F, 1.0F, 1.0F, 0.0F);
/* 41 */     this.scale = MathUtils.random(1.0F, 1.5F) * Settings.scale;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void update() {
/* 47 */     this.scale += Gdx.graphics.getDeltaTime() / 2.0F;
/*    */ 
/*    */     
/* 50 */     if (this.duration > 0.5F) {
/*    */       
/* 52 */       this.color.a = Interpolation.fade.apply(0.0F, 1.0F, 1.0F - this.duration - 3.0F);
/* 53 */     } else if (this.duration < 0.5F) {
/*    */       
/* 55 */       this.color.a = Interpolation.fade.apply(1.0F, 0.0F, 1.0F - this.duration * 2.0F);
/*    */     } 
/*    */ 
/*    */     
/* 59 */     this.y += Gdx.graphics.getDeltaTime() * this.vY;
/*    */     
/* 61 */     this.duration -= Gdx.graphics.getDeltaTime();
/* 62 */     if (this.duration < 0.0F) {
/* 63 */       this.isDone = true;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void render(SpriteBatch sb) {
/* 69 */     sb.setBlendFunction(770, 1);
/* 70 */     sb.setColor(this.color);
/* 71 */     sb.draw((TextureRegion)this.img, this.x - this.img.packedWidth / 2.0F, this.y - this.img.packedHeight / 2.0F, this.img.offsetX, this.img.offsetY, this.img.packedWidth, this.img.packedHeight, this.scale, this.scale, this.rotation);
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
/* 82 */     sb.setBlendFunction(770, 771);
/*    */   }
/*    */   
/*    */   public void dispose() {}
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\com\megacrit\cardcrawl\vfx\combat\BuffParticleEffect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
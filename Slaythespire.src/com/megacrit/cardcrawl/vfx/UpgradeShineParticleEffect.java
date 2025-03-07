/*     */ package com.megacrit.cardcrawl.vfx;
/*     */ 
/*     */ import com.badlogic.gdx.Gdx;
/*     */ import com.badlogic.gdx.graphics.Color;
/*     */ import com.badlogic.gdx.graphics.g2d.SpriteBatch;
/*     */ import com.badlogic.gdx.graphics.g2d.TextureAtlas;
/*     */ import com.badlogic.gdx.graphics.g2d.TextureRegion;
/*     */ import com.badlogic.gdx.math.Interpolation;
/*     */ import com.badlogic.gdx.math.MathUtils;
/*     */ import com.badlogic.gdx.math.Vector2;
/*     */ import com.megacrit.cardcrawl.core.Settings;
/*     */ import com.megacrit.cardcrawl.helpers.ImageMaster;
/*     */ 
/*     */ public class UpgradeShineParticleEffect extends AbstractGameEffect {
/*     */   private TextureAtlas.AtlasRegion img;
/*     */   private static final float DUR = 1.0F;
/*     */   private float x;
/*  18 */   private static final float GRAVITY = 3000.0F * Settings.scale;
/*     */   
/*     */   private float y;
/*     */   
/*     */   private float vX;
/*     */   
/*     */   private float vY;
/*     */   private float floor;
/*     */   
/*     */   public UpgradeShineParticleEffect(float x, float y) {
/*  28 */     if (MathUtils.randomBoolean()) {
/*  29 */       this.img = ImageMaster.STRIKE_LINE_2;
/*     */     } else {
/*  31 */       this.img = ImageMaster.GLOW_SPARK_2;
/*     */     } 
/*     */     
/*  34 */     this.duration = MathUtils.random(0.5F, 1.0F);
/*  35 */     this.x = x - (this.img.packedWidth / 2);
/*  36 */     this.y = y - (this.img.packedHeight / 2);
/*  37 */     this
/*     */ 
/*     */       
/*  40 */       .color = new Color(MathUtils.random(0.5F, 1.0F), MathUtils.random(0.4F, 0.6F), MathUtils.random(0.0F, 0.2F), 0.0F);
/*     */     
/*  42 */     this.color.a = 0.0F;
/*  43 */     this.rotation = MathUtils.random(0.0F, 360.0F);
/*  44 */     this.scale = MathUtils.random(0.5F, 2.0F) * Settings.scale;
/*  45 */     this.vX = MathUtils.random(-900.0F, 900.0F) * Settings.scale;
/*  46 */     this.vY = MathUtils.random(-500.0F, 1000.0F) * Settings.scale;
/*  47 */     this.floor = MathUtils.random(100.0F, 250.0F) * Settings.scale;
/*     */   }
/*     */   
/*     */   public void update() {
/*  51 */     this.vY -= GRAVITY / this.scale * Gdx.graphics.getDeltaTime();
/*  52 */     this.x += this.vX * Gdx.graphics.getDeltaTime();
/*  53 */     this.y += this.vY * Gdx.graphics.getDeltaTime();
/*  54 */     Vector2 test = new Vector2(this.vX, this.vY);
/*  55 */     this.rotation = test.angle();
/*     */ 
/*     */     
/*  58 */     if (this.y < this.floor) {
/*  59 */       this.vY = -this.vY * 0.75F;
/*  60 */       this.y = this.floor + 0.1F;
/*  61 */       this.vX *= 1.1F;
/*     */     } 
/*     */     
/*  64 */     if (1.0F - this.duration < 0.1F) {
/*  65 */       this.color.a = Interpolation.fade.apply(0.0F, 1.0F, (1.0F - this.duration) * 10.0F);
/*     */     } else {
/*  67 */       this.color.a = Interpolation.pow2Out.apply(0.0F, 1.0F, this.duration);
/*     */     } 
/*     */     
/*  70 */     this.duration -= Gdx.graphics.getDeltaTime();
/*  71 */     if (this.duration < 0.0F) {
/*  72 */       this.isDone = true;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void render(SpriteBatch sb) {
/*  78 */     sb.setBlendFunction(770, 1);
/*  79 */     sb.setColor(this.color);
/*  80 */     sb.draw((TextureRegion)this.img, this.x, this.y, this.img.packedWidth / 2.0F, this.img.packedHeight / 2.0F, this.img.packedWidth, this.img.packedHeight, this.scale * 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  88 */         MathUtils.random(0.7F, 1.3F), this.scale * 
/*  89 */         MathUtils.random(0.7F, 1.3F), this.rotation);
/*     */     
/*  91 */     sb.draw((TextureRegion)this.img, this.x, this.y, this.img.packedWidth / 2.0F, this.img.packedHeight / 2.0F, this.img.packedWidth, this.img.packedHeight, this.scale * 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  99 */         MathUtils.random(0.7F, 1.3F), this.scale * 
/* 100 */         MathUtils.random(0.7F, 1.3F), this.rotation);
/*     */     
/* 102 */     sb.setBlendFunction(770, 771);
/*     */   }
/*     */   
/*     */   public void dispose() {}
/*     */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\com\megacrit\cardcrawl\vfx\UpgradeShineParticleEffect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
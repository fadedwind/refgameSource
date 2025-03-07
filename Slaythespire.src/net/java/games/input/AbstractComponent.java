/*     */ package net.java.games.input;
/*     */ 
/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbstractComponent
/*     */   implements Component
/*     */ {
/*     */   private final String name;
/*     */   private final Component.Identifier id;
/*     */   private boolean has_polled;
/*     */   private float value;
/*     */   private float event_value;
/*     */   
/*     */   protected AbstractComponent(String name, Component.Identifier id) {
/*  64 */     this.name = name;
/*  65 */     this.id = id;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Component.Identifier getIdentifier() {
/*  72 */     return this.id;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isAnalog() {
/*  80 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getDeadZone() {
/*  91 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getPollData() {
/* 102 */     if (!this.has_polled && !isRelative()) {
/* 103 */       this.has_polled = true;
/*     */       try {
/* 105 */         setPollData(poll());
/* 106 */       } catch (IOException e) {
/* 107 */         ControllerEnvironment.log("Failed to poll component: " + e);
/*     */       } 
/*     */     } 
/* 110 */     return this.value;
/*     */   }
/*     */   
/*     */   final void resetHasPolled() {
/* 114 */     this.has_polled = false;
/*     */   }
/*     */   
/*     */   final void setPollData(float value) {
/* 118 */     this.value = value;
/*     */   }
/*     */   
/*     */   final float getEventValue() {
/* 122 */     return this.event_value;
/*     */   }
/*     */   
/*     */   final void setEventValue(float event_value) {
/* 126 */     this.event_value = event_value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/* 133 */     return this.name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 140 */     return this.name;
/*     */   }
/*     */   
/*     */   protected abstract float poll() throws IOException;
/*     */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\net\java\games\input\AbstractComponent.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */
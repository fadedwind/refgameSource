/*    */ package com.badlogic.gdx.utils.reflect;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ 
/*    */ public final class Annotation
/*    */ {
/*    */   private Annotation annotation;
/*    */   
/*    */   Annotation(Annotation annotation) {
/* 10 */     this.annotation = annotation;
/*    */   }
/*    */ 
/*    */   
/*    */   public <T extends Annotation> T getAnnotation(Class<T> annotationType) {
/* 15 */     if (this.annotation.annotationType().equals(annotationType)) {
/* 16 */       return (T)this.annotation;
/*    */     }
/* 18 */     return null;
/*    */   }
/*    */   
/*    */   public Class<? extends Annotation> getAnnotationType() {
/* 22 */     return this.annotation.annotationType();
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\com\badlogic\gd\\utils\reflect\Annotation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package net.java.games.input;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
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
/*    */ 
/*    */ public class DirectAndRawInputEnvironmentPlugin
/*    */   extends ControllerEnvironment
/*    */ {
/*    */   private RawInputEnvironmentPlugin rawPlugin;
/*    */   private DirectInputEnvironmentPlugin dinputPlugin;
/* 41 */   private Controller[] controllers = null;
/*    */ 
/*    */   
/*    */   public DirectAndRawInputEnvironmentPlugin() {
/* 45 */     this.dinputPlugin = new DirectInputEnvironmentPlugin();
/* 46 */     this.rawPlugin = new RawInputEnvironmentPlugin();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Controller[] getControllers() {
/* 53 */     if (this.controllers == null) {
/* 54 */       boolean rawKeyboardFound = false;
/* 55 */       boolean rawMouseFound = false;
/* 56 */       List tempControllers = new ArrayList();
/* 57 */       Controller[] dinputControllers = this.dinputPlugin.getControllers();
/* 58 */       Controller[] rawControllers = this.rawPlugin.getControllers(); int i;
/* 59 */       for (i = 0; i < rawControllers.length; i++) {
/* 60 */         tempControllers.add(rawControllers[i]);
/* 61 */         if (rawControllers[i].getType() == Controller.Type.KEYBOARD) {
/* 62 */           rawKeyboardFound = true;
/* 63 */         } else if (rawControllers[i].getType() == Controller.Type.MOUSE) {
/* 64 */           rawMouseFound = true;
/*    */         } 
/*    */       } 
/* 67 */       for (i = 0; i < dinputControllers.length; i++) {
/* 68 */         if (dinputControllers[i].getType() == Controller.Type.KEYBOARD) {
/* 69 */           if (!rawKeyboardFound) {
/* 70 */             tempControllers.add(dinputControllers[i]);
/*    */           }
/* 72 */         } else if (dinputControllers[i].getType() == Controller.Type.MOUSE) {
/* 73 */           if (!rawMouseFound) {
/* 74 */             tempControllers.add(dinputControllers[i]);
/*    */           }
/*    */         } else {
/* 77 */           tempControllers.add(dinputControllers[i]);
/*    */         } 
/*    */       } 
/*    */       
/* 81 */       this.controllers = tempControllers.<Controller>toArray(new Controller[0]);
/*    */     } 
/*    */     
/* 84 */     return this.controllers;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isSupported() {
/* 91 */     return (this.rawPlugin.isSupported() || this.dinputPlugin.isSupported());
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\net\java\games\input\DirectAndRawInputEnvironmentPlugin.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */
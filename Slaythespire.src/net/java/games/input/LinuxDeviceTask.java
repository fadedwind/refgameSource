/*    */ package net.java.games.input;
/*    */ 
/*    */ import java.io.IOException;
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
/*    */ abstract class LinuxDeviceTask
/*    */ {
/*    */   public static final int INPROGRESS = 1;
/*    */   public static final int COMPLETED = 2;
/*    */   public static final int FAILED = 3;
/*    */   private Object result;
/*    */   private IOException exception;
/* 37 */   private int state = 1;
/*    */   
/*    */   public final void doExecute() {
/*    */     try {
/* 41 */       this.result = execute();
/* 42 */       this.state = 2;
/* 43 */     } catch (IOException e) {
/* 44 */       this.exception = e;
/* 45 */       this.state = 3;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final IOException getException() {
/* 50 */     return this.exception;
/*    */   }
/*    */   
/*    */   public final Object getResult() {
/* 54 */     return this.result;
/*    */   }
/*    */   
/*    */   public final int getState() {
/* 58 */     return this.state;
/*    */   }
/*    */   
/*    */   protected abstract Object execute() throws IOException;
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\net\java\games\input\LinuxDeviceTask.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */
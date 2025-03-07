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
/*    */ final class OSXControllers
/*    */ {
/* 48 */   private static final OSXEvent osx_event = new OSXEvent();
/*    */   
/*    */   public static final synchronized float poll(OSXHIDElement element) throws IOException {
/* 51 */     element.getElementValue(osx_event);
/* 52 */     return element.convertValue(osx_event.getValue());
/*    */   }
/*    */ 
/*    */   
/*    */   public static final synchronized boolean getNextDeviceEvent(Event event, OSXHIDQueue queue) throws IOException {
/* 57 */     if (queue.getNextEvent(osx_event)) {
/* 58 */       OSXComponent component = queue.mapEvent(osx_event);
/* 59 */       event.set(component, component.getElement().convertValue(osx_event.getValue()), osx_event.getNanos());
/* 60 */       return true;
/*    */     } 
/* 62 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\net\java\games\input\OSXControllers.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */
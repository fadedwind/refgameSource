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
/*    */ final class LinuxMouse
/*    */   extends Mouse
/*    */ {
/*    */   private final Controller.PortType port;
/*    */   private final LinuxEventDevice device;
/*    */   
/*    */   protected LinuxMouse(LinuxEventDevice device, Component[] components, Controller[] children, Rumbler[] rumblers) throws IOException {
/* 52 */     super(device.getName(), components, children, rumblers);
/* 53 */     this.device = device;
/* 54 */     this.port = device.getPortType();
/*    */   }
/*    */   
/*    */   public final Controller.PortType getPortType() {
/* 58 */     return this.port;
/*    */   }
/*    */   
/*    */   public final void pollDevice() throws IOException {
/* 62 */     this.device.pollKeyStates();
/*    */   }
/*    */   
/*    */   protected final boolean getNextDeviceEvent(Event event) throws IOException {
/* 66 */     return LinuxControllers.getNextDeviceEvent(event, this.device);
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\net\java\games\input\LinuxMouse.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */
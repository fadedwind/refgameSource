/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.LWJGLException;
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
/*     */ final class LinuxMouse
/*     */ {
/*     */   private static final int POINTER_WARP_BORDER = 10;
/*     */   private static final int WHEEL_SCALE = 120;
/*     */   private int button_count;
/*     */   private static final int Button1 = 1;
/*     */   private static final int Button2 = 2;
/*     */   private static final int Button3 = 3;
/*     */   private static final int Button4 = 4;
/*     */   private static final int Button5 = 5;
/*     */   private static final int Button6 = 6;
/*     */   private static final int Button7 = 7;
/*     */   private static final int Button8 = 8;
/*     */   private static final int Button9 = 9;
/*     */   private static final int ButtonPress = 4;
/*     */   private static final int ButtonRelease = 5;
/*     */   private final long display;
/*     */   private final long window;
/*     */   private final long input_window;
/*     */   private final long warp_atom;
/*  71 */   private final IntBuffer query_pointer_buffer = BufferUtils.createIntBuffer(4);
/*  72 */   private final ByteBuffer event_buffer = ByteBuffer.allocate(22);
/*     */   
/*     */   private int last_x;
/*     */   private int last_y;
/*     */   private int accum_dx;
/*     */   private int accum_dy;
/*     */   private int accum_dz;
/*     */   private byte[] buttons;
/*     */   private EventQueue event_queue;
/*     */   private long last_event_nanos;
/*     */   
/*     */   LinuxMouse(long display, long window, long input_window) throws LWJGLException {
/*  84 */     this.display = display;
/*  85 */     this.window = window;
/*  86 */     this.input_window = input_window;
/*  87 */     this.warp_atom = LinuxDisplay.nInternAtom(display, "_LWJGL", false);
/*  88 */     this.button_count = nGetButtonCount(display);
/*  89 */     this.buttons = new byte[this.button_count];
/*  90 */     reset(false, false);
/*     */   }
/*     */   
/*     */   private void reset(boolean grab, boolean warp_pointer) {
/*  94 */     this.event_queue = new EventQueue(this.event_buffer.capacity());
/*  95 */     this.accum_dx = this.accum_dy = 0;
/*  96 */     long root_window = nQueryPointer(this.display, this.window, this.query_pointer_buffer);
/*     */     
/*  98 */     int root_x = this.query_pointer_buffer.get(0);
/*  99 */     int root_y = this.query_pointer_buffer.get(1);
/* 100 */     int win_x = this.query_pointer_buffer.get(2);
/* 101 */     int win_y = this.query_pointer_buffer.get(3);
/*     */     
/* 103 */     this.last_x = win_x;
/* 104 */     this.last_y = transformY(win_y);
/* 105 */     doHandlePointerMotion(grab, warp_pointer, root_window, root_x, root_y, win_x, win_y, this.last_event_nanos);
/*     */   }
/*     */   
/*     */   public void read(ByteBuffer buffer) {
/* 109 */     this.event_queue.copyEvents(buffer);
/*     */   }
/*     */   
/*     */   public void poll(boolean grab, IntBuffer coord_buffer, ByteBuffer buttons_buffer) {
/* 113 */     if (grab) {
/* 114 */       coord_buffer.put(0, this.accum_dx);
/* 115 */       coord_buffer.put(1, this.accum_dy);
/*     */     } else {
/* 117 */       coord_buffer.put(0, this.last_x);
/* 118 */       coord_buffer.put(1, this.last_y);
/*     */     } 
/* 120 */     coord_buffer.put(2, this.accum_dz);
/* 121 */     this.accum_dx = this.accum_dy = this.accum_dz = 0;
/* 122 */     for (int i = 0; i < this.buttons.length; i++)
/* 123 */       buttons_buffer.put(i, this.buttons[i]); 
/*     */   }
/*     */   
/*     */   private void putMouseEventWithCoords(byte button, byte state, int coord1, int coord2, int dz, long nanos) {
/* 127 */     this.event_buffer.clear();
/* 128 */     this.event_buffer.put(button).put(state).putInt(coord1).putInt(coord2).putInt(dz).putLong(nanos);
/* 129 */     this.event_buffer.flip();
/* 130 */     this.event_queue.putEvent(this.event_buffer);
/* 131 */     this.last_event_nanos = nanos;
/*     */   }
/*     */   
/*     */   private void setCursorPos(boolean grab, int x, int y, long nanos) {
/* 135 */     y = transformY(y);
/* 136 */     int dx = x - this.last_x;
/* 137 */     int dy = y - this.last_y;
/* 138 */     if (dx != 0 || dy != 0) {
/* 139 */       this.accum_dx += dx;
/* 140 */       this.accum_dy += dy;
/* 141 */       this.last_x = x;
/* 142 */       this.last_y = y;
/* 143 */       if (grab) {
/* 144 */         putMouseEventWithCoords((byte)-1, (byte)0, dx, dy, 0, nanos);
/*     */       } else {
/* 146 */         putMouseEventWithCoords((byte)-1, (byte)0, x, y, 0, nanos);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void doWarpPointer(int center_x, int center_y) {
/* 152 */     nSendWarpEvent(this.display, this.input_window, this.warp_atom, center_x, center_y);
/* 153 */     nWarpCursor(this.display, this.window, center_x, center_y);
/*     */   }
/*     */   private static native void nSendWarpEvent(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2);
/*     */   
/*     */   private void doHandlePointerMotion(boolean grab, boolean warp_pointer, long root_window, int root_x, int root_y, int win_x, int win_y, long nanos) {
/* 158 */     setCursorPos(grab, win_x, win_y, nanos);
/* 159 */     if (!warp_pointer)
/*     */       return; 
/* 161 */     int root_window_height = nGetWindowHeight(this.display, root_window);
/* 162 */     int root_window_width = nGetWindowWidth(this.display, root_window);
/* 163 */     int window_height = nGetWindowHeight(this.display, this.window);
/* 164 */     int window_width = nGetWindowWidth(this.display, this.window);
/*     */ 
/*     */     
/* 167 */     int win_left = root_x - win_x;
/* 168 */     int win_top = root_y - win_y;
/* 169 */     int win_right = win_left + window_width;
/* 170 */     int win_bottom = win_top + window_height;
/*     */     
/* 172 */     int border_left = Math.max(0, win_left);
/* 173 */     int border_top = Math.max(0, win_top);
/* 174 */     int border_right = Math.min(root_window_width, win_right);
/* 175 */     int border_bottom = Math.min(root_window_height, win_bottom);
/*     */     
/* 177 */     boolean outside_limits = (root_x < border_left + 10 || root_y < border_top + 10 || root_x > border_right - 10 || root_y > border_bottom - 10);
/*     */     
/* 179 */     if (outside_limits) {
/*     */       
/* 181 */       int center_x = (border_right - border_left) / 2;
/* 182 */       int center_y = (border_bottom - border_top) / 2;
/* 183 */       doWarpPointer(center_x, center_y);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void changeGrabbed(boolean grab, boolean warp_pointer) {
/* 188 */     reset(grab, warp_pointer);
/*     */   }
/*     */   
/*     */   public int getButtonCount() {
/* 192 */     return this.buttons.length;
/*     */   } private static native int nGetWindowHeight(long paramLong1, long paramLong2);
/*     */   private static native int nGetWindowWidth(long paramLong1, long paramLong2);
/*     */   private int transformY(int y) {
/* 196 */     return nGetWindowHeight(this.display, this.window) - 1 - y;
/*     */   }
/*     */ 
/*     */   
/*     */   private static native int nGetButtonCount(long paramLong);
/*     */ 
/*     */   
/*     */   private static native long nQueryPointer(long paramLong1, long paramLong2, IntBuffer paramIntBuffer);
/*     */   
/*     */   public void setCursorPosition(int x, int y) {
/* 206 */     nWarpCursor(this.display, this.window, x, transformY(y));
/*     */   }
/*     */   private static native void nWarpCursor(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*     */   
/*     */   private void handlePointerMotion(boolean grab, boolean warp_pointer, long millis, long root_window, int x_root, int y_root, int x, int y) {
/* 211 */     doHandlePointerMotion(grab, warp_pointer, root_window, x_root, y_root, x, y, millis * 1000000L);
/*     */   }
/*     */   
/*     */   private void handleButton(boolean grab, int button, byte state, long nanos) {
/*     */     byte button_num;
/* 216 */     switch (button) {
/*     */       case 1:
/* 218 */         button_num = 0;
/*     */         break;
/*     */       case 2:
/* 221 */         button_num = 2;
/*     */         break;
/*     */       case 3:
/* 224 */         button_num = 1;
/*     */         break;
/*     */       case 6:
/* 227 */         button_num = 5;
/*     */         break;
/*     */       case 7:
/* 230 */         button_num = 6;
/*     */         break;
/*     */       case 8:
/* 233 */         button_num = 3;
/*     */         break;
/*     */       case 9:
/* 236 */         button_num = 4;
/*     */         break;
/*     */       default:
/* 239 */         if (button > 9 && button <= this.button_count) {
/* 240 */           button_num = (byte)(button - 1);
/*     */           break;
/*     */         } 
/*     */         return;
/*     */     } 
/* 245 */     this.buttons[button_num] = state;
/* 246 */     putMouseEvent(grab, button_num, state, 0, nanos);
/*     */   }
/*     */   
/*     */   private void putMouseEvent(boolean grab, byte button, byte state, int dz, long nanos) {
/* 250 */     if (grab) {
/* 251 */       putMouseEventWithCoords(button, state, 0, 0, dz, nanos);
/*     */     } else {
/* 253 */       putMouseEventWithCoords(button, state, this.last_x, this.last_y, dz, nanos);
/*     */     } 
/*     */   }
/*     */   private void handleButtonPress(boolean grab, byte button, long nanos) {
/* 257 */     int delta = 0;
/* 258 */     switch (button) {
/*     */       case 4:
/* 260 */         delta = 120;
/* 261 */         putMouseEvent(grab, (byte)-1, (byte)0, delta, nanos);
/* 262 */         this.accum_dz += delta;
/*     */         return;
/*     */       case 5:
/* 265 */         delta = -120;
/* 266 */         putMouseEvent(grab, (byte)-1, (byte)0, delta, nanos);
/* 267 */         this.accum_dz += delta;
/*     */         return;
/*     */     } 
/* 270 */     handleButton(grab, button, (byte)1, nanos);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void handleButtonEvent(boolean grab, long millis, int type, byte button) {
/* 276 */     long nanos = millis * 1000000L;
/* 277 */     switch (type) {
/*     */       case 5:
/* 279 */         handleButton(grab, button, (byte)0, nanos);
/*     */         break;
/*     */       case 4:
/* 282 */         handleButtonPress(grab, button, nanos);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void resetCursor(int x, int y) {
/* 290 */     this.last_x = x;
/* 291 */     this.last_y = transformY(y);
/*     */   }
/*     */   
/*     */   private void handleWarpEvent(int x, int y) {
/* 295 */     resetCursor(x, y);
/*     */   }
/*     */   
/*     */   public boolean filterEvent(boolean grab, boolean warp_pointer, LinuxEvent event) {
/* 299 */     switch (event.getType()) {
/*     */       case 33:
/* 301 */         if (event.getClientMessageType() == this.warp_atom) {
/* 302 */           handleWarpEvent(event.getClientData(0), event.getClientData(1));
/* 303 */           return true;
/*     */         } 
/*     */         break;
/*     */       case 4:
/*     */       case 5:
/* 308 */         handleButtonEvent(grab, event.getButtonTime(), event.getButtonType(), (byte)event.getButtonButton());
/* 309 */         return true;
/*     */       case 6:
/* 311 */         handlePointerMotion(grab, warp_pointer, event.getButtonTime(), event.getButtonRoot(), event.getButtonXRoot(), event.getButtonYRoot(), event.getButtonX(), event.getButtonY());
/* 312 */         return true;
/*     */     } 
/*     */ 
/*     */     
/* 316 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\LinuxMouse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
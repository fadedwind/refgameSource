/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.util.HashMap;
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
/*     */ final class MacOSXNativeKeyboard
/*     */   extends EventQueue
/*     */ {
/*  47 */   private final byte[] key_states = new byte[256];
/*     */ 
/*     */   
/*  50 */   private final ByteBuffer event = ByteBuffer.allocate(18);
/*     */   
/*     */   private ByteBuffer window_handle;
/*     */   
/*     */   private boolean has_deferred_event;
/*     */   
/*     */   private long deferred_nanos;
/*     */   private int deferred_key_code;
/*     */   private byte deferred_key_state;
/*     */   private int deferred_character;
/*     */   private HashMap<Short, Integer> nativeToLwjglMap;
/*     */   
/*     */   MacOSXNativeKeyboard(ByteBuffer window_handle) {
/*  63 */     super(18);
/*  64 */     this.nativeToLwjglMap = new HashMap<Short, Integer>();
/*  65 */     initKeyboardMappings();
/*  66 */     this.window_handle = window_handle;
/*     */   }
/*     */ 
/*     */   
/*     */   private native void nRegisterKeyListener(ByteBuffer paramByteBuffer);
/*     */   
/*     */   private native void nUnregisterKeyListener(ByteBuffer paramByteBuffer);
/*     */   
/*     */   private void initKeyboardMappings() {
/*  75 */     this.nativeToLwjglMap.put(Short.valueOf((short)29), Integer.valueOf(11));
/*  76 */     this.nativeToLwjglMap.put(Short.valueOf((short)18), Integer.valueOf(2));
/*  77 */     this.nativeToLwjglMap.put(Short.valueOf((short)19), Integer.valueOf(3));
/*  78 */     this.nativeToLwjglMap.put(Short.valueOf((short)20), Integer.valueOf(4));
/*  79 */     this.nativeToLwjglMap.put(Short.valueOf((short)21), Integer.valueOf(5));
/*  80 */     this.nativeToLwjglMap.put(Short.valueOf((short)23), Integer.valueOf(6));
/*  81 */     this.nativeToLwjglMap.put(Short.valueOf((short)22), Integer.valueOf(7));
/*  82 */     this.nativeToLwjglMap.put(Short.valueOf((short)26), Integer.valueOf(8));
/*  83 */     this.nativeToLwjglMap.put(Short.valueOf((short)28), Integer.valueOf(9));
/*  84 */     this.nativeToLwjglMap.put(Short.valueOf((short)25), Integer.valueOf(10));
/*  85 */     this.nativeToLwjglMap.put(Short.valueOf((short)0), Integer.valueOf(30));
/*  86 */     this.nativeToLwjglMap.put(Short.valueOf((short)11), Integer.valueOf(48));
/*  87 */     this.nativeToLwjglMap.put(Short.valueOf((short)8), Integer.valueOf(46));
/*  88 */     this.nativeToLwjglMap.put(Short.valueOf((short)2), Integer.valueOf(32));
/*  89 */     this.nativeToLwjglMap.put(Short.valueOf((short)14), Integer.valueOf(18));
/*  90 */     this.nativeToLwjglMap.put(Short.valueOf((short)3), Integer.valueOf(33));
/*  91 */     this.nativeToLwjglMap.put(Short.valueOf((short)5), Integer.valueOf(34));
/*  92 */     this.nativeToLwjglMap.put(Short.valueOf((short)4), Integer.valueOf(35));
/*  93 */     this.nativeToLwjglMap.put(Short.valueOf((short)34), Integer.valueOf(23));
/*  94 */     this.nativeToLwjglMap.put(Short.valueOf((short)38), Integer.valueOf(36));
/*  95 */     this.nativeToLwjglMap.put(Short.valueOf((short)40), Integer.valueOf(37));
/*  96 */     this.nativeToLwjglMap.put(Short.valueOf((short)37), Integer.valueOf(38));
/*  97 */     this.nativeToLwjglMap.put(Short.valueOf((short)46), Integer.valueOf(50));
/*  98 */     this.nativeToLwjglMap.put(Short.valueOf((short)45), Integer.valueOf(49));
/*  99 */     this.nativeToLwjglMap.put(Short.valueOf((short)31), Integer.valueOf(24));
/* 100 */     this.nativeToLwjglMap.put(Short.valueOf((short)35), Integer.valueOf(25));
/* 101 */     this.nativeToLwjglMap.put(Short.valueOf((short)12), Integer.valueOf(16));
/* 102 */     this.nativeToLwjglMap.put(Short.valueOf((short)15), Integer.valueOf(19));
/* 103 */     this.nativeToLwjglMap.put(Short.valueOf((short)1), Integer.valueOf(31));
/* 104 */     this.nativeToLwjglMap.put(Short.valueOf((short)17), Integer.valueOf(20));
/* 105 */     this.nativeToLwjglMap.put(Short.valueOf((short)32), Integer.valueOf(22));
/* 106 */     this.nativeToLwjglMap.put(Short.valueOf((short)9), Integer.valueOf(47));
/* 107 */     this.nativeToLwjglMap.put(Short.valueOf((short)13), Integer.valueOf(17));
/* 108 */     this.nativeToLwjglMap.put(Short.valueOf((short)7), Integer.valueOf(45));
/* 109 */     this.nativeToLwjglMap.put(Short.valueOf((short)16), Integer.valueOf(21));
/* 110 */     this.nativeToLwjglMap.put(Short.valueOf((short)6), Integer.valueOf(44));
/*     */     
/* 112 */     this.nativeToLwjglMap.put(Short.valueOf((short)42), Integer.valueOf(43));
/* 113 */     this.nativeToLwjglMap.put(Short.valueOf((short)43), Integer.valueOf(51));
/* 114 */     this.nativeToLwjglMap.put(Short.valueOf((short)24), Integer.valueOf(13));
/* 115 */     this.nativeToLwjglMap.put(Short.valueOf((short)33), Integer.valueOf(26));
/* 116 */     this.nativeToLwjglMap.put(Short.valueOf((short)27), Integer.valueOf(12));
/* 117 */     this.nativeToLwjglMap.put(Short.valueOf((short)39), Integer.valueOf(40));
/* 118 */     this.nativeToLwjglMap.put(Short.valueOf((short)30), Integer.valueOf(27));
/* 119 */     this.nativeToLwjglMap.put(Short.valueOf((short)41), Integer.valueOf(39));
/* 120 */     this.nativeToLwjglMap.put(Short.valueOf((short)44), Integer.valueOf(53));
/* 121 */     this.nativeToLwjglMap.put(Short.valueOf((short)47), Integer.valueOf(52));
/* 122 */     this.nativeToLwjglMap.put(Short.valueOf((short)50), Integer.valueOf(41));
/*     */     
/* 124 */     this.nativeToLwjglMap.put(Short.valueOf((short)65), Integer.valueOf(83));
/* 125 */     this.nativeToLwjglMap.put(Short.valueOf((short)67), Integer.valueOf(55));
/* 126 */     this.nativeToLwjglMap.put(Short.valueOf((short)69), Integer.valueOf(78));
/* 127 */     this.nativeToLwjglMap.put(Short.valueOf((short)71), Integer.valueOf(218));
/* 128 */     this.nativeToLwjglMap.put(Short.valueOf((short)75), Integer.valueOf(181));
/* 129 */     this.nativeToLwjglMap.put(Short.valueOf((short)76), Integer.valueOf(156));
/* 130 */     this.nativeToLwjglMap.put(Short.valueOf((short)78), Integer.valueOf(74));
/* 131 */     this.nativeToLwjglMap.put(Short.valueOf((short)81), Integer.valueOf(141));
/*     */     
/* 133 */     this.nativeToLwjglMap.put(Short.valueOf((short)82), Integer.valueOf(82));
/* 134 */     this.nativeToLwjglMap.put(Short.valueOf((short)83), Integer.valueOf(79));
/* 135 */     this.nativeToLwjglMap.put(Short.valueOf((short)84), Integer.valueOf(80));
/* 136 */     this.nativeToLwjglMap.put(Short.valueOf((short)85), Integer.valueOf(81));
/* 137 */     this.nativeToLwjglMap.put(Short.valueOf((short)86), Integer.valueOf(75));
/* 138 */     this.nativeToLwjglMap.put(Short.valueOf((short)87), Integer.valueOf(76));
/* 139 */     this.nativeToLwjglMap.put(Short.valueOf((short)88), Integer.valueOf(77));
/* 140 */     this.nativeToLwjglMap.put(Short.valueOf((short)89), Integer.valueOf(71));
/* 141 */     this.nativeToLwjglMap.put(Short.valueOf((short)91), Integer.valueOf(72));
/* 142 */     this.nativeToLwjglMap.put(Short.valueOf((short)92), Integer.valueOf(73));
/*     */ 
/*     */     
/* 145 */     this.nativeToLwjglMap.put(Short.valueOf((short)36), Integer.valueOf(28));
/* 146 */     this.nativeToLwjglMap.put(Short.valueOf((short)48), Integer.valueOf(15));
/* 147 */     this.nativeToLwjglMap.put(Short.valueOf((short)49), Integer.valueOf(57));
/* 148 */     this.nativeToLwjglMap.put(Short.valueOf((short)51), Integer.valueOf(14));
/* 149 */     this.nativeToLwjglMap.put(Short.valueOf((short)53), Integer.valueOf(1));
/* 150 */     this.nativeToLwjglMap.put(Short.valueOf((short)54), Integer.valueOf(220));
/* 151 */     this.nativeToLwjglMap.put(Short.valueOf((short)55), Integer.valueOf(219));
/* 152 */     this.nativeToLwjglMap.put(Short.valueOf((short)56), Integer.valueOf(42));
/* 153 */     this.nativeToLwjglMap.put(Short.valueOf((short)57), Integer.valueOf(58));
/* 154 */     this.nativeToLwjglMap.put(Short.valueOf((short)58), Integer.valueOf(56));
/* 155 */     this.nativeToLwjglMap.put(Short.valueOf((short)59), Integer.valueOf(29));
/* 156 */     this.nativeToLwjglMap.put(Short.valueOf((short)60), Integer.valueOf(54));
/* 157 */     this.nativeToLwjglMap.put(Short.valueOf((short)61), Integer.valueOf(184));
/* 158 */     this.nativeToLwjglMap.put(Short.valueOf((short)62), Integer.valueOf(157));
/*     */     
/* 160 */     this.nativeToLwjglMap.put(Short.valueOf((short)63), Integer.valueOf(196));
/* 161 */     this.nativeToLwjglMap.put(Short.valueOf((short)119), Integer.valueOf(207));
/*     */     
/* 163 */     this.nativeToLwjglMap.put(Short.valueOf((short)122), Integer.valueOf(59));
/* 164 */     this.nativeToLwjglMap.put(Short.valueOf((short)120), Integer.valueOf(60));
/* 165 */     this.nativeToLwjglMap.put(Short.valueOf((short)99), Integer.valueOf(61));
/* 166 */     this.nativeToLwjglMap.put(Short.valueOf((short)118), Integer.valueOf(62));
/* 167 */     this.nativeToLwjglMap.put(Short.valueOf((short)96), Integer.valueOf(63));
/* 168 */     this.nativeToLwjglMap.put(Short.valueOf((short)97), Integer.valueOf(64));
/* 169 */     this.nativeToLwjglMap.put(Short.valueOf((short)98), Integer.valueOf(65));
/* 170 */     this.nativeToLwjglMap.put(Short.valueOf((short)100), Integer.valueOf(66));
/* 171 */     this.nativeToLwjglMap.put(Short.valueOf((short)101), Integer.valueOf(67));
/* 172 */     this.nativeToLwjglMap.put(Short.valueOf((short)109), Integer.valueOf(68));
/* 173 */     this.nativeToLwjglMap.put(Short.valueOf((short)103), Integer.valueOf(87));
/* 174 */     this.nativeToLwjglMap.put(Short.valueOf((short)111), Integer.valueOf(88));
/* 175 */     this.nativeToLwjglMap.put(Short.valueOf((short)105), Integer.valueOf(100));
/* 176 */     this.nativeToLwjglMap.put(Short.valueOf((short)107), Integer.valueOf(101));
/* 177 */     this.nativeToLwjglMap.put(Short.valueOf((short)113), Integer.valueOf(102));
/* 178 */     this.nativeToLwjglMap.put(Short.valueOf((short)106), Integer.valueOf(103));
/* 179 */     this.nativeToLwjglMap.put(Short.valueOf((short)64), Integer.valueOf(104));
/* 180 */     this.nativeToLwjglMap.put(Short.valueOf((short)79), Integer.valueOf(105));
/* 181 */     this.nativeToLwjglMap.put(Short.valueOf((short)80), Integer.valueOf(113));
/*     */ 
/*     */     
/* 184 */     this.nativeToLwjglMap.put(Short.valueOf((short)117), Integer.valueOf(211));
/* 185 */     this.nativeToLwjglMap.put(Short.valueOf((short)114), Integer.valueOf(210));
/* 186 */     this.nativeToLwjglMap.put(Short.valueOf((short)115), Integer.valueOf(199));
/*     */     
/* 188 */     this.nativeToLwjglMap.put(Short.valueOf((short)121), Integer.valueOf(209));
/* 189 */     this.nativeToLwjglMap.put(Short.valueOf((short)116), Integer.valueOf(201));
/*     */ 
/*     */     
/* 192 */     this.nativeToLwjglMap.put(Short.valueOf((short)123), Integer.valueOf(203));
/* 193 */     this.nativeToLwjglMap.put(Short.valueOf((short)124), Integer.valueOf(205));
/* 194 */     this.nativeToLwjglMap.put(Short.valueOf((short)125), Integer.valueOf(208));
/* 195 */     this.nativeToLwjglMap.put(Short.valueOf((short)126), Integer.valueOf(200));
/*     */     
/* 197 */     this.nativeToLwjglMap.put(Short.valueOf((short)10), Integer.valueOf(167));
/*     */     
/* 199 */     this.nativeToLwjglMap.put(Short.valueOf((short)110), Integer.valueOf(221));
/* 200 */     this.nativeToLwjglMap.put(Short.valueOf((short)297), Integer.valueOf(146));
/*     */   }
/*     */   
/*     */   public void register() {
/* 204 */     nRegisterKeyListener(this.window_handle);
/*     */   }
/*     */   
/*     */   public void unregister() {
/* 208 */     nUnregisterKeyListener(this.window_handle);
/*     */   }
/*     */   
/*     */   public void putKeyboardEvent(int key_code, byte state, int character, long nanos, boolean repeat) {
/* 212 */     this.event.clear();
/* 213 */     this.event.putInt(key_code).put(state).putInt(character).putLong(nanos).put(repeat ? 1 : 0);
/* 214 */     this.event.flip();
/* 215 */     putEvent(this.event);
/*     */   }
/*     */   
/*     */   public synchronized void poll(ByteBuffer key_down_buffer) {
/* 219 */     flushDeferredEvent();
/* 220 */     int old_position = key_down_buffer.position();
/* 221 */     key_down_buffer.put(this.key_states);
/* 222 */     key_down_buffer.position(old_position);
/*     */   }
/*     */   
/*     */   public synchronized void copyEvents(ByteBuffer dest) {
/* 226 */     flushDeferredEvent();
/* 227 */     super.copyEvents(dest);
/*     */   }
/*     */   
/*     */   private synchronized void handleKey(int key_code, byte state, int character, long nanos) {
/* 231 */     if (character == 65535)
/* 232 */       character = 0; 
/* 233 */     if (state == 1) {
/* 234 */       boolean repeat = false;
/* 235 */       if (this.has_deferred_event)
/* 236 */         if (nanos == this.deferred_nanos && this.deferred_key_code == key_code) {
/* 237 */           this.has_deferred_event = false;
/* 238 */           repeat = true;
/*     */         } else {
/* 240 */           flushDeferredEvent();
/*     */         }  
/* 242 */       putKeyEvent(key_code, state, character, nanos, repeat);
/*     */     } else {
/* 244 */       flushDeferredEvent();
/* 245 */       this.has_deferred_event = true;
/* 246 */       this.deferred_nanos = nanos;
/* 247 */       this.deferred_key_code = key_code;
/* 248 */       this.deferred_key_state = state;
/* 249 */       this.deferred_character = character;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void flushDeferredEvent() {
/* 254 */     if (this.has_deferred_event) {
/* 255 */       putKeyEvent(this.deferred_key_code, this.deferred_key_state, this.deferred_character, this.deferred_nanos, false);
/* 256 */       this.has_deferred_event = false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void putKeyEvent(int key_code, byte state, int character, long nanos, boolean repeat) {
/* 262 */     int mapped_code = getMappedKeyCode((short)key_code);
/* 263 */     if (mapped_code < 0) {
/* 264 */       System.out.println("Unrecognized keycode: " + key_code);
/*     */       
/*     */       return;
/*     */     } 
/* 268 */     if (this.key_states[mapped_code] == state)
/* 269 */       repeat = true; 
/* 270 */     this.key_states[mapped_code] = state;
/* 271 */     int key_int_char = character & 0xFFFF;
/* 272 */     putKeyboardEvent(mapped_code, state, key_int_char, nanos, repeat);
/*     */   }
/*     */   
/*     */   private int getMappedKeyCode(short key_code) {
/* 276 */     if (this.nativeToLwjglMap.containsKey(Short.valueOf(key_code))) {
/* 277 */       return ((Integer)this.nativeToLwjglMap.get(Short.valueOf(key_code))).intValue();
/*     */     }
/* 279 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void keyPressed(int key_code, String chars, long nanos) {
/* 284 */     int character = (chars == null || chars.length() == 0) ? 0 : chars.charAt(0);
/* 285 */     handleKey(key_code, (byte)1, character, nanos);
/*     */   }
/*     */ 
/*     */   
/*     */   public void keyReleased(int key_code, String chars, long nanos) {
/* 290 */     int character = (chars == null || chars.length() == 0) ? 0 : chars.charAt(0);
/* 291 */     handleKey(key_code, (byte)0, character, nanos);
/*     */   }
/*     */   
/*     */   public void keyTyped(KeyEvent e) {}
/*     */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\MacOSXNativeKeyboard.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
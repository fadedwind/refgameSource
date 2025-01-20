/*     */ package org.lwjgl.input;
/*     */ 
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferChecks;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.LWJGLException;
/*     */ import org.lwjgl.LWJGLUtil;
/*     */ import org.lwjgl.Sys;
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
/*     */ public class Cursor
/*     */ {
/*     */   public static final int CURSOR_ONE_BIT_TRANSPARENCY = 1;
/*     */   public static final int CURSOR_8_BIT_ALPHA = 2;
/*     */   public static final int CURSOR_ANIMATION = 4;
/*     */   private final CursorElement[] cursors;
/*     */   private int index;
/*     */   private boolean destroyed;
/*     */   
/*     */   public Cursor(int width, int height, int xHotspot, int yHotspot, int numImages, IntBuffer images, IntBuffer delays) throws LWJGLException {
/*  86 */     synchronized (OpenGLPackageAccess.global_lock) {
/*  87 */       if ((getCapabilities() & 0x1) == 0)
/*  88 */         throw new LWJGLException("Native cursors not supported"); 
/*  89 */       BufferChecks.checkBufferSize(images, width * height * numImages);
/*  90 */       if (delays != null)
/*  91 */         BufferChecks.checkBufferSize(delays, numImages); 
/*  92 */       if (!Mouse.isCreated())
/*  93 */         throw new IllegalStateException("Mouse must be created before creating cursor objects"); 
/*  94 */       if (width * height * numImages > images.remaining())
/*  95 */         throw new IllegalArgumentException("width*height*numImages > images.remaining()"); 
/*  96 */       if (xHotspot >= width || xHotspot < 0)
/*  97 */         throw new IllegalArgumentException("xHotspot > width || xHotspot < 0"); 
/*  98 */       if (yHotspot >= height || yHotspot < 0) {
/*  99 */         throw new IllegalArgumentException("yHotspot > height || yHotspot < 0");
/*     */       }
/* 101 */       Sys.initialize();
/*     */ 
/*     */       
/* 104 */       yHotspot = height - 1 - yHotspot;
/*     */ 
/*     */       
/* 107 */       this.cursors = createCursors(width, height, xHotspot, yHotspot, numImages, images, delays);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getMinCursorSize() {
/* 119 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 120 */       if (!Mouse.isCreated())
/* 121 */         throw new IllegalStateException("Mouse must be created."); 
/* 122 */       return Mouse.getImplementation().getMinCursorSize();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getMaxCursorSize() {
/* 134 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 135 */       if (!Mouse.isCreated())
/* 136 */         throw new IllegalStateException("Mouse must be created."); 
/* 137 */       return Mouse.getImplementation().getMaxCursorSize();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getCapabilities() {
/* 150 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 151 */       if (Mouse.getImplementation() != null) {
/* 152 */         return Mouse.getImplementation().getNativeCursorCapabilities();
/*     */       }
/* 154 */       return OpenGLPackageAccess.createImplementation().getNativeCursorCapabilities();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static CursorElement[] createCursors(int width, int height, int xHotspot, int yHotspot, int numImages, IntBuffer images, IntBuffer delays) throws LWJGLException {
/*     */     CursorElement[] cursors;
/*     */     int i;
/*     */     Object handle;
/*     */     CursorElement cursor_element;
/* 163 */     IntBuffer images_copy = BufferUtils.createIntBuffer(images.remaining());
/* 164 */     flipImages(width, height, numImages, images, images_copy);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 174 */     switch (LWJGLUtil.getPlatform()) {
/*     */ 
/*     */       
/*     */       case 2:
/* 178 */         convertARGBtoABGR(images_copy);
/*     */ 
/*     */         
/* 181 */         cursors = new CursorElement[numImages];
/* 182 */         for (i = 0; i < numImages; i++) {
/* 183 */           Object object = Mouse.getImplementation().createCursor(width, height, xHotspot, yHotspot, 1, images_copy, null);
/* 184 */           long delay = (delays != null) ? delays.get(i) : 0L;
/* 185 */           long timeout = System.currentTimeMillis();
/* 186 */           cursors[i] = new CursorElement(object, delay, timeout);
/*     */ 
/*     */           
/* 189 */           images_copy.position(width * height * (i + 1));
/*     */         } 
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
/* 225 */         return cursors;case 3: cursors = new CursorElement[numImages]; for (i = 0; i < numImages; i++) { int size = width * height; for (int j = 0; j < size; j++) { int index = j + i * size; int alpha = images_copy.get(index) >> 24 & 0xFF; if (alpha != 255) images_copy.put(index, 0);  }  Object object = Mouse.getImplementation().createCursor(width, height, xHotspot, yHotspot, 1, images_copy, null); long delay = (delays != null) ? delays.get(i) : 0L; long timeout = System.currentTimeMillis(); cursors[i] = new CursorElement(object, delay, timeout); images_copy.position(width * height * (i + 1)); }  return cursors;case 1: handle = Mouse.getImplementation().createCursor(width, height, xHotspot, yHotspot, numImages, images_copy, delays); cursor_element = new CursorElement(handle, -1L, -1L); cursors = new CursorElement[] { cursor_element }; return cursors;
/*     */     } 
/*     */     throw new RuntimeException("Unknown OS");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void convertARGBtoABGR(IntBuffer imageBuffer) {
/* 234 */     for (int i = 0; i < imageBuffer.limit(); i++) {
/* 235 */       int argbColor = imageBuffer.get(i);
/*     */       
/* 237 */       byte alpha = (byte)(argbColor >>> 24);
/* 238 */       byte blue = (byte)(argbColor >>> 16);
/* 239 */       byte green = (byte)(argbColor >>> 8);
/* 240 */       byte red = (byte)argbColor;
/*     */       
/* 242 */       int abgrColor = ((alpha & 0xFF) << 24) + ((red & 0xFF) << 16) + ((green & 0xFF) << 8) + (blue & 0xFF);
/*     */       
/* 244 */       imageBuffer.put(i, abgrColor);
/*     */     } 
/*     */   }
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
/*     */   private static void flipImages(int width, int height, int numImages, IntBuffer images, IntBuffer images_copy) {
/* 258 */     for (int i = 0; i < numImages; i++) {
/* 259 */       int start_index = i * width * height;
/* 260 */       flipImage(width, height, start_index, images, images_copy);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void flipImage(int width, int height, int start_index, IntBuffer images, IntBuffer images_copy) {
/* 272 */     for (int y = 0; y < height >> 1; y++) {
/* 273 */       int index_y_1 = y * width + start_index;
/* 274 */       int index_y_2 = (height - y - 1) * width + start_index;
/* 275 */       for (int x = 0; x < width; x++) {
/* 276 */         int index1 = index_y_1 + x;
/* 277 */         int index2 = index_y_2 + x;
/* 278 */         int temp_pixel = images.get(index1 + images.position());
/* 279 */         images_copy.put(index1, images.get(index2 + images.position()));
/* 280 */         images_copy.put(index2, temp_pixel);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   Object getHandle() {
/* 289 */     checkValid();
/* 290 */     return (this.cursors[this.index]).cursorHandle;
/*     */   }
/*     */   
/*     */   private void checkValid() {
/* 294 */     if (this.destroyed) {
/* 295 */       throw new IllegalStateException("The cursor is destroyed");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void destroy() {
/* 304 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 305 */       if (this.destroyed)
/*     */         return; 
/* 307 */       if (Mouse.getNativeCursor() == this) {
/*     */         try {
/* 309 */           Mouse.setNativeCursor(null);
/* 310 */         } catch (LWJGLException e) {}
/*     */       }
/*     */ 
/*     */       
/* 314 */       for (CursorElement cursor : this.cursors) {
/* 315 */         Mouse.getImplementation().destroyCursor(cursor.cursorHandle);
/*     */       }
/* 317 */       this.destroyed = true;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setTimeout() {
/* 325 */     checkValid();
/* 326 */     (this.cursors[this.index]).timeout = System.currentTimeMillis() + (this.cursors[this.index]).delay;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean hasTimedOut() {
/* 334 */     checkValid();
/* 335 */     return (this.cursors.length > 1 && (this.cursors[this.index]).timeout < System.currentTimeMillis());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void nextCursor() {
/* 342 */     checkValid();
/* 343 */     this.index = ++this.index % this.cursors.length;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static class CursorElement
/*     */   {
/*     */     final Object cursorHandle;
/*     */ 
/*     */     
/*     */     final long delay;
/*     */ 
/*     */     
/*     */     long timeout;
/*     */ 
/*     */     
/*     */     CursorElement(Object cursorHandle, long delay, long timeout) {
/* 360 */       this.cursorHandle = cursorHandle;
/* 361 */       this.delay = delay;
/* 362 */       this.timeout = timeout;
/*     */     }
/*     */   }
/*     */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\input\Cursor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
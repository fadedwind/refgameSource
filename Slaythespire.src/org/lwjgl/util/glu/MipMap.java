/*     */ package org.lwjgl.util.glu;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ public class MipMap
/*     */   extends Util
/*     */ {
/*     */   public static int gluBuild2DMipmaps(int target, int components, int width, int height, int format, int type, ByteBuffer data) {
/*     */     ByteBuffer image;
/*  65 */     if (width < 1 || height < 1) return 100901;
/*     */     
/*  67 */     int bpp = bytesPerPixel(format, type);
/*  68 */     if (bpp == 0) {
/*  69 */       return 100900;
/*     */     }
/*  71 */     int maxSize = glGetIntegerv(3379);
/*     */     
/*  73 */     int w = nearestPower(width);
/*  74 */     if (w > maxSize) {
/*  75 */       w = maxSize;
/*     */     }
/*  77 */     int h = nearestPower(height);
/*  78 */     if (h > maxSize) {
/*  79 */       h = maxSize;
/*     */     }
/*     */     
/*  82 */     PixelStoreState pss = new PixelStoreState();
/*     */ 
/*     */     
/*  85 */     GL11.glPixelStorei(3330, 0);
/*  86 */     GL11.glPixelStorei(3333, 1);
/*  87 */     GL11.glPixelStorei(3331, 0);
/*  88 */     GL11.glPixelStorei(3332, 0);
/*     */ 
/*     */     
/*  91 */     int retVal = 0;
/*  92 */     boolean done = false;
/*     */     
/*  94 */     if (w != width || h != height) {
/*     */       
/*  96 */       image = BufferUtils.createByteBuffer((w + 4) * h * bpp);
/*  97 */       int error = gluScaleImage(format, width, height, type, data, w, h, type, image);
/*  98 */       if (error != 0) {
/*  99 */         retVal = error;
/* 100 */         done = true;
/*     */       } 
/*     */ 
/*     */       
/* 104 */       GL11.glPixelStorei(3314, 0);
/* 105 */       GL11.glPixelStorei(3317, 1);
/* 106 */       GL11.glPixelStorei(3315, 0);
/* 107 */       GL11.glPixelStorei(3316, 0);
/*     */     } else {
/* 109 */       image = data;
/*     */     } 
/*     */     
/* 112 */     ByteBuffer bufferA = null;
/* 113 */     ByteBuffer bufferB = null;
/*     */     
/* 115 */     int level = 0;
/* 116 */     while (!done) {
/* 117 */       ByteBuffer newImage; if (image != data) {
/*     */         
/* 119 */         GL11.glPixelStorei(3314, 0);
/* 120 */         GL11.glPixelStorei(3317, 1);
/* 121 */         GL11.glPixelStorei(3315, 0);
/* 122 */         GL11.glPixelStorei(3316, 0);
/*     */       } 
/*     */       
/* 125 */       GL11.glTexImage2D(target, level, components, w, h, 0, format, type, image);
/*     */       
/* 127 */       if (w == 1 && h == 1) {
/*     */         break;
/*     */       }
/* 130 */       int newW = (w < 2) ? 1 : (w >> 1);
/* 131 */       int newH = (h < 2) ? 1 : (h >> 1);
/*     */ 
/*     */ 
/*     */       
/* 135 */       if (bufferA == null) {
/* 136 */         newImage = bufferA = BufferUtils.createByteBuffer((newW + 4) * newH * bpp);
/* 137 */       } else if (bufferB == null) {
/* 138 */         newImage = bufferB = BufferUtils.createByteBuffer((newW + 4) * newH * bpp);
/*     */       } else {
/* 140 */         newImage = bufferB;
/*     */       } 
/* 142 */       int error = gluScaleImage(format, w, h, type, image, newW, newH, type, newImage);
/* 143 */       if (error != 0) {
/* 144 */         retVal = error;
/* 145 */         done = true;
/*     */       } 
/*     */       
/* 148 */       image = newImage;
/* 149 */       if (bufferB != null) {
/* 150 */         bufferB = bufferA;
/*     */       }
/* 152 */       w = newW;
/* 153 */       h = newH;
/* 154 */       level++;
/*     */     } 
/*     */ 
/*     */     
/* 158 */     pss.save();
/*     */     
/* 160 */     return retVal;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int gluScaleImage(int format, int widthIn, int heightIn, int typein, ByteBuffer dataIn, int widthOut, int heightOut, int typeOut, ByteBuffer dataOut) {
/* 180 */     int i, k, sizein, sizeout, rowstride, rowlen, components = compPerPix(format);
/* 181 */     if (components == -1) {
/* 182 */       return 100900;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 191 */     float[] tempIn = new float[widthIn * heightIn * components];
/* 192 */     float[] tempOut = new float[widthOut * heightOut * components];
/*     */ 
/*     */     
/* 195 */     switch (typein) {
/*     */       case 5121:
/* 197 */         sizein = 1;
/*     */         break;
/*     */       case 5126:
/* 200 */         sizein = 4;
/*     */         break;
/*     */       default:
/* 203 */         return 1280;
/*     */     } 
/*     */ 
/*     */     
/* 207 */     switch (typeOut) {
/*     */       case 5121:
/* 209 */         sizeout = 1;
/*     */         break;
/*     */       case 5126:
/* 212 */         sizeout = 4;
/*     */         break;
/*     */       default:
/* 215 */         return 1280;
/*     */     } 
/*     */ 
/*     */     
/* 219 */     PixelStoreState pss = new PixelStoreState();
/*     */ 
/*     */     
/* 222 */     if (pss.unpackRowLength > 0) {
/* 223 */       rowlen = pss.unpackRowLength;
/*     */     } else {
/* 225 */       rowlen = widthIn;
/*     */     } 
/* 227 */     if (sizein >= pss.unpackAlignment) {
/* 228 */       rowstride = components * rowlen;
/*     */     } else {
/* 230 */       rowstride = pss.unpackAlignment / sizein * ceil(components * rowlen * sizein, pss.unpackAlignment);
/*     */     } 
/* 232 */     switch (typein) {
/*     */       case 5121:
/* 234 */         k = 0;
/* 235 */         dataIn.rewind();
/* 236 */         for (i = 0; i < heightIn; i++) {
/* 237 */           int ubptr = i * rowstride + pss.unpackSkipRows * rowstride + pss.unpackSkipPixels * components;
/* 238 */           for (int j = 0; j < widthIn * components; j++) {
/* 239 */             tempIn[k++] = (dataIn.get(ubptr++) & 0xFF);
/*     */           }
/*     */         } 
/*     */         break;
/*     */       case 5126:
/* 244 */         k = 0;
/* 245 */         dataIn.rewind();
/* 246 */         for (i = 0; i < heightIn; i++) {
/*     */           
/* 248 */           int fptr = 4 * (i * rowstride + pss.unpackSkipRows * rowstride + pss.unpackSkipPixels * components);
/* 249 */           for (byte b = 0; b < widthIn * components; b++) {
/*     */             
/* 251 */             tempIn[k++] = dataIn.getFloat(fptr);
/* 252 */             fptr += 4;
/*     */           } 
/*     */         } 
/*     */         break;
/*     */       default:
/* 257 */         return 100900;
/*     */     } 
/*     */ 
/*     */     
/* 261 */     float sx = widthIn / widthOut;
/* 262 */     float sy = heightIn / heightOut;
/*     */     
/* 264 */     float[] c = new float[components];
/*     */ 
/*     */     
/* 267 */     for (int iy = 0; iy < heightOut; iy++) {
/* 268 */       for (int ix = 0; ix < widthOut; ix++) {
/* 269 */         int x0 = (int)(ix * sx);
/* 270 */         int x1 = (int)((ix + 1) * sx);
/* 271 */         int y0 = (int)(iy * sy);
/* 272 */         int y1 = (int)((iy + 1) * sy);
/*     */         
/* 274 */         int readPix = 0;
/*     */ 
/*     */         
/* 277 */         for (int ic = 0; ic < components; ic++) {
/* 278 */           c[ic] = 0.0F;
/*     */         }
/*     */ 
/*     */         
/* 282 */         for (int ix0 = x0; ix0 < x1; ix0++) {
/* 283 */           for (int iy0 = y0; iy0 < y1; iy0++) {
/*     */             
/* 285 */             int src = (iy0 * widthIn + ix0) * components;
/*     */             
/* 287 */             for (int j = 0; j < components; j++) {
/* 288 */               c[j] = c[j] + tempIn[src + j];
/*     */             }
/*     */             
/* 291 */             readPix++;
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/* 296 */         int dst = (iy * widthOut + ix) * components;
/*     */         
/* 298 */         if (readPix == 0) {
/*     */           
/* 300 */           int src = (y0 * widthIn + x0) * components;
/* 301 */           for (int j = 0; j < components; j++) {
/* 302 */             tempOut[dst++] = tempIn[src + j];
/*     */           }
/*     */         } else {
/*     */           
/* 306 */           for (k = 0; k < components; k++) {
/* 307 */             tempOut[dst++] = c[k] / readPix;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 315 */     if (pss.packRowLength > 0) {
/* 316 */       rowlen = pss.packRowLength;
/*     */     } else {
/* 318 */       rowlen = widthOut;
/*     */     } 
/* 320 */     if (sizeout >= pss.packAlignment) {
/* 321 */       rowstride = components * rowlen;
/*     */     } else {
/* 323 */       rowstride = pss.packAlignment / sizeout * ceil(components * rowlen * sizeout, pss.packAlignment);
/*     */     } 
/* 325 */     switch (typeOut) {
/*     */       case 5121:
/* 327 */         k = 0;
/* 328 */         for (i = 0; i < heightOut; i++) {
/* 329 */           int ubptr = i * rowstride + pss.packSkipRows * rowstride + pss.packSkipPixels * components;
/*     */           
/* 331 */           for (byte b = 0; b < widthOut * components; b++) {
/* 332 */             dataOut.put(ubptr++, (byte)(int)tempOut[k++]);
/*     */           }
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
/* 351 */         return 0;case 5126: k = 0; for (i = 0; i < heightOut; i++) { int fptr = 4 * (i * rowstride + pss.unpackSkipRows * rowstride + pss.unpackSkipPixels * components); for (byte b = 0; b < widthOut * components; b++) { dataOut.putFloat(fptr, tempOut[k++]); fptr += 4; }  }  return 0;
/*     */     } 
/*     */     return 100900;
/*     */   }
/*     */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjg\\util\glu\MipMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
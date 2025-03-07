/*     */ package org.apache.commons.net.io;
/*     */ 
/*     */ import java.io.FilterOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
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
/*     */ public final class FromNetASCIIOutputStream
/*     */   extends FilterOutputStream
/*     */ {
/*     */   private boolean __lastWasCR;
/*     */   
/*     */   public FromNetASCIIOutputStream(OutputStream output) {
/*  51 */     super(output);
/*  52 */     this.__lastWasCR = false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void __write(int ch) throws IOException {
/*  58 */     switch (ch) {
/*     */       
/*     */       case 13:
/*  61 */         this.__lastWasCR = true;
/*     */         return;
/*     */       
/*     */       case 10:
/*  65 */         if (this.__lastWasCR) {
/*     */           
/*  67 */           this.out.write(FromNetASCIIInputStream._lineSeparatorBytes);
/*  68 */           this.__lastWasCR = false;
/*     */         } else {
/*     */           
/*  71 */           this.__lastWasCR = false;
/*  72 */           this.out.write(10);
/*     */         }  return;
/*     */     } 
/*  75 */     if (this.__lastWasCR) {
/*     */       
/*  77 */       this.out.write(13);
/*  78 */       this.__lastWasCR = false;
/*     */     } 
/*  80 */     this.out.write(ch);
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
/*     */ 
/*     */   
/*     */   public synchronized void write(int ch) throws IOException {
/* 102 */     if (FromNetASCIIInputStream._noConversionRequired) {
/*     */       
/* 104 */       this.out.write(ch);
/*     */       
/*     */       return;
/*     */     } 
/* 108 */     __write(ch);
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
/*     */   public synchronized void write(byte[] buffer) throws IOException {
/* 123 */     write(buffer, 0, buffer.length);
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
/*     */   public synchronized void write(byte[] buffer, int offset, int length) throws IOException {
/* 141 */     if (FromNetASCIIInputStream._noConversionRequired) {
/*     */ 
/*     */ 
/*     */       
/* 145 */       this.out.write(buffer, offset, length);
/*     */       
/*     */       return;
/*     */     } 
/* 149 */     while (length-- > 0) {
/* 150 */       __write(buffer[offset++]);
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
/*     */   public synchronized void close() throws IOException {
/* 164 */     if (FromNetASCIIInputStream._noConversionRequired) {
/*     */       
/* 166 */       super.close();
/*     */       
/*     */       return;
/*     */     } 
/* 170 */     if (this.__lastWasCR) {
/* 171 */       this.out.write(13);
/*     */     }
/* 173 */     super.close();
/*     */   }
/*     */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\commons\net\io\FromNetASCIIOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
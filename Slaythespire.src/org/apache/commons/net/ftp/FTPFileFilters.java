/*    */ package org.apache.commons.net.ftp;
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
/*    */ public class FTPFileFilters
/*    */ {
/* 30 */   public static final FTPFileFilter ALL = new FTPFileFilter()
/*    */     {
/*    */       public boolean accept(FTPFile file) {
/* 33 */         return true;
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 40 */   public static final FTPFileFilter NON_NULL = new FTPFileFilter()
/*    */     {
/*    */       public boolean accept(FTPFile file) {
/* 43 */         return (file != null);
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 50 */   public static final FTPFileFilter DIRECTORIES = new FTPFileFilter()
/*    */     {
/*    */       public boolean accept(FTPFile file) {
/* 53 */         return (file != null && file.isDirectory());
/*    */       }
/*    */     };
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\commons\net\ftp\FTPFileFilters.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
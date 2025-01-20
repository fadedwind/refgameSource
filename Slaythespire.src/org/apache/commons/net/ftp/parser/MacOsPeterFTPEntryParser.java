/*     */ package org.apache.commons.net.ftp.parser;
/*     */ 
/*     */ import java.text.ParseException;
/*     */ import org.apache.commons.net.ftp.FTPClientConfig;
/*     */ import org.apache.commons.net.ftp.FTPFile;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MacOsPeterFTPEntryParser
/*     */   extends ConfigurableFTPFileEntryParserImpl
/*     */ {
/*     */   static final String DEFAULT_DATE_FORMAT = "MMM d yyyy";
/*     */   static final String DEFAULT_RECENT_DATE_FORMAT = "MMM d HH:mm";
/*     */   private static final String REGEX = "([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s+((folder\\s+)|((\\d+)\\s+(\\d+)\\s+))(\\d+)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3}))\\s+(\\d+(?::\\d+)?)\\s+(\\S*)(\\s*.*)";
/*     */   
/*     */   public MacOsPeterFTPEntryParser() {
/*  97 */     this((FTPClientConfig)null);
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
/*     */   public MacOsPeterFTPEntryParser(FTPClientConfig config) {
/* 114 */     super("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s+((folder\\s+)|((\\d+)\\s+(\\d+)\\s+))(\\d+)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3}))\\s+(\\d+(?::\\d+)?)\\s+(\\S*)(\\s*.*)");
/* 115 */     configure(config);
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
/*     */   public FTPFile parseFTPEntry(String entry) {
/* 130 */     FTPFile file = new FTPFile();
/* 131 */     file.setRawListing(entry);
/*     */     
/* 133 */     boolean isDevice = false;
/*     */     
/* 135 */     if (matches(entry)) {
/*     */       int type;
/* 137 */       String typeStr = group(1);
/* 138 */       String hardLinkCount = "0";
/* 139 */       String usr = null;
/* 140 */       String grp = null;
/* 141 */       String filesize = group(20);
/* 142 */       String datestr = group(21) + " " + group(22);
/* 143 */       String name = group(23);
/* 144 */       String endtoken = group(24);
/*     */ 
/*     */       
/*     */       try {
/* 148 */         file.setTimestamp(parseTimestamp(datestr));
/*     */       }
/* 150 */       catch (ParseException e) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 159 */       switch (typeStr.charAt(0)) {
/*     */         
/*     */         case 'd':
/* 162 */           type = 1;
/*     */           break;
/*     */         case 'e':
/* 165 */           type = 2;
/*     */           break;
/*     */         case 'l':
/* 168 */           type = 2;
/*     */           break;
/*     */         case 'b':
/*     */         case 'c':
/* 172 */           isDevice = true;
/* 173 */           type = 0;
/*     */           break;
/*     */         case '-':
/*     */         case 'f':
/* 177 */           type = 0;
/*     */           break;
/*     */         default:
/* 180 */           type = 3;
/*     */           break;
/*     */       } 
/* 183 */       file.setType(type);
/*     */       
/* 185 */       int g = 4;
/* 186 */       for (int access = 0; access < 3; access++, g += 4) {
/*     */ 
/*     */         
/* 189 */         file.setPermission(access, 0, !group(g).equals("-"));
/*     */         
/* 191 */         file.setPermission(access, 1, !group(g + 1).equals("-"));
/*     */ 
/*     */         
/* 194 */         String execPerm = group(g + 2);
/* 195 */         if (!execPerm.equals("-") && !Character.isUpperCase(execPerm.charAt(0))) {
/*     */           
/* 197 */           file.setPermission(access, 2, true);
/*     */         }
/*     */         else {
/*     */           
/* 201 */           file.setPermission(access, 2, false);
/*     */         } 
/*     */       } 
/*     */       
/* 205 */       if (!isDevice) {
/*     */         
/*     */         try {
/*     */           
/* 209 */           file.setHardLinkCount(Integer.parseInt(hardLinkCount));
/*     */         }
/* 211 */         catch (NumberFormatException e) {}
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 217 */       file.setUser(usr);
/* 218 */       file.setGroup(grp);
/*     */ 
/*     */       
/*     */       try {
/* 222 */         file.setSize(Long.parseLong(filesize));
/*     */       }
/* 224 */       catch (NumberFormatException e) {}
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 229 */       if (null == endtoken) {
/*     */         
/* 231 */         file.setName(name);
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/* 237 */         name = name + endtoken;
/* 238 */         if (type == 2) {
/*     */ 
/*     */           
/* 241 */           int end = name.indexOf(" -> ");
/*     */           
/* 243 */           if (end == -1)
/*     */           {
/* 245 */             file.setName(name);
/*     */           }
/*     */           else
/*     */           {
/* 249 */             file.setName(name.substring(0, end));
/* 250 */             file.setLink(name.substring(end + 4));
/*     */           }
/*     */         
/*     */         }
/*     */         else {
/*     */           
/* 256 */           file.setName(name);
/*     */         } 
/*     */       } 
/* 259 */       return file;
/*     */     } 
/* 261 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected FTPClientConfig getDefaultConfiguration() {
/* 272 */     return new FTPClientConfig("UNIX", "MMM d yyyy", "MMM d HH:mm", null, null, null);
/*     */   }
/*     */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\commons\net\ftp\parser\MacOsPeterFTPEntryParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
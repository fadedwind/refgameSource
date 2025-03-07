/*     */ package org.apache.logging.log4j.util;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InvalidObjectException;
/*     */ import java.io.ObjectInputStream;
/*     */ import java.io.ObjectStreamClass;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FilteredObjectInputStream
/*     */   extends ObjectInputStream
/*     */ {
/*  38 */   private static final Set<String> REQUIRED_JAVA_CLASSES = new HashSet<>(Arrays.asList(new String[] { "java.math.BigDecimal", "java.math.BigInteger", "java.rmi.MarshalledObject", "[B" }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  48 */   private static final Set<String> REQUIRED_JAVA_PACKAGES = new HashSet<>(Arrays.asList(new String[] { "java.lang.", "java.time.", "java.util.", "org.apache.logging.log4j.", "[Lorg.apache.logging.log4j." }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Collection<String> allowedExtraClasses;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FilteredObjectInputStream() throws IOException, SecurityException {
/*  61 */     this.allowedExtraClasses = Collections.emptySet();
/*     */   }
/*     */   
/*     */   public FilteredObjectInputStream(InputStream inputStream) throws IOException {
/*  65 */     super(inputStream);
/*  66 */     this.allowedExtraClasses = Collections.emptySet();
/*     */   }
/*     */ 
/*     */   
/*     */   public FilteredObjectInputStream(Collection<String> allowedExtraClasses) throws IOException, SecurityException {
/*  71 */     this.allowedExtraClasses = allowedExtraClasses;
/*     */   }
/*     */ 
/*     */   
/*     */   public FilteredObjectInputStream(InputStream inputStream, Collection<String> allowedExtraClasses) throws IOException {
/*  76 */     super(inputStream);
/*  77 */     this.allowedExtraClasses = allowedExtraClasses;
/*     */   }
/*     */   
/*     */   public Collection<String> getAllowedClasses() {
/*  81 */     return this.allowedExtraClasses;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
/*  86 */     String name = desc.getName();
/*  87 */     if (!isAllowedByDefault(name) && !this.allowedExtraClasses.contains(name)) {
/*  88 */       throw new InvalidObjectException("Class is not allowed for deserialization: " + name);
/*     */     }
/*  90 */     return super.resolveClass(desc);
/*     */   }
/*     */   
/*     */   private static boolean isAllowedByDefault(String name) {
/*  94 */     return (isRequiredPackage(name) || REQUIRED_JAVA_CLASSES.contains(name));
/*     */   }
/*     */   
/*     */   private static boolean isRequiredPackage(String name) {
/*  98 */     for (String packageName : REQUIRED_JAVA_PACKAGES) {
/*  99 */       if (name.startsWith(packageName)) {
/* 100 */         return true;
/*     */       }
/*     */     } 
/* 103 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4\\util\FilteredObjectInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
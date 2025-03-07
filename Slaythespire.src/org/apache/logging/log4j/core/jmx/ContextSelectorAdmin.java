/*    */ package org.apache.logging.log4j.core.jmx;
/*    */ 
/*    */ import java.util.Objects;
/*    */ import javax.management.ObjectName;
/*    */ import org.apache.logging.log4j.core.selector.ContextSelector;
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
/*    */ public class ContextSelectorAdmin
/*    */   implements ContextSelectorAdminMBean
/*    */ {
/*    */   private final ObjectName objectName;
/*    */   private final ContextSelector selector;
/*    */   
/*    */   public ContextSelectorAdmin(String contextName, ContextSelector selector) {
/* 46 */     this.selector = Objects.<ContextSelector>requireNonNull(selector, "ContextSelector");
/*    */     try {
/* 48 */       String mbeanName = String.format("org.apache.logging.log4j2:type=%s,component=ContextSelector", new Object[] { Server.escape(contextName) });
/* 49 */       this.objectName = new ObjectName(mbeanName);
/* 50 */     } catch (Exception e) {
/* 51 */       throw new IllegalStateException(e);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ObjectName getObjectName() {
/* 62 */     return this.objectName;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getImplementationClassName() {
/* 67 */     return this.selector.getClass().getName();
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\core\jmx\ContextSelectorAdmin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
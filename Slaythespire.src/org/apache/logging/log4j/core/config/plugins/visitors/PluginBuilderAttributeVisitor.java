/*    */ package org.apache.logging.log4j.core.config.plugins.visitors;
/*    */ 
/*    */ import java.util.Map;
/*    */ import org.apache.logging.log4j.core.LogEvent;
/*    */ import org.apache.logging.log4j.core.config.Configuration;
/*    */ import org.apache.logging.log4j.core.config.Node;
/*    */ import org.apache.logging.log4j.core.config.plugins.PluginBuilderAttribute;
/*    */ import org.apache.logging.log4j.util.StringBuilders;
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
/*    */ public class PluginBuilderAttributeVisitor
/*    */   extends AbstractPluginVisitor<PluginBuilderAttribute>
/*    */ {
/*    */   public PluginBuilderAttributeVisitor() {
/* 38 */     super(PluginBuilderAttribute.class);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Object visit(Configuration configuration, Node node, LogEvent event, StringBuilder log) {
/* 44 */     String overridden = this.annotation.value();
/* 45 */     String name = overridden.isEmpty() ? this.member.getName() : overridden;
/* 46 */     Map<String, String> attributes = node.getAttributes();
/* 47 */     String rawValue = removeAttributeValue(attributes, name, this.aliases);
/* 48 */     String replacedValue = this.substitutor.replace(event, rawValue);
/* 49 */     Object value = convert(replacedValue, null);
/* 50 */     Object debugValue = this.annotation.sensitive() ? "*****" : value;
/* 51 */     StringBuilders.appendKeyDqValue(log, name, debugValue);
/* 52 */     return value;
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\core\config\plugins\visitors\PluginBuilderAttributeVisitor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
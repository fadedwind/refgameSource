/*    */ package org.apache.logging.log4j.core.impl;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.apache.logging.log4j.Level;
/*    */ import org.apache.logging.log4j.Marker;
/*    */ import org.apache.logging.log4j.core.LogEvent;
/*    */ import org.apache.logging.log4j.core.config.Property;
/*    */ import org.apache.logging.log4j.message.Message;
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
/*    */ public interface LogEventFactory
/*    */   extends LocationAwareLogEventFactory
/*    */ {
/*    */   LogEvent createEvent(String paramString1, Marker paramMarker, String paramString2, Level paramLevel, Message paramMessage, List<Property> paramList, Throwable paramThrowable);
/*    */   
/*    */   default LogEvent createEvent(String loggerName, Marker marker, String fqcn, StackTraceElement location, Level level, Message data, List<Property> properties, Throwable t) {
/* 46 */     return createEvent(loggerName, marker, fqcn, level, data, properties, t);
/*    */   }
/*    */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\core\impl\LogEventFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
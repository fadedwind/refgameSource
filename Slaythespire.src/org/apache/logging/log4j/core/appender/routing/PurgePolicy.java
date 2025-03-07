package org.apache.logging.log4j.core.appender.routing;

import org.apache.logging.log4j.core.LogEvent;

public interface PurgePolicy {
  void purge();
  
  void update(String paramString, LogEvent paramLogEvent);
  
  void initialize(RoutingAppender paramRoutingAppender);
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\core\appender\routing\PurgePolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
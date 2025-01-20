package org.apache.logging.log4j.core.appender.rewrite;

import org.apache.logging.log4j.core.LogEvent;

public interface RewritePolicy {
  LogEvent rewrite(LogEvent paramLogEvent);
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\core\appender\rewrite\RewritePolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
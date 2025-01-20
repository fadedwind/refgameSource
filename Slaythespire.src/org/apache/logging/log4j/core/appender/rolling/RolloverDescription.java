package org.apache.logging.log4j.core.appender.rolling;

import org.apache.logging.log4j.core.appender.rolling.action.Action;

public interface RolloverDescription {
  String getActiveFileName();
  
  boolean getAppend();
  
  Action getSynchronous();
  
  Action getAsynchronous();
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\core\appender\rolling\RolloverDescription.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package org.apache.logging.log4j.core.appender.rolling;

public interface RolloverStrategy {
  RolloverDescription rollover(RollingFileManager paramRollingFileManager) throws SecurityException;
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\core\appender\rolling\RolloverStrategy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
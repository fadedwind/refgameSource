package org.apache.logging.log4j.core.appender.rolling;

public interface DirectFileRolloverStrategy {
  String getCurrentFileName(RollingFileManager paramRollingFileManager);
  
  void clearCurrentFileName();
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\core\appender\rolling\DirectFileRolloverStrategy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package org.apache.logging.log4j.core.config.arbiters;

public interface Arbiter {
  public static final String ELEMENT_TYPE = "Arbiter";
  
  boolean isCondition();
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\core\config\arbiters\Arbiter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
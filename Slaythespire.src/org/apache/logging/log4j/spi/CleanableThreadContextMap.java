package org.apache.logging.log4j.spi;

public interface CleanableThreadContextMap extends ThreadContextMap2 {
  void removeAll(Iterable<String> paramIterable);
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\spi\CleanableThreadContextMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
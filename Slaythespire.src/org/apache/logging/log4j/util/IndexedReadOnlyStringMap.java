package org.apache.logging.log4j.util;

public interface IndexedReadOnlyStringMap extends ReadOnlyStringMap {
  String getKeyAt(int paramInt);
  
  <V> V getValueAt(int paramInt);
  
  int indexOfKey(String paramString);
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4\\util\IndexedReadOnlyStringMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
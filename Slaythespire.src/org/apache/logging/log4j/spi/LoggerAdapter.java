package org.apache.logging.log4j.spi;

import java.io.Closeable;

public interface LoggerAdapter<L> extends Closeable {
  L getLogger(String paramString);
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\spi\LoggerAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
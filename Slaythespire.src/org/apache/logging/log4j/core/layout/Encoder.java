package org.apache.logging.log4j.core.layout;

public interface Encoder<T> {
  void encode(T paramT, ByteBufferDestination paramByteBufferDestination);
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\core\layout\Encoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package org.apache.commons.net.io;

import java.util.EventListener;

public interface CopyStreamListener extends EventListener {
  void bytesTransferred(CopyStreamEvent paramCopyStreamEvent);
  
  void bytesTransferred(long paramLong1, int paramInt, long paramLong2);
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\commons\net\io\CopyStreamListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package net.arikia.dev.drpc.callbacks;

import com.sun.jna.Callback;

public interface ErroredCallback extends Callback {
  void apply(int paramInt, String paramString);
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\net\arikia\dev\drpc\callbacks\ErroredCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
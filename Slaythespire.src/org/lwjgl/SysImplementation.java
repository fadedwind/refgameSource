package org.lwjgl;

interface SysImplementation {
  int getRequiredJNIVersion();
  
  int getJNIVersion();
  
  int getPointerSize();
  
  void setDebug(boolean paramBoolean);
  
  long getTimerResolution();
  
  long getTime();
  
  void alert(String paramString1, String paramString2);
  
  boolean openURL(String paramString);
  
  String getClipboard();
  
  boolean has64Bit();
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\SysImplementation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
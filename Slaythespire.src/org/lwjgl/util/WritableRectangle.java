package org.lwjgl.util;

public interface WritableRectangle extends WritablePoint, WritableDimension {
  void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  void setBounds(ReadablePoint paramReadablePoint, ReadableDimension paramReadableDimension);
  
  void setBounds(ReadableRectangle paramReadableRectangle);
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjg\\util\WritableRectangle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
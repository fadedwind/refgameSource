package org.lwjgl.util.glu.tessellation;

class ActiveRegion {
  GLUhalfEdge eUp;
  
  DictNode nodeUp;
  
  int windingNumber;
  
  boolean inside;
  
  boolean sentinel;
  
  boolean dirty;
  
  boolean fixUpperEdge;
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjg\\util\glu\tessellation\ActiveRegion.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
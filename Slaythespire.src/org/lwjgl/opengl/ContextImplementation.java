package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.LWJGLException;

interface ContextImplementation {
  ByteBuffer create(PeerInfo paramPeerInfo, IntBuffer paramIntBuffer, ByteBuffer paramByteBuffer) throws LWJGLException;
  
  void swapBuffers() throws LWJGLException;
  
  void releaseDrawable(ByteBuffer paramByteBuffer) throws LWJGLException;
  
  void releaseCurrentContext() throws LWJGLException;
  
  void update(ByteBuffer paramByteBuffer);
  
  void makeCurrent(PeerInfo paramPeerInfo, ByteBuffer paramByteBuffer) throws LWJGLException;
  
  boolean isCurrent(ByteBuffer paramByteBuffer) throws LWJGLException;
  
  void setSwapInterval(int paramInt);
  
  void destroy(PeerInfo paramPeerInfo, ByteBuffer paramByteBuffer) throws LWJGLException;
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opengl\ContextImplementation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
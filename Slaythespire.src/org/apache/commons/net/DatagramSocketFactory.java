package org.apache.commons.net;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public interface DatagramSocketFactory {
  DatagramSocket createDatagramSocket() throws SocketException;
  
  DatagramSocket createDatagramSocket(int paramInt) throws SocketException;
  
  DatagramSocket createDatagramSocket(int paramInt, InetAddress paramInetAddress) throws SocketException;
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\commons\net\DatagramSocketFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
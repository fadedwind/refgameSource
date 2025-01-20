package org.apache.logging.log4j.message;

public interface MultiformatMessage extends Message {
  String getFormattedMessage(String[] paramArrayOfString);
  
  String[] getFormats();
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\message\MultiformatMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
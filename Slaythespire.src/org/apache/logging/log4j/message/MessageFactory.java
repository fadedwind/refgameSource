package org.apache.logging.log4j.message;

public interface MessageFactory {
  Message newMessage(Object paramObject);
  
  Message newMessage(String paramString);
  
  Message newMessage(String paramString, Object... paramVarArgs);
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\message\MessageFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package org.apache.commons.net.nntp;

public interface Threadable {
  boolean isDummy();
  
  String messageThreadId();
  
  String[] messageThreadReferences();
  
  String simplifiedSubject();
  
  boolean subjectIsReply();
  
  void setChild(Threadable paramThreadable);
  
  void setNext(Threadable paramThreadable);
  
  Threadable makeDummy();
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\commons\net\nntp\Threadable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
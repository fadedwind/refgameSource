package org.apache.logging.log4j.core.parser;

import org.apache.logging.log4j.core.LogEvent;

public interface TextLogEventParser extends LogEventParser {
  LogEvent parseFrom(String paramString) throws ParseException;
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\core\parser\TextLogEventParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
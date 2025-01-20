package org.apache.logging.log4j.core.config.plugins.convert;

public interface TypeConverter<T> {
  T convert(String paramString) throws Exception;
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\core\config\plugins\convert\TypeConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
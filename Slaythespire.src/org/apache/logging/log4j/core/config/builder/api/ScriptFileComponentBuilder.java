package org.apache.logging.log4j.core.config.builder.api;

public interface ScriptFileComponentBuilder extends ComponentBuilder<ScriptFileComponentBuilder> {
  ScriptFileComponentBuilder addLanguage(String paramString);
  
  ScriptFileComponentBuilder addIsWatched(boolean paramBoolean);
  
  ScriptFileComponentBuilder addIsWatched(String paramString);
  
  ScriptFileComponentBuilder addCharset(String paramString);
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\core\config\builder\api\ScriptFileComponentBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package org.apache.logging.log4j.core.config.builder.api;

public interface AppenderComponentBuilder extends FilterableComponentBuilder<AppenderComponentBuilder> {
  AppenderComponentBuilder add(LayoutComponentBuilder paramLayoutComponentBuilder);
  
  String getName();
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\core\config\builder\api\AppenderComponentBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
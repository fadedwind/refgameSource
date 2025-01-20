package org.apache.logging.log4j.core.config.builder.api;

public interface LoggableComponentBuilder<T extends ComponentBuilder<T>> extends FilterableComponentBuilder<T> {
  T add(AppenderRefComponentBuilder paramAppenderRefComponentBuilder);
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\core\config\builder\api\LoggableComponentBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
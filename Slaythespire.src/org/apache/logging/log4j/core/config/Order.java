package org.apache.logging.log4j.core.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Order {
  int value();
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\apache\logging\log4j\core\config\Order.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
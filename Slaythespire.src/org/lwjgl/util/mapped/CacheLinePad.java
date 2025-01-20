package org.lwjgl.util.mapped;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface CacheLinePad {
  boolean before() default false;
  
  boolean after() default true;
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjg\\util\mapped\CacheLinePad.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
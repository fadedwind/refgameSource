package com.google.gson;

import java.lang.reflect.Type;

public interface JsonDeserializationContext {
  <T> T deserialize(JsonElement paramJsonElement, Type paramType) throws JsonParseException;
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\com\google\gson\JsonDeserializationContext.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
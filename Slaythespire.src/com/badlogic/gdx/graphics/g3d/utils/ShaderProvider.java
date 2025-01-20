package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.graphics.g3d.Renderable;
import com.badlogic.gdx.graphics.g3d.Shader;

public interface ShaderProvider {
  Shader getShader(Renderable paramRenderable);
  
  void dispose();
}


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\com\badlogic\gdx\graphics\g3\\utils\ShaderProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
shader_type canvas_item;

//uniform float dissolveState : hint_range(0.0, 1.0);
uniform sampler2D noise;
uniform vec2 scale = vec2(1, 1);
uniform sampler2D gradient;

void fragment(){
	COLOR *= texture(TEXTURE, UV);
	COLOR.a *= step(texture(noise, SCREEN_UV * scale).r, MODULATE.a);
	COLOR.rgb *= MODULATE.r;
	
	COLOR.rgb = texture(gradient, vec2(COLOR.r)).rgb;
	
}
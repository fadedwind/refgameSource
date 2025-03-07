/*     */ package org.lwjgl.util.vector;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.nio.FloatBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Vector3f
/*     */   extends Vector
/*     */   implements Serializable, ReadableVector3f, WritableVector3f
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   public float x;
/*     */   public float y;
/*     */   public float z;
/*     */   
/*     */   public Vector3f() {}
/*     */   
/*     */   public Vector3f(ReadableVector3f src) {
/*  65 */     set(src);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector3f(float x, float y, float z) {
/*  72 */     set(x, y, z);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set(float x, float y) {
/*  79 */     this.x = x;
/*  80 */     this.y = y;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set(float x, float y, float z) {
/*  87 */     this.x = x;
/*  88 */     this.y = y;
/*  89 */     this.z = z;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector3f set(ReadableVector3f src) {
/*  98 */     this.x = src.getX();
/*  99 */     this.y = src.getY();
/* 100 */     this.z = src.getZ();
/* 101 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float lengthSquared() {
/* 108 */     return this.x * this.x + this.y * this.y + this.z * this.z;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector3f translate(float x, float y, float z) {
/* 118 */     this.x += x;
/* 119 */     this.y += y;
/* 120 */     this.z += z;
/* 121 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Vector3f add(Vector3f left, Vector3f right, Vector3f dest) {
/* 133 */     if (dest == null) {
/* 134 */       return new Vector3f(left.x + right.x, left.y + right.y, left.z + right.z);
/*     */     }
/* 136 */     dest.set(left.x + right.x, left.y + right.y, left.z + right.z);
/* 137 */     return dest;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Vector3f sub(Vector3f left, Vector3f right, Vector3f dest) {
/* 150 */     if (dest == null) {
/* 151 */       return new Vector3f(left.x - right.x, left.y - right.y, left.z - right.z);
/*     */     }
/* 153 */     dest.set(left.x - right.x, left.y - right.y, left.z - right.z);
/* 154 */     return dest;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Vector3f cross(Vector3f left, Vector3f right, Vector3f dest) {
/* 172 */     if (dest == null) {
/* 173 */       dest = new Vector3f();
/*     */     }
/* 175 */     dest.set(left.y * right.z - left.z * right.y, right.x * left.z - right.z * left.x, left.x * right.y - left.y * right.x);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 181 */     return dest;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector negate() {
/* 191 */     this.x = -this.x;
/* 192 */     this.y = -this.y;
/* 193 */     this.z = -this.z;
/* 194 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector3f negate(Vector3f dest) {
/* 203 */     if (dest == null)
/* 204 */       dest = new Vector3f(); 
/* 205 */     dest.x = -this.x;
/* 206 */     dest.y = -this.y;
/* 207 */     dest.z = -this.z;
/* 208 */     return dest;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector3f normalise(Vector3f dest) {
/* 218 */     float l = length();
/*     */     
/* 220 */     if (dest == null) {
/* 221 */       dest = new Vector3f(this.x / l, this.y / l, this.z / l);
/*     */     } else {
/* 223 */       dest.set(this.x / l, this.y / l, this.z / l);
/*     */     } 
/* 225 */     return dest;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static float dot(Vector3f left, Vector3f right) {
/* 236 */     return left.x * right.x + left.y * right.y + left.z * right.z;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static float angle(Vector3f a, Vector3f b) {
/* 246 */     float dls = dot(a, b) / a.length() * b.length();
/* 247 */     if (dls < -1.0F) {
/* 248 */       dls = -1.0F;
/* 249 */     } else if (dls > 1.0F) {
/* 250 */       dls = 1.0F;
/* 251 */     }  return (float)Math.acos(dls);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector load(FloatBuffer buf) {
/* 258 */     this.x = buf.get();
/* 259 */     this.y = buf.get();
/* 260 */     this.z = buf.get();
/* 261 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector scale(float scale) {
/* 269 */     this.x *= scale;
/* 270 */     this.y *= scale;
/* 271 */     this.z *= scale;
/*     */     
/* 273 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector store(FloatBuffer buf) {
/* 282 */     buf.put(this.x);
/* 283 */     buf.put(this.y);
/* 284 */     buf.put(this.z);
/*     */     
/* 286 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 293 */     StringBuilder sb = new StringBuilder(64);
/*     */     
/* 295 */     sb.append("Vector3f[");
/* 296 */     sb.append(this.x);
/* 297 */     sb.append(", ");
/* 298 */     sb.append(this.y);
/* 299 */     sb.append(", ");
/* 300 */     sb.append(this.z);
/* 301 */     sb.append(']');
/* 302 */     return sb.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getX() {
/* 309 */     return this.x;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getY() {
/* 316 */     return this.y;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void setX(float x) {
/* 324 */     this.x = x;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void setY(float y) {
/* 332 */     this.y = y;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setZ(float z) {
/* 340 */     this.z = z;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getZ() {
/* 347 */     return this.z;
/*     */   }
/*     */   
/*     */   public boolean equals(Object obj) {
/* 351 */     if (this == obj) return true; 
/* 352 */     if (obj == null) return false; 
/* 353 */     if (getClass() != obj.getClass()) return false; 
/* 354 */     Vector3f other = (Vector3f)obj;
/*     */     
/* 356 */     if (this.x == other.x && this.y == other.y && this.z == other.z) return true;
/*     */     
/* 358 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjg\\util\vector\Vector3f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
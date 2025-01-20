/*     */ package org.lwjgl.opencl;
/*     */ 
/*     */ import java.util.Iterator;
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
/*     */ final class FastLongMap<V>
/*     */   implements Iterable<FastLongMap.Entry<V>>
/*     */ {
/*     */   private Entry[] table;
/*     */   private int size;
/*     */   private int mask;
/*     */   private int capacity;
/*     */   private int threshold;
/*     */   
/*     */   FastLongMap() {
/*  32 */     this(16, 0.75F);
/*     */   }
/*     */ 
/*     */   
/*     */   FastLongMap(int initialCapacity) {
/*  37 */     this(initialCapacity, 0.75F);
/*     */   }
/*     */   
/*     */   FastLongMap(int initialCapacity, float loadFactor) {
/*  41 */     if (initialCapacity > 1073741824) throw new IllegalArgumentException("initialCapacity is too large."); 
/*  42 */     if (initialCapacity < 0) throw new IllegalArgumentException("initialCapacity must be greater than zero."); 
/*  43 */     if (loadFactor <= 0.0F) throw new IllegalArgumentException("initialCapacity must be greater than zero."); 
/*  44 */     this.capacity = 1;
/*  45 */     while (this.capacity < initialCapacity)
/*  46 */       this.capacity <<= 1; 
/*  47 */     this.threshold = (int)(this.capacity * loadFactor);
/*  48 */     this.table = new Entry[this.capacity];
/*  49 */     this.mask = this.capacity - 1;
/*     */   }
/*     */   
/*     */   private int index(long key) {
/*  53 */     return index(key, this.mask);
/*     */   }
/*     */   
/*     */   private static int index(long key, int mask) {
/*  57 */     int hash = (int)(key ^ key >>> 32L);
/*  58 */     return hash & mask;
/*     */   }
/*     */   
/*     */   public V put(long key, V value) {
/*  62 */     Entry[] arrayOfEntry = this.table;
/*  63 */     int index = index(key);
/*     */ 
/*     */     
/*  66 */     for (Entry<V> e = arrayOfEntry[index]; e != null; ) {
/*  67 */       if (e.key != key) { e = e.next; continue; }
/*  68 */        T t = e.value;
/*  69 */       e.value = (T)value;
/*  70 */       return (V)t;
/*     */     } 
/*     */     
/*  73 */     arrayOfEntry[index] = new Entry<V>(key, value, arrayOfEntry[index]);
/*     */     
/*  75 */     if (this.size++ >= this.threshold) {
/*  76 */       rehash((Entry<V>[])arrayOfEntry);
/*     */     }
/*  78 */     return null;
/*     */   }
/*     */   
/*     */   private void rehash(Entry<V>[] table) {
/*  82 */     int newCapacity = 2 * this.capacity;
/*  83 */     int newMask = newCapacity - 1;
/*     */     
/*  85 */     Entry[] arrayOfEntry = new Entry[newCapacity];
/*     */     
/*  87 */     for (int i = 0; i < table.length; i++) {
/*  88 */       Entry<V> e = table[i];
/*  89 */       if (e != null) {
/*     */         do {
/*  91 */           Entry<V> next = e.next;
/*  92 */           int index = index(e.key, newMask);
/*  93 */           e.next = arrayOfEntry[index];
/*  94 */           arrayOfEntry[index] = e;
/*  95 */           e = next;
/*  96 */         } while (e != null);
/*     */       }
/*     */     } 
/*  99 */     this.table = arrayOfEntry;
/* 100 */     this.capacity = newCapacity;
/* 101 */     this.mask = newMask;
/* 102 */     this.threshold *= 2;
/*     */   }
/*     */   
/*     */   public V get(long key) {
/* 106 */     int index = index(key);
/* 107 */     for (Entry<V> e = this.table[index]; e != null; e = e.next) {
/* 108 */       if (e.key == key) return (V)e.value; 
/* 109 */     }  return null;
/*     */   }
/*     */   
/*     */   public boolean containsValue(Object value) {
/* 113 */     Entry[] arrayOfEntry = this.table;
/* 114 */     for (int i = arrayOfEntry.length - 1; i >= 0; i--) {
/* 115 */       for (Entry<V> e = arrayOfEntry[i]; e != null; e = e.next)
/* 116 */       { if (e.value.equals(value)) return true;  } 
/* 117 */     }  return false;
/*     */   }
/*     */   
/*     */   public boolean containsKey(long key) {
/* 121 */     int index = index(key);
/* 122 */     for (Entry<V> e = this.table[index]; e != null; e = e.next) {
/* 123 */       if (e.key == key) return true; 
/* 124 */     }  return false;
/*     */   }
/*     */   
/*     */   public V remove(long key) {
/* 128 */     int index = index(key);
/*     */     
/* 130 */     Entry<V> prev = this.table[index];
/* 131 */     Entry<V> e = prev;
/* 132 */     while (e != null) {
/* 133 */       Entry<V> next = e.next;
/* 134 */       if (e.key == key) {
/* 135 */         this.size--;
/* 136 */         if (prev == e) {
/* 137 */           this.table[index] = next;
/*     */         } else {
/* 139 */           prev.next = next;
/* 140 */         }  return (V)e.value;
/*     */       } 
/* 142 */       prev = e;
/* 143 */       e = next;
/*     */     } 
/* 145 */     return null;
/*     */   }
/*     */   
/*     */   public int size() {
/* 149 */     return this.size;
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/* 153 */     return (this.size == 0);
/*     */   }
/*     */   
/*     */   public void clear() {
/* 157 */     Entry[] arrayOfEntry = this.table;
/* 158 */     for (int index = arrayOfEntry.length - 1; index >= 0; index--)
/* 159 */       arrayOfEntry[index] = null; 
/* 160 */     this.size = 0;
/*     */   }
/*     */   
/*     */   public EntryIterator iterator() {
/* 164 */     return new EntryIterator();
/*     */   }
/*     */   
/*     */   public class EntryIterator
/*     */     implements Iterator<Entry<V>> {
/*     */     private int nextIndex;
/*     */     private FastLongMap.Entry<V> current;
/*     */     
/*     */     EntryIterator() {
/* 173 */       reset();
/*     */     }
/*     */     
/*     */     public void reset() {
/* 177 */       this.current = null;
/*     */       
/* 179 */       FastLongMap.Entry[] arrayOfEntry = FastLongMap.this.table;
/*     */       int i;
/* 181 */       for (i = arrayOfEntry.length - 1; i >= 0 && 
/* 182 */         arrayOfEntry[i] == null; i--);
/* 183 */       this.nextIndex = i;
/*     */     }
/*     */     
/*     */     public boolean hasNext() {
/* 187 */       if (this.nextIndex >= 0) return true; 
/* 188 */       FastLongMap.Entry<V> e = this.current;
/* 189 */       return (e != null && e.next != null);
/*     */     }
/*     */ 
/*     */     
/*     */     public FastLongMap.Entry<V> next() {
/* 194 */       FastLongMap.Entry<V> e = this.current;
/* 195 */       if (e != null) {
/* 196 */         e = e.next;
/* 197 */         if (e != null) {
/* 198 */           this.current = e;
/* 199 */           return e;
/*     */         } 
/*     */       } 
/*     */       
/* 203 */       FastLongMap.Entry[] arrayOfEntry = FastLongMap.this.table;
/* 204 */       int i = this.nextIndex;
/* 205 */       e = this.current = arrayOfEntry[i]; do {  }
/* 206 */       while (--i >= 0 && 
/* 207 */         arrayOfEntry[i] == null);
/* 208 */       this.nextIndex = i;
/* 209 */       return e;
/*     */     }
/*     */     
/*     */     public void remove() {
/* 213 */       FastLongMap.this.remove(this.current.key);
/*     */     }
/*     */   }
/*     */   
/*     */   static final class Entry<T>
/*     */   {
/*     */     final long key;
/*     */     T value;
/*     */     Entry<T> next;
/*     */     
/*     */     Entry(long key, T value, Entry<T> next) {
/* 224 */       this.key = key;
/* 225 */       this.value = value;
/* 226 */       this.next = next;
/*     */     }
/*     */     
/*     */     public long getKey() {
/* 230 */       return this.key;
/*     */     }
/*     */     
/*     */     public T getValue() {
/* 234 */       return this.value;
/*     */     }
/*     */   }
/*     */ }


/* Location:              D:\steam\steamapps\common\SlayTheSpire\desktop-1.0.jar!\org\lwjgl\opencl\FastLongMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
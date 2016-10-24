#Map<K,V>

V put(K key, V value)
V get(Object o)
boolean containsKey(Object o)
boolean containsValue(Object o)

// !!!
V remove(Object o)
default boolean remove(Object key, Object value)

void clear()
boolean isEmpty()
int size()
Set<K> keySet()
Collection<V> values()
Set<Map.Entry<K,V>> entrySet()

default V compute(K,BiFunction<? super K, ? super V, ? extends V> remappingFunction)
default V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
default V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
default V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)

//forEach !!!

default void forEach(BiConsumer<? super K,? super V> action)

//getOrDefault !!!

default V getOrDefault(Object key, V defaultValue)

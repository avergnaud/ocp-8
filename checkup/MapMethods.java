#interface java.util.Map<K,V>

V put(K key, V value)
default V putIfAbsent(K key, V value) /* Any implementation providing atomicity guarantees must override this method and document its concurrency properties. */
default V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
V get(Object o)
default V getOrDefault(Object key, V defaultValue)
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

default void forEach(BiConsumer<? super K,? super V> action)

default V compute(K,BiFunction<? super K, ? super V, ? extends V> remappingFunction)
default V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
default V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)

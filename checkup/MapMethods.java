#interface java.util.Map<K,V>

V put(K key, V value)
default V putIfAbsent(K key, V value) /* Any implementation providing atomicity guarantees must override this method and document its concurrency properties. */
default V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
V get(Object o)
default V getOrDefault(Object key, V defaultValue)
// !!!
V remove(Object o)
default boolean remove(Object key, Object value)

boolean containsKey(Object o)
boolean containsValue(Object o)

void clear()
boolean isEmpty()
int size()

default void forEach(BiConsumer<? super K,? super V> action)

Set<K> keySet()
Collection<V> values()
Set<Map.Entry<K,V>> entrySet()

default V compute(K,BiFunction<? super K, ? super V, ? extends V> remappingFunction)
default V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
default V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)

default V replace(K key, V value)
default boolean replace(K key, V oldValue, V newValue)
default void replaceAll(BiFunction<? super K,? super V,? extends V> function)

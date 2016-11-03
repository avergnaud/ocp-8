//interface java.util.Collection

boolean add(E e)
boolean addAll(Collection<? extends E> c)
boolean remove(Object o)
boolean removeAll(Collection<?> c)
boolean contains(Object o)
boolean isEmpty()
void clear()
int size()

Object[] toArray()
<T> T[] toArray(T[] a)

default Stream<E> stream()
default Stream<E> parallelStream()
default boolean removeIf(Predicate<? super E> filter)

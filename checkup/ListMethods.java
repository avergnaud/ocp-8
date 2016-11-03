#from Collection
boolean add(E element)
boolean remove(Object object)
boolean contains(Object object)
int size()
boolean isEmpty()
void clear()
default Stream<E> stream()
default Stream<E> parallelStream()
default boolean removeIf(Predicate<? super E> filter)

#List methods
void add(int index,E element)
E get(int index)
E remove(int index)
E set(int index, E element)
int indexOf(Object o)
int lastIndexOf(Object o)

List<E> sublist(int fromIndex, int toIndex)

default void replaceAll(UnaryOperator<E> operator)

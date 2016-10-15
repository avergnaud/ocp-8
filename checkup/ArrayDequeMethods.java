// does not allow null

// Collection methods
boolean add(E)
boolean remove(Object)
boolean contains(Object)
boolean isEmpty()
void clear()
int size()

// Deque methods
E peek()
E poll()
boolean offer(E)

E element() /*if Deque is empty, throws NoSuchElementException*/
E remove() /*if Deque is empty, throws NoSuchElementException*/
boolean add(E) /*id Deque is full throws IllegalStateException*/

// Stack
E pop() /*if Deque is empty, throws NoSuchElementException*/
boolean push(E) /*id Deque is full throws IllegalStateException*/

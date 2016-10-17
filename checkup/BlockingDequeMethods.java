
interface BlockingDeque<E> implements BlockingQueue<E>, Deque<E>, Queue<E>, Collection<E>

//common collection methods
//boolean add(E) OVERRIDEN !
boolean remove(Object)
boolean contains(Object)
boolean isEmpty()
void clear()
int size()

//Deque methods
E peek() /*returns null if empty*/
E poll() /*returns null if empty*/
boolean offer(E) /*returns false if deque is full*/
E element() /*throws NoSuchElementException if empty*/
E remove() /*throws NoSuchElementException if empty*/
boolean add(E) /*throws IllegalStateException if full*/

void push(E) /*IllegalStateException - if the element cannot be added at this time due to capacity restrictions*/
E pop() /*NoSuchElementException - if this deque is empty*/

pollFirst ~ poll
boolean offerFirst(E)
E pollLast()
offerLast ~ offer

removeFirst ~ remove
E removeLast() /*NoSuchElementException - if this deque is empty*/
addFirst ~ push
addLast ~ add

//BlockingQueue methods
E poll(long timeout,TimeUnit unit) throws InterruptedException
pollFirst ~ poll
E pollLast(long timeout,TimeUnit unit) throws InterruptedException

boolean offer(long timeout,TimeUnit unit) throws InterruptedException
boolean offerLast ~ offer
boolean offerFirst(long timeout,TimeUnit unit) throws InterruptedException

/* List, Queue, Deque, LinkedList, Set, Map */

Vector<E> implements Collection<E>, List<E>
	does allow null
ArrayList<E> implements Collection<E>, List<E>
	does allow null
CopyOnWriteArrayList<E> implements Collection<E>, List<E>
	does allow null

ConcurrentLinkedQueue<E> implements Collection<E>, Queue<E>
	does NOT allow null
LinkedBlockingQueue<E> implements Collection<E>, Queue<E>, BlockingQueue<E>
	does NOT allow null

ArrayDeque<E> implements Collection<E>, Queue<E>, Deque<E>
	does NOT allow null
ConcurrentLinkedDeque<E> implements Collection<E>, Queue<E>, Deque<E>
	does NOT allow null
LinkedBlockingDeque<E> implements Collection<E>, Queue<E>, BlockingQueue<E>, BlockingDeque<E>, Deque<E>
	does NOT allow null

LinkedList<E> implements Collection<E>, List<E>, Queue<E>, Deque<E>
	does allow null

HashSet<E> implements Collection<E>, Set<E>
	does allow null
TreeSet implements Collection<E>, Set<E>, SortedSet<E>, NavigableSet<E>
	does NOT allow null if this set uses natural ordering or its comparator does not permit null elements
ConcurrentSkipListSet<E> implements Collection<E>, Set<E>, SortedSet<E>, NavigableSet<E>
	does NOT allow null
CopyOnWriteArraySet<E> implements Collection<E>, Set<E>
	does allow null

Hashtable<K,V> implements Map<K,V>
	does NOT allow null K or V
HashMap<K,V> implements Map<K,V>
	does allow null K or V
TreeMap<K,V> implements Map<K,V>, SortedMap<K,V>, NavigableMap<K,V>
	does NOT allow null if this map uses natural ordering, or its comparator does not permit null keys
ConcurrentHashMap<K,V> implements Map<K,V>, ConcurrentMap<K,V>
	does NOT allow null K or V
ConcurrentSkipListMap<K,V> implements Map<K,V>, ConcurrentMap<K,V>, SortedMap<K,V>, NavigableMap<K,V>, ConcurrentNavigableMap<K,V>
	does NOT allow null K or V
...

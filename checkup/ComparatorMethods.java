//Comparator<T>

public int compare(T o1, T o2)


// !!!

public default Comparator<T> reversed()

public static <T extends Comparable<? super T>> Comparator<T> naturalOrder()

public static <T extends Comparable<? super T>> Comparator<T> reverseOrder()

static <T,U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor)


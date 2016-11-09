//interface java.util.function.BinaryOperator<T> extends BiFunction<T,T,T>

T apply(T,T)

static <T> BinaryOperator<T> maxBy(Comparator<? super T> comparator)
static <T> BinaryOperator<T> minBy(Comparator<? super T> comparator)

// ? inherited:
default <V> BinaryOperator<T,U,V> andThen(Function<? super R,? extends V> after)

//interface java.util.function.Predicate<T>

boolean test(T t)
default Predicate<T> negate()
default Predicate<T> and(Predicate<? super T> other)
default Predicate<T> or(Predicate<? super T> other)

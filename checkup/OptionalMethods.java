
static <T> Optional<T> of(T value)
static <T> Optional<T> empty()

boolean isPresent()
void ifPresent(Consumer<? super T> consumer)

T get() /* when empty throws NoSuchElementException */

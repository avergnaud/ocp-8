
static <T> Stream<T> of(T... values)
static <T> Stream<T> iterate(T seed, UnaryOperator<T> increment)
static <T> Stream<T> empty()
static <T> Stream<T> generate(Supplier<T> s)

Stream<T> filter(Predicate<? super T> predicate)
<R> Stream<R> map(Function<? super T,? super R> mappingFunction)

void forEach(Consumer<? super T> consumer)
<R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R,R> combiner) /*https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#collect-java.util.function.Supplier-java.util.function.BiConsumer-java.util.function.BiConsumer-*/

U <U> reduce(U identity,
	BiFunction<U,? super T,U> accumulator
	BinaryOperator<U> combiner)
T reduce(T identity,
	BinaryOperator<T> accumulator)
Optional<T> reduce(BinaryOperator<T> accumulator)

#from BaseStream
S parallel()
boolean isParallel()

findfirst /* operation based on order */
limit /* operation based on order */
skip /* operation based on order */

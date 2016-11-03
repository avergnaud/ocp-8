
//java.util.stream.LongStream implements AutoCloseable

static LongStream empty()
static LongStream generate(LongSupplier s)
static LongStream iterate(long seed, LongUnaryOperator f)
static LongStream of(long... values)
static LongStream of(long t)
static LongStream range(long startInclusive, long endExclusive)
static LongStream rangeClosed(long startInclusive, long endInclusive)


#collect ! 1 method !
<R> R collect(Supplier<R> supplier,
	ObjLongConsumer<R> accumulator,
	BiConsumer<R,R> combiner)

#reduce
OptionalLong reduce(LongBinaryOperator lbo)
Long reduce(Long identity,LongBinaryOperator lbo)

findAny
findFirst

...


(page 217)

static Collector<> toConcurrentMap(Function<? super T, ? extends K> keyMapper,
	Function<? super T, ? extends U> valueMapper)

static Collector<> toConcurrentMap(Function<? super T, ? extends K> keyMapper,
	Function<? super T, ? extends U> valueMapper,
	BinaryOperator<U> merger)

static Collector<> toConcurrentMap(Function<? super T, ? extends K> keyMapper,
	Function<? super T, ? extends U> valueMapper,
	BinaryOperator<U> merger,
	Supplier<M> mapSupplier)

static Collector<> groupingByConcurrent(Function<? super T,? extends K> classifier)

static Collector<> groupingByConcurrent(Function<? super T,? extends K> classifier,
	Collector toWhat)


static Collector<> groupingByConcurrent(Function<? super T,? extends K> classifier,
	Supplier<M> mapFactory,	
	Collector<> downstream)

static Collector<> groupingBy(Function<? super T,? extends K> classifier)

static Collector<> groupingBy(Function<? super T,? extends K> classifier, Collector<>)

static Collector<> groupingBy(Function<? super T,? extends K> classifier, Supplier<M> mapFactory, Collector<>)

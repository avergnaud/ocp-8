
#LongStream

#collect
<R> R collect(Collector<> collector)
<R> R collect(Supplier<R> supplier,
	ObjLongConsumer<R> accumulator,
	BiConsumer<R,R> combiner)

#reduce
OptionalLong reduce(LongBinaryOperator lbo)
Long reduce(Long identity,LongBinaryOperator lbo)



#LongStream

#collect ! 1 method !
<R> R collect(Supplier<R> supplier,
	ObjLongConsumer<R> accumulator,
	BiConsumer<R,R> combiner)

#reduce
OptionalLong reduce(LongBinaryOperator lbo)
Long reduce(Long identity,LongBinaryOperator lbo)


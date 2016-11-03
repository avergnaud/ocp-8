//final class java.util.OptionalLong

public static OptionalLong empty()
public static OptionalLong of(long value)

public long getAsLong()

public boolean isPresent()

public void ifPresent(LongConsumer consumer)

public long orElse(long other)

public long orElseGet(LongSupplier other)

public <X extends Throwable> long orElseThrow(Supplier<X> exceptionSupplier) throws X /*extends Throwable ?*/

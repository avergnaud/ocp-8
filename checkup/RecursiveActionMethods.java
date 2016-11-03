public abstract class RecursiveAction extends ForkJoinTask<Void> implements Future<Void>

public static void invokeAll(ForkJoinTask<?> t1, ForkJoinTask<?> t2)
public static void invokeAll(ForkJoinTask<?>... tasks)
public static <T extends ForkJoinTask<?>> Collection<T> invokeAll(Collection<T> tasks)


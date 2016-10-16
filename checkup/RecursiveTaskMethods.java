public abstract class RecursiveTask<V> extends ForkJoinTask<V> implements Future<V>

//UTILISER :
public final ForkJoinTask<V> fork()
public final V join()

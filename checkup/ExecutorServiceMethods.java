
void shutdown()
List<Runnable> shutdownNow()

void execute(Runnable command)
Future<?> submit(Runnable command)
<T> Future<T> submit(Callable<T> task)
<T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException
<T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException

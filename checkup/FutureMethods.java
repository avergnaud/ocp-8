Future<V>

V get() throws InterruptedException, ExecutionException

boolean isDone()

boolean isCancelled()

boolean cancel(boolean mayInterruptIfRunning)

V get(long amount, java.util.concurrent.TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException

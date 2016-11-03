// java.util.concurrent.ScheduledExecutorService implements Executor, ExecutorService

<V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit)

ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit)

ScheduledFuture<?> scheduleAtFixedRate(Runnable command,long initialDelay,long period,TimeUnit unit)

ScheduledFuture<?> scheduleWithFixedDelay(Runnable command,long initialDelay,long delay,TimeUnit unit)

//Methods inherited from interface java.util.concurrent.Executor :

void execute(Runnable command)

//Methods inherited from interface java.util.concurrent.ExecutorService :

Future<?> submit(Runnable task)

<T> Future<T> submit(Callable<T> task)

void shutdown()

List<Runnable> shutdownNow()

boolean awaitTermination(long timeout,TimeUnit unit) throws InterruptedException

<T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks,
                              long timeout,
                              TimeUnit unit)
                       throws InterruptedException

invokeAny

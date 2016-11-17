package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;

public class _02691 {

/* A task that return a result and may throw an exception */
static String throwing() throws InterruptedException {
Thread.sleep(1000);
throw new NullPointerException("could not complete task");
}

public static void main(String... args) throws InterruptedException {

Callable<String> callable = _02691::throwing;

ExecutorService executor = Executors.newSingleThreadExecutor();
Future<String> future = null;
try {
future = executor.submit(callable);
Thread.sleep(100);
future.cancel(false);
String resultat = future.get(10,TimeUnit.SECONDS);

out.println(resultat);

} catch(InterruptedException e) {
e.printStackTrace();
} catch(TimeoutException e) {
e.printStackTrace();
} catch(ExecutionException e) {
e.printStackTrace();
} catch(CancellationException e) {
out.println("CancellationException");
out.println(future.isDone());
out.println(future.isCancelled());
} finally {
executor.shutdown();
}

}}

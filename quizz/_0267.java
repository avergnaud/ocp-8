package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;

public class _0267 {

/* A task that return a result and may throw an exception */
static String throwing() throws InterruptedException {
Thread.sleep(1000);
throw new NullPointerException("could not complete task");
}

public static void main(String... args) {

Callable<String> callable = _0267::throwing;

ExecutorService executor = Executors.newSingleThreadExecutor();
try {

Future<String> future = executor.submit(callable);
future.cancel(true);
String resultat = future.get(10,TimeUnit.SECONDS);

out.println(resultat);

} catch(InterruptedException e) {
e.printStackTrace();
} catch(TimeoutException e) {
e.printStackTrace();
} catch(ExecutionException e) {
e.printStackTrace();
} finally {
executor.shutdown();
}

}}


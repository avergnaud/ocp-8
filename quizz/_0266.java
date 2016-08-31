package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;

public class _0266 {

/* A task that return a result and may throw an exception */
static String throwing() {
throw new NullPointerException("could not complete task");
}

public static void main(String... args) {

Callable<String> callable = _0266::throwing;

ExecutorService executor = Executors.newSingleThreadExecutor();
try {

Future<String> future = executor.submit(callable);

String resultat = future.get(10,TimeUnit.SECONDS);

out.println(resultat);

} catch(ExecutionException e) {
e.printStackTrace();
} finally {
executor.shutdown();
}

}}


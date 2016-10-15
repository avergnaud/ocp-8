package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;

public class _0264 {

/* A task that return a result and may throw an exception */
static String throwing() throws Exception {
throw new InterruptedException("could not complete task");
}

public static void main(String... args) {

Callable<String> callable = _0264::throwing;

ExecutorService executor = Executors.newSingleThreadExecutor();
try {

Future<String> future = executor.submit(callable);

} finally {
executor.shutdown();
}

}}


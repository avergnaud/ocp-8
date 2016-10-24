package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;

public class _0263 {

/* A task that return a result and may throw an exception */
static String call() throws Exception {
throw new InterruptedException("could not complete task");
}

public static void main(String... args) {

Callable<String> callable = _0263::call;

ExecutorService executor = ExecutorService.newSingleThreadExecutor();
try {

Future<String> future = executor.submit(callable);

} finally {
executor.shutdown();
}

}}


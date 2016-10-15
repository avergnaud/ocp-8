package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0258 {

public static void main(String... args) {

ExecutorService es = Executors.newSingleThreadExecutor();
try {

Future<?> result = es.submit(()->{out.println("some job");});

} catch (InterruptedException | ExecutionException e) {
} finally {
es.shutdown();
}

}}


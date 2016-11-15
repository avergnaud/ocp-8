package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0292 {

public static void main(String... args) {


Callable<String> task = String::new;

ExecutorService es = null;
try {
es = Executors.newSingleThreadExecutor();
Future<String> result = es.submit(task);
} catch (ExecutionException e) {
//ignoring
} finally {
es.shutdown();
}

}
}

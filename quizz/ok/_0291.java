package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0291 {

public static void main(String... args) {


Callable<String> task = String::new;

ExecutorService es = null;
try {
es = Executors.newSingleThreadExecutor();
Callable<String> result = es.submit(task);
} finally {
es.shutdown();
}

}
}

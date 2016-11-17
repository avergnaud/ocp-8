package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0257 {

public static void main(String... args) throws InterruptedException {

ExecutorService es = Executors.newSingleThreadExecutor();
try {
es.execute(()->{out.println("first job");});

Future<?> result = es.submit(()->{out.println("second job");});
assert result.get() == null;
} finally {
es.shutdown();
}

}}


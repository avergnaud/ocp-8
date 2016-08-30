package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.List;

public class _0260 {

static Integer someTask() {
try {
Thread.sleep(1000);
} catch (InterruptedException e) {out.println("interrupted");}
out.println("job done");
return 1;
}

public static void main(String... args) {

ExecutorService executor = Executors.newSingleThreadExecutor();

try {

Future<Integer> future = executor.submit(_0260::someTask);
Future<Integer> future2 = executor.submit(_0260::someTask);
Future<Integer> future3 = executor.submit(_0260::someTask);

} finally {
List<Runnable> notStarted = executor.shutdownNow();
out.println(notStarted);
}

}}


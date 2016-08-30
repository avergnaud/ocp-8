package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.List;

public class _0259 {

static void run() {
try {
Thread.sleep(1000);
} catch (InterruptedException e) {out.println("interrupted");}
out.println("job done");
}

public static void main(String... args) {

ExecutorService executor = Executors.newSingleThreadExecutor();

try {

executor.execute(_0259::run);
executor.execute(_0259::run);
executor.execute(_0259::run);

} finally {
List<Runnable> notStarted = executor.shutdownNow();
out.println(notStarted);
}

}}


package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0561 {

static void run() {
try {
Thread.sleep(10_000);
} catch (InterruptedException e) {}
}

public static void main(String... args) throws Exception {

ExecutorService service = Executors.newSingleThreadExecutor();
try {
service.execute(_0561::run);
} finally {
service.shutdown();
}

}}

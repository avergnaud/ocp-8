package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;

public class _0261 {

static void run() {
try {
Integer duration = new Random().nextInt(1000);
Thread.sleep(duration);
} catch (InterruptedException e) {out.println("interrupted");}
out.println("job done");
}

public static void main(String... args) {

ExecutorService executor = Executors.newSingleThreadExecutor();

try {

executor.execute(_0261::run);
executor.execute(_0261::run);

} finally {
executor.shutdown();
executor.execute(_0261::run);
out.println(executor.isShutdown());
out.println(executor.isTerminated());
}

}}


package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0560 {
public static void main(String... args) throws Exception {

ExecutorService service = Executors.newSingleThreadExecutor();
try {
service.submit(()->{Thread.sleep(10_000);return null;});
} finally {
service.shutdown();
}

}}

package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0558 {
public static void main(String... args) throws Exception {

ExecutorService service = Executors.newSingleThreadExecutor();
try {
service.execute(()->{Thread.sleep(10_000);});
} finally {
service.shutdown();
}

}}

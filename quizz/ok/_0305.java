package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0305 {

public static void main(String... args) {

ScheduledExecutorService service = null;
try {
service = Executors.newSingleThreadScheduledExecutor();

Future<?> f = service.submit(()->{Thread.sleep(1000);return null;});

} finally {
service.shutdown();
}

}}

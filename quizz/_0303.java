package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0303 {

public static void main(String... args) {

ExecutorService service = null;
try {
service = Executors.newSingleThreadExecutor();

Future<?> f = service.submit(()->{Thread.sleep(2000);return null;});

service.awaitTermination(10,TimeUnit.DAYS);

} catch (InterruptedException e) {
} catch (TimeoutException e) {
out.println("timed out");
} finally {
service.shutdown();
}

}}

package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0308 {

public static void main(String... args) {

ScheduledExecutorService service = null;
try {
service = Executors.newSingleThreadScheduledExecutor();

Future<?> f = service.schedule((Runnable)String::new,1,TimeUnit.SECONDS);

} finally {
service.shutdown();
}

}}

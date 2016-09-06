package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0309 {

public static void main(String... args) {

ScheduledExecutorService service = null;
try {
service = Executors.newSingleThreadScheduledExecutor();

ScheduledFuture<?> f = service.schedule((Runnable)String::new,1,TimeUnit.SECONDS);

out.println(f.getDelay());

} finally {
service.shutdown();
}

}}

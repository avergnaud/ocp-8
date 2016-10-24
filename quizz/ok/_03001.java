package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _03001 {

public static void main(String... args) {

ExecutorService service = Executors.newSingleThreadExecutor();
try {

service.submit(()->{Thread.sleep(1000);return null;});

} finally {
service.shutdown();
}

}}

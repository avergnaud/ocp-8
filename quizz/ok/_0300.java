package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0300 {

public static void main(String... args) {

ExecutorService service = null;
try {

service.submit(()->{Thread.sleep(1000);return null;});

} finally {
service.shutdown();
}

}}

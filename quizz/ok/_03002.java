package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _03002 {

public static void main(String... args) {

ExecutorService service = Executors.newSingleThreadExecutor();
try {

service.submit(()->{throw new InterruptedException("arf");});

} finally {
service.shutdown();
}

}}

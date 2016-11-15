package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0816 {

public static void main(String... args) {

ExecutorService es = Executors.newSingleThreadExecutor();
try {

es.submit(() -> {throw new NullPointerException("hello");});
out.println(" world");
es.execute(() -> {throw new NullPointerException("hello");});

} finally {
es.shutdown();
}

}}


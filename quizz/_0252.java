package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0252 {

static void job1() {
for(int i=0;i<5;i++) {
out.println("job1 " + i);
}
}
static void job2() {
for(int i=0;i<5;i++) {
out.println("job2 " + i);
}
}
static void job3() {
for(int i=0;i<5;i++) {
out.println("job3 " + i);
}
}

public static void main(String... args) {

ExecutorService es = null;
try {
es = Executors.newSingleThreadExecutor();

es.execute(_0252::job1);
es.execute(_0252::job2);
out.println("d");

} finally {
es.shutdown();
es.execute(_0252::job3);
}

}}


package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0253 {

static int jobCounter = 0;

static void job() {
String j = "job"+jobCounter++;
for(int i=0;i<5;i++) {
out.println(j + " : " + i);
}
}

public static void main(String... args) {

ExecutorService es = null;
try {
es = Executors.newSingleThreadExecutor();
for(int j=0;j<3;j++) {
es.execute(_0253::job);
}

} finally {
boolean result = es.shutdownNow();
out.println(result);
}

}}


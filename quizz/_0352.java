package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;

public class _0352 {

static List<Integer> sharedList = Collections.synchronizedList(
	Arrays.asList(1,1,1,1,1));

static void incrementFirst() {
	Integer tmp = sharedList(0);
	tmp++;
}

public static void main(String... args) throws InterruptedException {

ExecutorService es = Executors.newCachedPoolExecutor();
try {
for(int i=0;i<500;i++) {
es.execute(_0352::incrementFirst);
}
out.println(sharedList(0));
} finally {
es.shutdown();
}

}}

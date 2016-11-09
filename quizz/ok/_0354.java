package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;

public class _0354 {

static List<Integer> sharedList = Collections.synchronizedList(
	Arrays.asList(1,1,1,1,1));

static void incrementFirst() {
	Integer tmp = sharedList.get(0);
	tmp++;
	sharedList.set(0,tmp);
}

public static void main(String... args) throws InterruptedException {

ExecutorService es = Executors.newCachedThreadPool();
try {
for(int i=0;i<500;i++) {
es.execute(_0354::incrementFirst);
}
out.println(sharedList.get(0));
} finally {
es.shutdown();
}

}}

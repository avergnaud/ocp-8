package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0251 {

public static void main(String... args) throws InterruptedException {
ExecutorService es = Executors.newSingleThreadExecutor();

String[] letters = {"A","B","C","D"};

es.execute(()->{for(String s : letters)
		out.println(s);});
es.execute(()->{for(int i=0;i<4;i++)
		out.println(i);});
out.println("done");
}
}


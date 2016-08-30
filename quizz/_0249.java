package quizz;

import static java.lang.System.out;
import java.concurrent.*;

public class _0249 {

public static void main(String... args) throws InterruptedException {

ExecutorService es = Executors.getSingleThreadExecutor();

String[] letters = {"A","B","C","D"};

es.execute(()->{for(String s : letters)
		out.println(s);});
es.execute(()->{for(int i=0;i<4;i++)
		out.println(i);});
out.println("done");

}
}


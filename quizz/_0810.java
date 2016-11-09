package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0810 {

public static void main(String... args) {

BlockingDeque<String> bd = new LinkedBlockingDeque<>();
bd.offer("toto",1,TimeUnit.NANOSECONDS);
bd.offer("tete",1,TimeUnit.NANOSECONDS);
bd.offer("tata",1,TimeUnit.NANOSECONDS);

out.println(bd);

}}


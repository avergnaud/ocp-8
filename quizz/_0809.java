package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0809 {

public static void main(String... args) {

BlockingDeque<String> bd = new LinkedBlockingDeque<>();
bd.add("toto",1,TimeUnit.NANOSECONDS);
bd.add("tete",1,TimeUnit.NANOSECONDS);
bd.add("tata",1,TimeUnit.NANOSECONDS);

out.println(bd);

}}


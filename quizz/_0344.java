package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;

public class _0344 {
public static void main(String... args) throws InterruptedException {

LinkedBlockingDeque<String> lbd = new LinkedBlockingDeque<>();

out.println("is there someone: " + lbd.peek());
lbd.offer("Henri");
lbd.offerLast("Georges",10,TimeUnit.SECONDS);
lbd.offerFirst("Sam");
out.println("next: " + lbd.poll(2,TimeUnit.MILLISECONDS));

}}

package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;

public class _0340 {
public static void main(String... args) {

Deque<String> lbd = new LinkedBlockingDeque<>(5);
for(int i=0;i<=5;i++) {
lbd.offer("hi"+i);
}
out.println(lbd);

}}

package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;

public class _0342 {
public static void main(String... args) {

Deque<String> lbd = new LinkedBlockingDeque<>(5);

for(int i=0;i<5;i++) {
lbd.push("hi"+i);
}
out.println(lbd);

for(int i=0;i<=5;i++) {
out.println(lbd.pop());
}

}}

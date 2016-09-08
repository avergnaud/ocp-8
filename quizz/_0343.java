package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;

public class _0343 {
public static void main(String... args) {

Deque<String> lbd = new LinkedBlockingDeque<>();

for(int i=0;i<3;i++) {
lbd.push("hi");
}
out.println(lbd);

lbd.remove("hi");
out.println(lbd);

}}

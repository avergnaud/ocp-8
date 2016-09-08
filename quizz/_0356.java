package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0356 {
public static void main(String... args) {

LinkedList<String> ll = new LinkedList<>();
ll.offer("Serge");
ll.offer("Henri");
ll.offer("Pierre");
ll.offer(null);
ll.offer("Jon Jon");
while(ll.size() != 0)
	out.println(ll.poll());

}}

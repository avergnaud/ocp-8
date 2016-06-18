package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0078 {

public static void main(String... args) {

Deque<String> someQueue = new LinkedList<>();

someQueue.offer("one");

out.println(someQueue.poll());
out.println(someQueue.poll());

}
}

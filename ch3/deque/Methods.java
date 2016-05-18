package ch3.deque;

import java.util.*;
import static java.lang.System.*;

public class Methods {
public static void main(String[] args) {

// As Deque
Deque<String> myDeque = new ArrayDeque<String>();
boolean ok = myDeque.offerLast("Serge");
ok = myDeque.offerLast("Antonin");
ok = myDeque.offerLast("Maurice");
out.println(myDeque.pollFirst());
out.println(myDeque.pollFirst());
out.println(myDeque.removeFirst());
try {
out.println(myDeque.removeFirst());
} catch(NoSuchElementException e) {}

out.println("###############################");
// As Queue
Queue<String> myQueue = new ArrayDeque<String>();
myQueue.offer("Gaston");
myQueue.offer("Richard");
myQueue.offer("Albert");
out.println(myQueue.peek());
out.println(myQueue.poll());
out.println(myQueue.element());
out.println(myQueue.remove());
try {
out.println(myQueue.remove());
out.println(myQueue.remove());
} catch(NoSuchElementException e) {}

out.println("###############################");
// As Stack
ArrayDeque<String> myAD = new ArrayDeque<String>();
myAD.push("Toto");
out.println(myAD.peek());
out.println(myAD.pop());
try {
out.println(myAD.pop());
} catch(NoSuchElementException e) {}

}
}

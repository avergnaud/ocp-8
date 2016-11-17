package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;


public class _0604 {

public static void main(String... args) {

Deque<String> d1 = new ArrayDeque<>();
try {
d1.add(null);
} catch(NullPointerException e) {out.println("null not allowed in ArrayDeque");}

Deque<String> d2 = new ConcurrentLinkedDeque<>();
try {
d2.add(null);
} catch(NullPointerException e) {out.println("null not allowed in ConcurrentLinkedDeque");}

Deque<String> d3 = new LinkedBlockingDeque<>();
try {
d3.add(null);
} catch(NullPointerException e) {out.println("null not allowed in LinkedBlockingDeque");}



}}


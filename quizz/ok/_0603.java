package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;


public class _0603 {

public static void main(String... args) {

Queue<String> q1 = new ConcurrentLinkedQueue<>();
try {
q1.add(null);
} catch (NullPointerException e) {out.println("null not allowed in ConcurrentLinkedQueue");}
Queue<String> q2 = new LinkedBlockingQueue<>();
try {
q2.add(null);
} catch (NullPointerException e) {out.println("null not allowed in LinkedBlockingQueue");}

}}


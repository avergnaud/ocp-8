package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;


public class _0606 {

class MyObj {
	int i;
	MyObj(int i) {this.i = i;}
}

static int comp(MyObj m1, MyObj m2) {
	if(m1 == null) return -1;
	if(m2 == null) return 1;
	if(m1 == null && m2 == null) return 0;
	return m1.i - m2.i;
}

static int comp2(MyObj m1, MyObj m2) {
	return m1.i - m2.i;
}

public static void main(String... args) {

Set<String> s1 = new HashSet<>();
s1.add(null);
out.println("HashSet allow nulls");

Set<String> s2 = new TreeSet<>();
try {
s2.add(null);
} catch(NullPointerException e) {out.println("TreeSet of comparable elements does NOT allow nulls");}

Set<MyObj> s4 = new TreeSet<>(_0606::comp);
s4.add(null);
out.println("TreeSet with comparator that handle null elements does allow nulls");

Set<MyObj> s41 = new TreeSet<>(_0606::comp2);
try {
s41.add(null);
} catch(NullPointerException e) {out.println("TreeSet with comparator that does not handle null elements does NOT allow nulls");}

Set<String> s5 = new ConcurrentSkipListSet<>();
try {
s5.add(null);
} catch(NullPointerException e) {out.println("ConcurrentSkipListSet of comparable elements does NOT allow nulls");}

Set<MyObj> s7 = new ConcurrentSkipListSet<>(_0606::comp);
try {
s7.add(null);
} catch(NullPointerException e) {out.println("ConcurrentSkipListSet with any comparator does NOT allow nulls either");}

Set<String> s8 = new CopyOnWriteArraySet<>();
s8.add(null);
out.println("CopyOnWriteArraySet does allow nulls");


}}


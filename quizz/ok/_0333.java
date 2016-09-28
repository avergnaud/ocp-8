package quizz;

import static java.lang.System.out;
import java.util.*;

class SomeBean {
public boolean equals(Object another) {
return true;
}
}

public class _0333 {
public static void main(String... args) {

Deque<SomeBean> myDeque = new ArrayDeque<>();
myDeque.add(new SomeBean());
myDeque.add(new SomeBean());
myDeque.add(new SomeBean());

Object o = new SomeBean();
myDeque.remove(o);
out.println(myDeque.size());

}}

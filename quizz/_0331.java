package quizz;

import static java.lang.System.out;
import java.util.*;

class SomeBean {
public boolean equals(Object another) {
return true;
}
}

public class _0331 {
public static void main(String... args) {

Set<SomeBean> mySet = new HashSet<>();
mySet.add(new SomeBean());
mySet.add(new SomeBean());
mySet.add(new SomeBean());

Object o = new SomeBean();
mySet.remove(o);
out.println(mySet.size());

}}

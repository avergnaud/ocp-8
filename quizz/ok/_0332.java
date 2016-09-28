package quizz;

import static java.lang.System.out;
import java.util.*;

class SomeBean {
public boolean equals(Object another) {
return true;
}
}

public class _0332 {
public static void main(String... args) {

List<SomeBean> myList = new ArrayList<>();
myList.add(new SomeBean());
myList.add(new SomeBean());
myList.add(new SomeBean());

Object o = new SomeBean();
myList.remove(o);
out.println(myList.size());

}}

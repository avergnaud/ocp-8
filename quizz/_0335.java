package quizz;

import static java.lang.System.out;
import java.util.*;

/*
Note that the ordering maintained by a sorted set (whether or not an explicit comparator 
is provided) must be consistent with equals if the sorted set is to correctly implement 
the Set interface. (See the Comparable interface or Comparator interface for a precise 
definition of consistent with equals.) This is so because the Set interface is defined 
in terms of the equals operation, but a sorted set performs all element comparisons 
using its compareTo (or compare) method, so two elements that are deemed equal by 
this method are, from the standpoint of the sorted set, equal. The behavior of a sorted 
set is well-defined even if its ordering is inconsistent with equals; it just fails to 
obey the general contract of the Set interface.
*/

class SomeBean implements Comparable<SomeBean> {

int age;
String name;

public SomeBean(int age, String name) {
this.age = age;
this.name = name;
}

public int compareTo(SomeBean other) {
return this.age - other.age;/*what is that order?*/
}

/*not consistent*/
public boolean equals(Object other) {
if(!(other instanceof SomeBean)) {
return false;
}//end if
SomeBean otherBean = (SomeBean) other;
return this.name.equals(otherBean.name);
}//end equals

public String toString() {
return name;
}
}

public class _0335 {
public static void main(String... args) {

Set<SomeBean> mySet = new TreeSet<>();
mySet.add(new SomeBean(23,"Albert"));
mySet.add(new SomeBean(20,"Serge"));
mySet.add(new SomeBean(21,"Henri"));
mySet.add(new SomeBean(22,"Henri"));/*Set contract broken*/
out.println(mySet);

/*equals overriden but not hashcode*/
Set<SomeBean> otherSet = new HashSet<>();
otherSet.add(new SomeBean(23,"Albert"));
otherSet.add(new SomeBean(20,"Serge"));
otherSet.add(new SomeBean(21,"Henri"));
otherSet.add(new SomeBean(22,"Henri"));/*Set contract broken*/

out.println(otherSet.size());
out.println(otherSet.contains(new SomeBean(22,"Henri")));


}}

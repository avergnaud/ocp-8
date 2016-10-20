package quizz;

import java.util.*;
import java.util.stream.Collectors;

class MyBean {
private String name;
public MyBean(String name) {
this.name = name;
}
public String getName() {
return name;
}
}

public class _0129 {
public static void main(String... args) {

List<MyBean> liste = Arrays.asList(
new MyBean("one"),
new MyBean("two"),
new MyBean("three"),
new MyBean("four"),
new MyBean("last")
);

Map<String,MyBean> map = liste.stream()
	.collect(Collectors.toMap(
		myBean->myBean.getName(),
		myBean->myBean));

System.out.println(map);

}}

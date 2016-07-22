package ch4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

class MyBean {
private String name;
public MyBean(String name) {
this.name = name;
}
public String getName() {
return name;
}
}

public class SOEx {
public static void main(String... args) {

List<MyBean> liste = Arrays.asList(
new MyBean("one"),
new MyBean("two"),
new MyBean("three"),
new MyBean("four"),
new MyBean("last")
);

Map<String,MyBean> map = liste.stream()
	.collect(Collectors.toMap(MyBean::getName, Function.identity()));

System.out.println(map);

}}

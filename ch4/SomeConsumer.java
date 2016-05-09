package ch4;

import java.util.function.*;
import java.util.*;

public class SomeConsumer {
public static void main(String... args) {

List<String> some = new ArrayList<String>();
some.add("hello");
some.add("world");

Consumer<String> c = s -> System.out.println(s);
c = System.out::println;

some.forEach(c);

//put k and v in map using BiConsumer

Map<Integer,String> myMap = new TreeMap<Integer,String>();
BiConsumer<Integer,String> bic = myMap::put;

bic.accept(1,"un");
bic.accept(2,"deux");

System.out.println(myMap);

}
}
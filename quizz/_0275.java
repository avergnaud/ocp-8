package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0275 {

public static void main(String... args) {

// enhanced for loop can iterate over a Map ?

Map<Integer,String> myMap = new HashMap<>();
myMap.put(1,"un");
myMap.put(2,"deux");
myMap.put(3,"trois");

for(Map.Entry<Integer,String> entry : myMap.entrySet()) {
out.println(entry.getKey() + " " + entry.getValue());
}

}
}

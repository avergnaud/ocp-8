package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0056 {

public static void main(String... args) {

Map<String,String> lol = new HashMap<>();
lol.put(null,"some value");

lol.putIfAbsent(null,"another");

out.println(lol);


}
}

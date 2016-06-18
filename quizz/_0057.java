package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0057 {

public static void main(String... args) {

Map<String,String> lol = new HashMap<>();
lol.put(null,"some value");

lol.putIfAbsent("e",null);

out.println(lol);


}
}

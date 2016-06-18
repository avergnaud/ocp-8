package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.function.*;

public class _0059 {

public static void main(String... args) {

Map<String,String> lol = new HashMap<>();
lol.put("a","123");

BiFunction<String,String,String> func = (k,v) -> null;

lol.compute("a",func);

out.println(lol);

}
}

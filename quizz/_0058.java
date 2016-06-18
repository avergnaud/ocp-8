package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.function.*;

public class _0058 {

public static void main(String... args) {

Map<String,String> lol = new HashMap<>();
lol.put(null,"123");

BiFunction<String,String> func = (k,v) -> v+"abc";

lol.compute(null,func);

out.println(lol);

}
}

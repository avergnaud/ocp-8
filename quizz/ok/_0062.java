package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.function.*;

public class _0062 {

public static void main(String... args) {

Map<String,String> lol = new HashMap<>();

lol.put(null,null);

BiFunction<String,String,String> bf = (k,v)-> "hello";

lol.compute(null,bf);

out.println(lol);

}
}

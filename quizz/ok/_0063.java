package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.function.*;

public class _0063 {

public static void main(String... args) {

Map<String,String> lol = new HashMap<>();

lol.put("1","one");

lol.merge("1","new one",(existante,nouvelle)->nouvelle);

out.println(lol);

}
}

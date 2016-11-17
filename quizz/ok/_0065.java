package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.function.*;

public class _0065 {

public static void main(String... args) {

Map<String,String> lol = new HashMap<>();

lol.put("1","one");

lol.merge("1",null,(existante,nouvelle)->"merged");

out.println(lol);

}
}

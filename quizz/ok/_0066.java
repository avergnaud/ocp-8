package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.function.*;

public class _0066 {

public static void main(String... args) {

Map<String,String> lol = new HashMap<>();

lol.put("1",null);

lol.merge("1","new",(existante,nouvelle)->"merged");

out.println(lol);

}
}

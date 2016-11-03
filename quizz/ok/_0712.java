package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0712 {

/* map forEach */
public static void main(String... args) {

Map<Integer,String> map = new HashMap<>();
map.put(1,"un");
map.put(2,"deux");
map.put(3,"trois");

map.forEach((k,v)->out.println(k+v));

}}

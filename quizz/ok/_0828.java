package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0828 {

public static void main(String... args) {

Map<Integer,String> map = new HashMap<>();
map.put(1,"un");
map.put(2,"deux");
map.put(3,"trois");
map.put(4,"quatre");

map.compute(5,"cinq",(k,v)->v);
out.println(map);

}}


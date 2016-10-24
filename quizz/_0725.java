package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.function.*;
import java.util.*;

public class _0725 {

public static void main(String... args) {

Map<Integer,String> map = new HashMap<Integer,String>() {
  {
    put(1,"un");
      put(2,"deux");
        put(3,"trois");
          put(4,"quatre");
  }
};

Object o = 5;

map.remove(3);

String s = map.getOrDefault(o,"cinq");

out.println(s);
out.println(map);

}}

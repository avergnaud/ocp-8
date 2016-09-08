package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;

public class _0347 {
public static void main(String... args) throws InterruptedException {

Map<String,Integer> map = new CopyOnWriteArrayMap<>();
map.put("one",1);
map.put("two",2);
out.println(map);

}}

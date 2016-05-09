package ch3.mapmethods;

import java.util.*;

public class Suite {
public static void main(String... args) {
Map<String,Integer> my = new HashMap<>();
my.put("J",1);
my.put("A",2);

/* V put(K, V) */
my.put("A",3);

/* V putIfAbsent(K,V) */
my.put(null,0);
my.putIfAbsent(null,1);
System.out.println(my);

/* V merge(K,V, BiFunction<? super V, ? super V, ? extends V> ) */
my.merge("A",4,(ancienne,nouvelle)->nouvelle - ancienne);
System.out.println(my);

/* V compute(K, BiFunction<? super K, ? super V, ? extends V>) */
my.compute("J", (cle,valeur) -> valeur +1);
System.out.println(my);
}
}
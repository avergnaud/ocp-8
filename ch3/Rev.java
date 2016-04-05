package ch3;
import java.util.*;
import java.util.function.*;
public class Rev {
public static void main(String... args) {

//merge
//merge(K,V,BiFunction<? super V, ? super V, ? extends V>)

Map<Integer,String> nombres = new HashMap<>();
nombres.put(1,"un");
nombres.put(2,"deux");
System.out.println(nombres);

nombres.merge(2,"nouvelle",(ancien,nouveau)->ancien+nouveau);
System.out.println(nombres);

//computeIfPresent
//computeIfPresent(K,BiFunction<? super K,? super V,? extends V>)


}
}
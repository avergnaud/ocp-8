package ch3.mapmethods;

import java.util.*;
import java.util.function.*;
import static java.lang.System.*;

public class MergeMad {
public static void main(String... args) {

reminder(2);//Box then IS-A

Map<Number,String> my = new HashMap<>();
my.put(0,null);
my.put(null,null);
my.put(1,"one");

BiFunction<String,String,String> mergeFunc = 
	(a,b)-> a.length()>b.length()?a:b;

//out.println(my);
my.merge(null,"null value",mergeFunc);


out.println("[L1]" + my);

mergeFunc = (a,b) -> null;

//La BiFunction merge n'est pas appelée si la valeur est null
my.merge(0,"zero",mergeFunc);
out.println("[L2]" + my);

//Si la BiFunction return null alors la mapEntry est supprimée
my.merge(0,"ZERO",mergeFunc);
out.println("[L3]" + my);

//La BiFunction merge n'est pas appelée si la clé n'existe pas
my.merge(0,"ZERO",mergeFunc);
out.println("[L4]" + my);
}

static void reminder(Number n) {}

}
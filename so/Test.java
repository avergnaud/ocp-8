package so;

import java.util.stream.*;
import java.util.*;
import static java.lang.System.out;

class Item implements Comparable<Item> {

Integer id;
String some;

public int compareTo(Item other) {
	return this.some.compareTo(other.some);
}

static Item of(Integer id, String some) {
Item item = new Item();
item.id = id;
item.some = some;
return item;
}

}

public class Test {
public static void main(String... args) {

List<Item> myList = Arrays.asList(Item.of(1,"one"), Item.of(1,"1"), Item.of(2,"two"), Item.of(3,"3"));

LinkedHashMap<Integer,List<Item>> myMap = myList
	.stream()
	.collect(
		Collectors.groupingBy(item-> item.id,
					LinkedHashMap::new,
					Collectors.toList())
	);

out.println(myMap);

}}//Assurance Auto - Nouvelle Voiture Aiguilleur
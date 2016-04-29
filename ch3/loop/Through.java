package ch3.loop;

import java.util.*;

class Through {
public static void main(String... args) {

List<String> liste = Arrays.asList("one", "two", "three");

for(String s : liste);

Iterator<String> it = liste.iterator();
while(it.hasNext()) {
	it.next();
}

it = liste.iterator();
for(;it.hasNext();it.next());

}
}
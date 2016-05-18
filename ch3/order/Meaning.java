package ch3.order;

import java.util.*;

class Duck implements Comparable<Duck> {

int score;

public Duck(int i) {score = i;}

public int compareTo(Duck other) {
	return score - other.score;
}

public boolean equals(Object o) {
	if(! (o instanceof Duck)) {
		return false;
	} else {
		Duck other = (Duck) o;
		return score == other.score;	
	}
}

public String toString() {
	return "duck_" + score;
}

}

public class Meaning {
public static void main(String[] args) {
Duck duck1 = new Duck(1);
Duck duck2 = new Duck(2);
Duck duck3 = new Duck(3);
Duck duck4 = new Duck(4);
List<Duck> liste = Arrays.asList(duck1,duck2,duck3,duck4);

System.out.println(liste);

Collections.sort(liste);

System.out.println(liste);

/*"supérieur" signifie "prioritaire" ? NON
"supérieur signifie "vient après"
cf [1,2,3,4,5]
cf [1,2,A,B,C,a,b,c]in
*/

}
}

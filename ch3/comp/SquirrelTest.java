package ch3.comp;

import java.util.Comparator;

public class SquirrelTest {
public static void main(String... args) {

}
}

class Squirrel {
private String species;
private int weight;
public Squirrel(String species) {
if(species == null || "".equals(species)) {
	throw new IllegalArgumentException("species must be specified");
}
this.species = species;
}
public String getSpecies() {
	return species;
}
public void setWeight(int weight) {
if(weight < 0) {
	throw new IllegalArgumentException("weight must be positive");
}
this.weight = weight;
}
public int getWeight() {
	return weight;
}
}

class SquirrelComparator1 implements Comparator<Squirrel> {
public int compare(Squirrel one, Squirrel two) {
int speciesScore = one.getSpecies().compareTo(two.getSpecies());
if(speciesScore != 0) {
	return speciesScore;
}
return one.getWeight() - two.getWeight();
}
}

class SquirrelComparator2 implements Comparator<Squirrel> {
public int compare(Squirrel one, Squirrel two) {

}
}
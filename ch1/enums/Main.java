package ch1.enums;

public class Main {
public static void main(String... args) {
System.out.println(Saison.ETE);
System.out.println(Saison.ETE.name());
System.out.println(Saison.ETE.ordinal());
for(Saison saison : Saison.values()) {
	System.out.println(saison);
}
}
}
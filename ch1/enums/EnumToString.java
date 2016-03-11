package ch1.enums;
import static java.lang.System.*;

enum Saison {
	PRINTEMPS,ETE,AUTOMNE,HIVER

	/*public String toString() {
		return "toto";
	}*/
}

public class EnumToString {
public static void main(String... args) {
out.println(Saison.ETE);
}
}
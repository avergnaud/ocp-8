package ch1.enums;
import static java.lang.System.*;

enum Saison {
	PRINTEMPS, ETE, AUTOMNE, HIVER
}

public class Attention {
public static void main(String... args) {

Saison ete = Saison.ETE;

switch(ete) {
	/*case Saison.ETE:
	error: an enum switch case label must be the unqualified name 
	of an enumeration constant*/
	case ETE:
		out.println("c'ets l'été");
}

}
}
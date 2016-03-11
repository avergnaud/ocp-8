package ch1.enums;
import static java.lang.System.*;

enum Saison {

PRINTEMPS("spring"), ETE("été"), AUTOMNE("fall") {
	public String getWhat() {
		return "winter is next";
	}
}
, HIVER("winter");

private String what;

private Saison(String what) {this.what = what;}

public String getWhat() {
	return "I'm a season";
}

}

public class StateFulOne {
public static void main(String... args) {
	for(Saison saison : Saison.values()) {
		out.println(saison.getWhat());
	}
}
}
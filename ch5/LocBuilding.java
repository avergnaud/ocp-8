package ch5;

import java.util.Locale;
import static java.lang.System.out;

public class LocBuilding {
public static void main(String... args) {

Locale current = Locale.getDefault();
out.println(current);//fr_FR

Locale english = new Locale("en");
out.println(english);

Locale englishInUS = new Locale("en","US");
out.println(englishInUS);

Locale deutsch = new Locale.Builder()
	.setLanguage("de")
	.setRegion("DE")
	.build();
out.println(deutsch);

}}

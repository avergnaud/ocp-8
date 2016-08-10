package ch5;

import java.util.Locale;
import static java.lang.System.out;

public class Loc {
public static void main(String... args) {

Locale ici = new Locale("fr","FR");
out.println(ici);

ici = new Locale.Builder()
	.setLanguage("fr")
	.setRegion("FR")
	.build();
out.println(ici);

}}

package quizz;

import static java.lang.System.out;

import java.util.Locale;

public class _0156 {
public static void main(String... args) {

Locale locale = new Locale("fr_FR");
out.println(locale);

locale = new Locale.Builder()
	.setLanguage("fr")
	.setCoutry("FR")
	.build();
out.println(ici);

}}

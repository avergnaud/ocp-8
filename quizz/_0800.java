package quizz;

import static java.lang.System.out;
import java.text.*;
import java.util.*;

public class _0800 {

public static void main(String... args) {

Locale locale = new Locale.Builder()
	.setLanguage("en")
	.setRegion("US")
	.build();

NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

out.println(nf.format(1_500));

}}

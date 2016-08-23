package quizz;

import static java.lang.System.out;
import java.util.*;
import java.text.*;

public class _0181 {

public static void main(String... args) throws ParseException {

Locale fr = new Locale.Builder()
	.setLanguage("fr")
	.setRegion("FR")
	.build();

NumberFormat nf = NumberFormat.getInstance(fr);

String montant = "123.456";

out.println(nf.parse(montant));

}}



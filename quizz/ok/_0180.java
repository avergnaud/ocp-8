package quizz;

import static java.lang.System.out;
import java.util.*;
import java.text.*;

public class _0180 {

public static void main(String... args) {

Locale fr = new Locale.Builder()
	.setLanguage("fr")
	.setRegion("FR")
	.build();

CurrencyFormat nf = NumberFormat.getCurrencyInstance(fr);

double montant = 123.456;//better use BigDecimal

out.println(nf.format(montant));

}}



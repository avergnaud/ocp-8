package ch5.nmbrs;

import java.text.*;
import java.util.*;
import static java.lang.System.out;

public class FormatAndParse {
public static void main(String... args) {

double montant = 123.456;

Locale fr = new Locale("fr","FR");

NumberFormat nf = NumberFormat.getCurrencyInstance(fr);

out.println(nf.format(montant));

}}

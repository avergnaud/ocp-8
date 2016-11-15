package quizz;

import static java.lang.System.out;
import java.util.*;
import java.text.*;

public class _0182 {

public static void main(String... args) throws ParseException {

Locale locale = new Locale("en","US");
NumberFormat format = NumberFormat.getCurrencyInstance(locale);
Double value = format.parse("$5.45");
out.println(value);

}}



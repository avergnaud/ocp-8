package quizz;

import static java.lang.System.out;
import java.util.*;
import java.text.*;

public class _0184 {

public static void main(String... args) throws ParseException {

Locale locale = new Locale("fr","FR");
NumberFormat format = NumberFormat.getCurrencyInstance(locale);
Number value = format.parse("5,45 €###");
out.println(value);

}}



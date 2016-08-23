package quizz;

import static java.lang.System.out;
import java.text.*;
import java.util.*;

public class _0187 {

public static void main(String... args) throws ParseException {

Locale locale = new Locale("fr","FR");
NumberFormat nf = NumberFormat.getPercentInstance();
double d = nf.parse("50 %MMMMMMMMMMMM");
out.println(d);
}
}



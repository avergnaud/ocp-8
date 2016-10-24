package quizz;

import static java.lang.System.out;
import java.time.*;
import java.text.*;

public class _0543 {

void m1() {
throw new java.lang.NumberFormatException();
}
void m2() throws java.text.ParseException {
throw new java.text.ParseException("",0);
}
void m3() {
throw new java.time.format.DateTimeParseException("","",0);
}

public static void main(String... args) {

try {
NumberFormat nf = NumberFormat.getInstance();
nf.parse("lol");
} catch(java.text.ParseException e) {
out.println("java.text.ParseException");
}

try {
Integer i = Integer.valueOf("lol");
} catch (java.lang.NumberFormatException e) {
out.println("java.lang.NumberFormatException");
}

try {
String dateTime = "toto";
ZonedDateTime d = ZonedDateTime.parse(dateTime);
} catch (java.time.format.DateTimeParseException e) {
out.println("java.time.format.DateTimeParseException");
}

}}

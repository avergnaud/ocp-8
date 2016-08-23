package ch6;

import java.text.*;
import java.time.*;
import java.time.format.*;
import static java.lang.System.out;

public class FormatExceptions {
public static void main(String... args) {

// runtime, thrown by program
try {
Double d = new Double("toto");
} catch (NumberFormatException e) {
out.println("NFE");
}

//checked, thrown by JVM
try {
NumberFormat nf = NumberFormat.getInstance();
nf.parse("toto");
} catch (ParseException e) {
out.println("Parse");
}

//runtime, thrown by JVM
try {
DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
dtf.parse("toto");
} catch (DateTimeException e) {
out.println("DateTimeException");
}

}}

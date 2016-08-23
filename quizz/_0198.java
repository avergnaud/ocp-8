package quizz;

import static java.lang.System.out;
import java.time.*;

public class _0198 {

public static void main(String... args) throws ParseException {

try {
DateTimeFormat dtf = DateTimeFormat.ISO_LOCAL_DATE_TIME;
dtf.parse("toto");
} catch (DateTimeFormatException e) {
out.println("DateTimeFormatException");
}

}
}



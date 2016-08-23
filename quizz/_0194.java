package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.format.*;

public class _0194 {

public static void main(String... args) {

String s = "2016-08-19T17:58:34.624";

DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

LocalDateTime ldt = (LocalDateTime)dtf.parse(s);

out.println(ldt);
/*http://stackoverflow.com/questions/25735583/parse-iso-timestamp-using-java-8-java-time-api-standard-edition-only*/
}
}



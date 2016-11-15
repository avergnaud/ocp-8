package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.format.*;

public class _0193 {

public static void main(String... args) {

String s = "2016-08-19T17:58:34.624";

DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

LocalDateTime ldt = dtf.parse(s);

out.println(ldt);

}
}



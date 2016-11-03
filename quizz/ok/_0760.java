package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.format.*;

public class _0760 {

public static void main(String... args) {

DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_TIME;
LocalTime lt = (LocalTime) dtf.parse("15:28");
out.println(lt);

}}

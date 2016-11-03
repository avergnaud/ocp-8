package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.format.*;

public class _0766 {

public static void main(String... args) {

DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

LocalDateTime ldt = LocalDateTime.parse("28/10/2016 02:23:00",dtf);

out.println(ldt);

}}

package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.format.*;

public class _0764 {

public static void main(String... args) {

LocalDateTime ldt = LocalDateTime.of(2016,Month.OCTOBER,28,14,23);
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
out.println(ldt.format(dtf));

}}

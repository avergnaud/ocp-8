package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.format.*;

public class _0747 {
public static void main(String... args) {

LocalDate ld = LocalDate.of(2016,Month.OCTOBER,5);
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
out.println(ld.format(dtf));

ld = LocalDate.of(2016,Month.OCTOBER,24);
DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MM/yyyy");
out.println(ld.format(dtf2));

}}

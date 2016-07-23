package quizz;

import java.time.*;
import static java.lang.System.out;

public class _0151 {
public static void main(String... args) {

//dans la nuit du 26 au 27, à 2H il sera 3H

ZoneId paris = ZoneId.of("Europe/Paris");
LocalDate j = LocalDate.of(2016,Month.MARCH,26);
LocalTime apresLt = LocalTime.of(2,30);

ZonedDateTime apres = ZonedDateTime.of(j,apresLt,paris);

out.println(apres);

}}

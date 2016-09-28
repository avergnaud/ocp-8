package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class _0082 {

public static void main(String... args) {

//Pacific/Auckland
//America/Sao_Paulo

ZoneId auckland = ZoneId.of("Pacific/Auckland");
LocalDateTime aucklandLDT = LocalDateTime.now(auckland).minusHours(1);
ZonedDateTime aucklandZDT = ZonedDateTime.of(aucklandLDT,auckland);

ZoneId saoPaulo = ZoneId.of("America/Sao_Paulo");
LocalDateTime saoPauloLDT = LocalDateTime.now(saoPaulo).plusHours(3);
ZonedDateTime saoPauloZDT = ZonedDateTime.of(saoPauloLDT,saoPaulo);

out.println(aucklandZDT.until(saoPauloZDT,ChronoUnit.HOURS));

}
}

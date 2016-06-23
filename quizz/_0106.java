package quizz;

import static java.lang.System.out;
import java.time.*;
import java.util.*;

public class _0106 {
public static void main(String... args) {

Set<String> zones = ZoneId.getAvailableZoneIds();
String moscou = zones.stream()
	.filter(s->s.contains("Mosc"))
	.findAny()
	.get();//we know for sure

ZoneId moscowZoneId = ZoneId.of(moscou);

ZonedDateTime moscow = ZonedDateTime.of(
	LocalDateTime.now(moscowZoneId),
	moscowZoneId);

out.println(ChronoUnit.HOURS instanceof TemporalUnit);

out.println(
	ChronoUnit.HOURS.between(
		ZonedDateTime.now(),
		moscow));

}
}
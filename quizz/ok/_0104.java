package quizz;

import static java.lang.System.out;
import java.time.*;
import java.util.*;

public class _0104 {
public static void main(String... args) {

Set<String> zones = ZoneId.getAvailableZoneIds();
String moscou = zones.stream()
	.filter(s->s.contains("Mosc"))
	.findAny();

out.println(moscou);

}
}
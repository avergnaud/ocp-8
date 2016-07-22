package quizz;

import java.time.*;
import static java.lang.System.out;

public class _0147 {
public static void main(String... args) {

ZoneId sp = ZoneId.of("America/Sao_Paulo");
ZonedDateTime zdt = ZonedDateTime.of(2016,Month.JANUARY,1,12,10,15,0,sp);
out.println(zdt);

}}

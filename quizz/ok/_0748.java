package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.format.*;

public class _0748 {
public static void main(String... args) {

LocalDate ld = LocalDate.of(2016,Month.OCTOBER,5);
Period p = Period.ofMonths(2).ofDays(1);
out.println(ld.plus(p));

p = Period.ofMonths(1).plusDays(1);
out.println(ld.plus(p));

}}

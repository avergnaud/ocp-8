package ch5;

import java.time.LocalDate;
import java.time.Period;
import java.time.Month;
import static java.lang.System.out;

public class Zoo {

private static void performAnimalEnrichment(LocalDate from, LocalDate to, Period period) {
LocalDate iterating = from;
while(iterating.isBefore(to)) {
out.println("give new toy " + iterating);
iterating = iterating.plus(period);
}
}

public static void main(String... args) {
LocalDate from = LocalDate.of(2016, Month.JANUARY, 15);
LocalDate to = LocalDate.of(2016, Month.MARCH, 16);
Period period = Period.ofWeeks(3);
performAnimalEnrichment(from,to,period);
}
}

package quizz;

import static java.lang.System.out;
import java.time.*;

public class _0086 {

public static void main(String... args) {

LocalDate ld = LocalDate.now();
ld.plusYears(1);

out.println(ld.getYear());

}
}
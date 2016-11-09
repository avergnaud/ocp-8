package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.temporal.*;

public class _0100 {
public static void main(String... args) {

LocalDate d1 = LocalDate.now();
Duration oneDay = Duration.ofDays(1);
out.println(d1.plus(oneDay));

}
}
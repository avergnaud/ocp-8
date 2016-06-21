package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.temporal.*;

public class _0097 {
public static void main(String... args) {

Duration d = Duration.of(1000_000_000,ChronoUnit.NANOSECONDS);
out.println(d);

}
}
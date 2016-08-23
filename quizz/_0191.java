package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.format.*;

public class _0191 {

public static void main(String... args) {

DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

out.println(LocalDateTime.now().format(dtf));

}
}



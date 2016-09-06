package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.function.*;

public class _0297 {

static void use(Callable aTask) {out.println("calling");}

static void use(Supplier supplier) {out.println("supplying");}

public static void main(String... args) {

use(String::new);

}}

package quizz;

import static java.lang.System.out;

public class _0365 {

static void throwing() throws Exception {
try {
throw new Exception("first one");
} finally {
throw new Exception("second one");
}
}

public static void main(String... args) {

try {
throwing();
} catch(Exception e) {
out.println(e.getMessage());
out.println(e.getCause());
for(Throwable t : e.getSuppressed()) {
out.println(t);
}
}
}}



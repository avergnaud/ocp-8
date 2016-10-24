package quizz;

public class _0246 {

static Runnable r = ()->"";

public static void main(String... args) {

Thread t = new Thread(r);
t.start();

}
}


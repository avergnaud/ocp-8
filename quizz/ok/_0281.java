package quizz;

import static java.lang.System.out;

interface I1 {
int i = 1;
void m();
}

interface I2 {
int i = 2;
void m();
}

public class _0281 implements I1, I2 {
  
public void m() {}

public static void main(String... args) {

_0281 a = new _0281();
out.println(a.i);

}
}

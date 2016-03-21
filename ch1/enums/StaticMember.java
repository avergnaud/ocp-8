package ch1;
import static java.lang.System.*;

enum Saison {
A,B,C;
static int print() {return 1;}
static int p = 1;
Saison() {
//out.println(p);
out.println(print());
}
}

public class StaticMember {
public static void main(String... args) {
Saison a = Saison.A;
}
}
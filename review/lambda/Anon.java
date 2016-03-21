package review.lambda;

import static java.lang.System.*;

public class Anon {
public static void main(String... args) {

int i = 0;

Object test = new Object() {
public String toString() {
/*i = 2;*/
return "hello " + i;
}
};

out.println(test);

}
}


/*http://stackoverflow.com/questions/4732544/why-are-only-final-variables-accessible-in-anonymous-class?lq=1*/
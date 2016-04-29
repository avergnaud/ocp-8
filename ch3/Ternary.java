package ch3;

public class Ternary {
public static void main(String... args) {

int a =false?true?1:true?2:3:true?4:true?5:6;
System.out.println("The value of a is " +a);

int i = 5;
String result = i % 2 == 0 ? "a" : i % 3 == 0 ? "b" : i % 5 == 0 ? "c" : i % 7 == 0 ? "d" : "e";
System.out.println("The value of result is " +result );

}
}

/*when confronted with nested ternary operators, Java starts evaluating the rightmost one and works its way left from there*/
package review.string;

class Question {
public static void main(String[] args) {
StringBuilder sb = new StringBuilder("bc");
String s = "abcd";
boolean b = s.contains(sb);
System.out.println(b);
}
}
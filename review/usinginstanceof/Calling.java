package review.usinginstanceof;

class Calling {
public static void main(String... args) {
Parent p = null;
System.out.println(p instanceof Enfant);
Enfant e = null;
System.out.println(e instanceof Parent);
System.out.println(e instanceof ABle);
System.out.println(e instanceof Autre);
}
}
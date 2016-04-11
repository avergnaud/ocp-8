package ch3.gens;

class Operation<N extends Number> {
<T> void add(N first, T second) {
System.out.println(first.doubleValue());
System.out.println(second.getClass());
}
}

public class RevisGen {
public static void main(String[] args) {
Operation<Integer> operation = new Operation<>();
operation.add(new Integer(1), "hello");
operation.<String>add(new Integer(2), "hello");

}
}
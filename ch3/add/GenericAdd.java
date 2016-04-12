package ch3.add;

public class GenericAdd {

	public static <N extends Number> long addTwo(N first, N second) {
		return first.longValue() + second.longValue();
	}

	public static

public static void main(String[] args) {
long res = addTwo(new Integer(2), new Integer(3));
System.out.println(res);
//res = GenericAdd.<Integer>addTwo(new Integer(2), new Integer(3));
}

}

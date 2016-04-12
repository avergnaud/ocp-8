package ch3.full.type_parameter;

class _1 {
//https://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.4

public static void main(String[] args) {
First<String> first = new First<>();
Second<String> second = new Second<String>() {};
//cannot use '<>' with anonymous inner classes
Third third = new Third();
third.<String>method();
third.method();
Fourth fourth = new <String>Fourth();
fourth = new Fourth();
}

}
/*A type variable is introduced by the declaration of a type parameter of a generic class, interface, method, or constructor */

class First <T> {}

interface Second <T> {}

class Third {
<T> void method() {}
}

class Fourth {
<T> Fourth() {}
}

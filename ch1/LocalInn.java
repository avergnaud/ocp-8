package ch1;
public class LocalInn {

interface MyInner {}

int i;

MyInner methode() {
	abstract class MyLocal implements MyInner {}
	final class MyOtherLocal extends MyLocal {}
	return new MyOtherLocal();
}

void autreMethode() {
	class I {
		I() {
			System.out.println(i);
			System.out.println(LocalInn.this.i); 
		}
	}
	new I();
}

public static void main(String... args) {
	new LocalInn().autreMethode();
}

}

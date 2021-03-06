package quizz;

import static java.lang.System.out;
import java.io.*;
import java.util.*;

class MyStuff implements Serializable {
	public static final long serialVersionUID = 1L;
	String name;
	{name = "Serge";}
	transient int age;
	MyStuff(String name,int age) {
		out.println("MyStuff created ");
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "[MyStuff," + name + "," + age + "] "; 
	}
}

public class _0448 {

static void persist(List<MyStuff> liste, File file) {
try(ObjectOutputStream oos = new ObjectOutputStream(
	new BufferedOutputStream(
		new FileOutputStream(file)));) {
for(MyStuff ms : liste) {
oos.writeObject(ms);
}
} catch(IOException e) {
out.println(e);
}
}

static List<MyStuff> getBack(File file) {
List<MyStuff> liste = new ArrayList<>();
try(ObjectInputStream ois = new ObjectInputStream(
	new BufferedInputStream(
		new FileInputStream(file)));) {

	while(true) {
		Object o = ois.readObject();
		if(o instanceof MyStuff) {	
			MyStuff m = (MyStuff)o;
			liste.add(m);
		}

	}
} catch(EOFException e) {
//end of file
} catch(IOException | ClassNotFoundException e) {
out.println(e);
}

return liste;
}

public static void main(String... args) {

List<MyStuff> ms = Arrays.asList(
	new MyStuff("toto",2),
	new MyStuff("chabo",3));
persist(ms, new File("0444.txt"));
ms = null;
List<MyStuff> then = getBack(new File("0444.txt"));
out.println(then);
}}

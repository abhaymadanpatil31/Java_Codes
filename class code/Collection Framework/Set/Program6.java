
import java.util.*;

class User implements Comparable {

	String str = null;
	User(String str) {
	
		this.str = str;
	}
	public int compareTo() {
	
		return.compareTo(obj.toString(this.str));
	}

	public String toString() {
	
		return str;
	}
}
class MyClass {

	public static void main(String[] rgs) {
	
		TreeSet obj = new TreeSet();
		obj.add("Abhay");
		obj.add("Avinash");
		obj.add("Abhay");
		System.out.println(obj);
		obj.add(new User("A"));
		obj.add(new user("B"));
		obj.add(new User("C"));

	}
}

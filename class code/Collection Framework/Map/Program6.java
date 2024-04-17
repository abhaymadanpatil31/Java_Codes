
import java.util.*;

class WeakHashMapDemo {

	String str;

	WeakHashMapDemo(String str) {
	
		this.str = str;
	}

}

class Client {

	public static void main(String[] args) {
	
		WeakHashMapDemo hm = new WeakHashMapDemo("Abhay");
		WeakHashMapDemo hm1 = new WeakHashMapDemo("Avi");
		WeakHashMapDemo hm2 = new WeakHashMapDemo("Om");
		
		WeakHashMap obj1 = new WeakHashMap();
			obj1.put(hm,23);
			obj1.put(hm1,23);
			obj1.put(hm2,23);
			System.out.println(obj1);//aply class madhe toString naslymule object cha address print hoto.
	}
}

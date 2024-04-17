
import java.util.*;

class Demo {

	String str;
	Demo(String str) {
	
		this.str = str;
	}

	public String toString() {
	
		return str;
	}

	public void finalize() {
	
		System.out.println("Notify");
	}
}

class GCDemo {

	public static void main(String[] args) {
	
		Demo obj1 = new Demo("Core2Web");
		Demo obj2 = new Demo("BienCaps");
		Demo obj3 = new Demo("Incubator");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println("In main");
		//obj1 = null;
		//System.gc();
		
		HashMap hm = new HashMap();
		hm.put(obj1,2016);//hm.put(obj1.toString()); asa call jato internally
		hm.put(obj2,2019);
		hm.put(obj3,2023);
		obj1 = null;
		System.gc();
		System.out.println(hm);
		System.out.println(hm);
	}
}

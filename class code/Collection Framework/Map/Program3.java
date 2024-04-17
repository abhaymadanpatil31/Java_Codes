
import java.util.*;

class HashMapDemo {

	public static void main(String[] args) {
	
		HashMap hm = new HashMap();
		hm.put("Java",".java");
		hm.put("Python",".py");
		hm.put("Dart",".dart");
		System.out.println(hm);

		//get-V get(Object);
		System.out.println(hm.get("Python")+" = "+"get");
		//keySet- Set<K> keySet();
		System.out.println(hm.keySet()+" = "+"KeySet");
		//values- Collection<v> values();
		System.out.println(hm.values()+" = "+"Values");
		//set<java.util.Map$Entry<k,v>> entrySet();
		System.out.println(hm.entrySet()+" = "+"entrySet()");
		//this program mainly for converting map to set.
	}
}

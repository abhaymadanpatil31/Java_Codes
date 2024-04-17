
import java.util.*;

class IteratorMapDemo {

	public static void main(String[] args) {
	
		SortedMap tm = new TreeMap();
		tm.put("Ind","India");
		tm.put("Pak","Pakistan");
		tm.put("SL","SriLanka");
		tm.put("Aus","Australia");
		tm.put("Ban","Bangladesh");
		System.out.println(tm);
		Set<Map.Entery> itr = tm.entrySet();
		Iterator<Map.Entry> itr = data.iterator();
		while(itr.hasNext()) {
		
			Map.Entry abc = itr.next();
			System.out.println(abc.getKey()+":"+ abc.getValue());
		}
	}
}

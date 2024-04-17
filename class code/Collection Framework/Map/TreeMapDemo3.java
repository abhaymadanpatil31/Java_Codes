
import java.util.*;

class SortedMapDemo {

	public static void main(String[] args) {
	
		SortedMap tm = new TreeMap();
		tm.put("Ind","India");
		tm.put("Pak","Pakistan");
		tm.put("Aus","Australia");
		tm.put("SL","SriLanka");
		tm.put("Ban","Bangladesh");
		System.out.println(tm);//{Aus=Australia,Ban=Bangladesh,Ind=India,Pak=Pakistan,SL=SriLanka}
		// subMap()
		System.out.println(tm.subMap("Aus","Pak"));//{from australia to india and not the pk bc of -1 is printed }
		//tailMap
		System.out.println(tm.tailMap("Pak"));
		//headMap()
		System.out.println(tm.headMap("India"));
		//firstKey()
		System.out.println(tm.firstKey());
		//lastKey()
		System.out.println(tm.lastKey());
		//keySet()
		System.out.println(tm.keySet());
		//values
		System.out.println(tm.values());
		//entrySet()
		System.out.println(tm.entrySet());
	}
}

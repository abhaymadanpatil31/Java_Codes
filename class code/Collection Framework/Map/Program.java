
import java.util.*;

class HashMapDemo {

	public static void main(String[] args) {
	
		HashSet hs = new HashSet();
		hs.add("Kanha");
		hs.add("Ashish");
		hs.add("Badhe");
		hs.add("Rahul");

		System.out.println(hs);

		HashMap hm = new HashMap();
		hm.put("Kanha","Infosys");
		hm.put("Ashish","BarClays");
		hm.put("Badhe","CarPro");
		hm.put("Rahul","BMC");

		System.out.println(hm);

		hm.put("Kanha","BarClays");

	}
}

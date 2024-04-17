
import java.util.*;

class Products implements Comparable {

	String name = null;
	int pid = 0;

	Products(String name,int pid) {
	
		this.name = name;
		this.pid = pid;
	}

	public String toString() {
	
		return name+ "("+pid+")";
	}

	public int compareTo(Object obj) {
	
		return pid - ((Products)obj).pid;
	}
}

class HashMapSort {

	public static void main(String[] args) {
	
		HashMap hm = new HashMap();
		hm.put(new Products("Yahoo",567),"10cr");
		hm.put(new Products("Google",577),"1000cr");
		hm.put(new Products("Snapchat",597),"15cr");
		hm.put(new Products("Snapchat",455),"56");

		TreeMap tm = new TreeMap(hm);
		System.out.println(tm);
	}
}

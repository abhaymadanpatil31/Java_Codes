
import java.util.*;

class College implements Comparable{

	String name = null;
	int rank = 0;

	College(String name,int rank) {
	
		this.name = name;
		this.rank = rank;
	}

	public String toString() {
	
		return "{"+" Name of College "+":"+name+"  "+"Rank of college"+":"+rank+"}";
	}
 
	public int compareTo(Object obj) {
	
		return ((College)obj).name.compareTo(((College)obj).name);
	}
}

class Client {

	public static void main(String[] args) {
	
		HashMap hm = new HashMap();
		hm.put(new College("COEP",1),"SPPU");
		hm.put(new College("VIT",2),"SPPU");
		hm.put(new College("MIT WPU",3),"MIT");

		TreeMap tm = new TreeMap(hm);
		System.out.println(tm);
	}
}


import java.util.*;

class Company implements Comparable {

	String name = null;
	String loc = null;
	int noemp = 0;

	Company(String name, String loc,int noemp) {
	
		this.name = name;
		this.loc = loc;
		this.noemp = noemp;
	}

	public String toString() {
	
		return "Name:"+name+" : "+"location:"+loc+" : "+"No Of Employee"+" : ";
	}

	public int compare(Object obj) {
	
		return ((Company)obj).name.compareTo(((Company)obj).name);
	}

}

class Client {

	public static void main(String[] args) {
	
		TreeMap tm = new TreeMap();
		tm.put(("TCS","Pune",23232),"India";
		tm.put(("TCS","NYC",23232),"USA";
		tm.put(("TCS","London",23232),"UK";

	}
}



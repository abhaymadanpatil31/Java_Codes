
import java.util.*;

class Independence {

	String cntName = null;
	int yr = 0;
	Independence(String cntName,int yr) {
	
		this.cntName = cntName;
		this.yr = yr;
	}

	public String toString () {
	
		return "{"+"{"+ cntName+"}"+ " "+ "Year of independence"+":"+ yr + "}";
	}	
}

class SortByYr {

	public int compare(Object o1,Object o2) {
	
		return ((Independence)o1).cntName.compareTo(((Independence)o2).cntName);
	}
}

class Client {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		al.add(new Independence("India",77));
		al.add(new Independence("USA",247));
		al.add(new Independence("China",75));
		System.out.println(al);
		Collections.sort(al,new SortByYr());
		System.out.println(al);

	}
}

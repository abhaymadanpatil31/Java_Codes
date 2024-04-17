
import java.util.*;

class ComparableDemo implements Comparable {

	String str;
	int num;
	ComparableDemo(String str,int num) {
	
		this.str = str;
		this.num = num;
	}

	public String toString() {
	
		return str +  num;
	}

	public int compareTo(Object obj) {
	
		return((ComparableDemo)obj).str.compareTo(((ComparableDemo)obj).str);
	}

	/*public int compareTo(Object obj) {
	
		return ((((ComparableDemo)obj).num) - (((ComparableDemo)obj).num));
	}*/
}

class Client {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		al.add(new ComparableDemo("Jay",19));
		al.add(new ComparableDemo("Kanah",13));
		al.add(new ComparableDemo("Om",14));
		System.out.println(al);
	}
}

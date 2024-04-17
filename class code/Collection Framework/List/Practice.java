
import java.util.*;

class ListDemo {

	String name = null;
	int year = 0;
	ListDemo(String name, int year) {
	
		this.name = name;
		this.year = year;
	}

	public String toString() {
	
		return name+year;
	}

	public int comparable(Object obj) {
	
		return -(((ListDemo)obj).name.compareTo(((ListDemo)obj).name));
	}
}

class College {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		al.add(new ListDemo("Zeal",12));
		al.add(new ListDemo("SCOE",23));
		al.add(new ListDemo("JSPM",45));
		System.out.println(al);
	}
}


import java.util.*;

class CricPlayer {

	int jerNo = 0;
	String pname = null;

	CricPlayer(int jerNo,String pname) {
	
		this.jerNo = jerNo;
		this.pname = pname;
	}

	public String toString() {
	
		return pname;
	}
}

class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		al.add(new CricPlayer(7,"Abhay"));
		al.add(new CricPlayer(8,"Avinash"));
		al.add(new CricPlayer(9,"om"));
		System.out.println(al);
	}
}


import java.util.*;

class CricPlayer {

	int jerNo = 0;
	String name = null;
	CricPlayer(int jerNo, String name) {
	
		this.jerNo = jerNo;
		this.name = name;
	
	}
	public String toString() {
	
		return name;
	}
}

class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList obj = new ArrayList();
		obj.add(new CricPlayer(18,"virat"));
		obj.add(new CricPlayer(7,"MSD"));
		obj.add(new CricPlayer(45,"Rohit"));
		System.out.println(obj);
	}
}

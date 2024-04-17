import java.util.*;

class CricPlayer {

	int jerNo = 0;
	String pName = null;
	CricPlayer(int jerNo, String pName) {
	
		this.jerNo = jerNo;
		this.pName =  pName;
	}

	public String toString () {
	
		return pName;
	}
}

class HashSetDemo {

	public static void main(String[]args) {
	
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(new CricPlayer(18,"Virat"));
		hs.add(new CricPlayer(7,"Dhoni"));
		hs.add(new CricPlayer(45,"Rohit"));

		System.out.println(hs);
	}
}

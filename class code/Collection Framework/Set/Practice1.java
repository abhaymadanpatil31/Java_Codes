
import java.util.*;

class BigBoss {

	String con = null;
	int prize = 0;

	BigBoss(String con,int prize) {
	
		this.con = con;
		this.prize = prize;
	}

	public String toString() {
	
		return con +" "+ " " + prize;
	}
}

class Sortbycon implements Comparator {

	public int compare(Object obj1,Object obj2 ) {
	
		return (((BigBoss)obj1).con.compareTo(((BigBoss)obj2).con));
		
	}
}
		
	
class Client {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		al.add(new BigBoss("Elvish yadav",2500000));
		System.out.println(al);
		al.add(new BigBoss("Abhishekh",2000000));
		System.out.println(al);
	}
}

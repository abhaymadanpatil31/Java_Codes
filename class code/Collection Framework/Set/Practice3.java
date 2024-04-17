
import java.util.*;

class BigBoss {

	String name = null;
	int cnt = 0;

	BigBoss(String name, int cnt) {
	
		this.name = name;
		this.cnt = cnt;
	}

	public String toString() {
		
	
		return "Name of contenstant:"+name + "Insta followers in Millions:"+cnt;
	}
}

class SortByName implements Comparator<BigBoss> {

	public int compare(BigBoss obj1,BigBoss obj2) {
	
		return obj1.name.compareTo(obj2.name);
	}
}

class SortByFoll implements Comparator<BigBoss> {

	public int compare(BigBoss b1, BigBoss b2) {
	
		return -(b1.cnt - b2.cnt);
	}
}

class Client {

	public static void main(String[] args) {
	
		ArrayList <BigBoss>al = new ArrayList<BigBoss>();
		al.add(new BigBoss("Elvish Yadav",20));
		al.add(new BigBoss("Abhishekh",15));
		al.add(new BigBoss("Meena Rani",10));

		Collections.sort(al,new SortByName());
		System.out.println(al);
		Collections.sort(al, new SortByFoll());
		System.out.println(al);
	}
	
}

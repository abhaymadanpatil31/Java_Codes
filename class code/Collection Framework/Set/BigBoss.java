
import java.util.*;

class BigBoss {

	String winner = null;
	double prize = 0.0;

	BigBoss(String winner,double prize) {
	
		this.winner = winner;
		this.prize = prize;
	}

	public String toString() {
	
		return "Winner is"+ ":"+winner+ "winning prize"+":"+prize; 
	}
}

class SortByWinner implements Comparator<BigBoss> {

	public int compare(BigBoss obj,BigBoss obj1) {
	
		return obj.winner.compareTo(obj1.winner);
	}
}

class SortByPrize implements Comparator <BigBoss> {

	public int compare(BigBoss obj,BigBoss obj1) {
	
		return(int)( obj.prize-obj1.prize);
	}
}

class ListSortDemo {

	public static void main(String[]args) {
	
		ArrayList <BigBoss> al = new ArrayList<BigBoss>();
		al.add(new BigBoss("Elvish Yadav",3000000.0));
		al.add(new BigBoss("Malhan Abhishek",300000.0));
		al.add(new BigBoss("Meena Rani",200000.0));
		System.out.println("al");

		Collections.sort(al,new SortByWinner());
		System.out.println(al);
		Collections.sort(al,new SortByPrize());
		System.out.println(al);
	}
}

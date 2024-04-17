
import java.util.*;

class Movies implements Comparable {

	String movieName = null;
	float totcoll = 0.0f;

	Movies(String movieName,float totcoll) {
	
		this.movieName = movieName;
		this.totcoll = totcoll;
	}

	public int compareTo (Object obj) {
	
		return -+(movieName.compareTo(((Movies)obj).movieName));
	}

	public String toString() {
	
		return movieName;
	}
}

class TreeSetDemo {

	public static void main(String[] args) {
	
		TreeSet ts = new TreeSet();
		ts.add(new Movies("Gadar2",300.05f));
		ts.add(new Movies("Jailer",500.00f));
		ts.add(new Movies("OMG2",200.0f));
		ts.add(new Movies("Bhola Shanker",150.0f));
		System.out.println(ts);
	}
}

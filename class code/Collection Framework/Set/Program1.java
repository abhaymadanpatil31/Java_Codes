
import java.util.*;

class TreeSetDemo {

	public static void main(String[] args) {
	
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(54);
		ts.add(22);
		System.out.println(ts.add(30));
		System.out.println(ts.add(30));
		System.out.println(ts);
	}
}

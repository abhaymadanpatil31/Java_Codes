
import java.util.*;

class NavigableSetDemo {

	public static void main(String[] args) {
	
		NavigableSet ns = new TreeSet();
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(4);
		ns.add(5);
		//lower(E) (>E)
		System.out.println(ns.lower(3));

		//floor(E) (>=E)
		System.out.println(ns.floor(3));
		
		//ceiling
		System.out.println(ns.ceiling(4));
		
		//higher(E)
		System.out.println(ns.higher(4));

		//pollFirst() - used to remove the first index data
		System.out.println(ns.pollFirst());

		//pollLast();
		System.out.println(ns.pollLast());
		//Iterator

		Iterator itr = ns.iterator();
		while(itr.hasNext()) {
		
			System.out.println(itr.next());
		}

		//descendingIterator
	/*	descendingIterator itr1 = ns.Iterator();
		while(itr1.hasNext()) {
		
			System.out.println(itr1.next());
		}*/

		//descendingSet() 
		
		System.out.println(ns.descendingSet());

		//subSet(E,E)
		System.out.println(ns.subSet(1,true,4,false));

		//tailSet(E,boolean)
		System.out.println(ns.tailSet(3,true));
		//subSet(E,E)
		System.out.println(ns.subSet(2,5));
		
		//headSet(E)
		System.out.println(ns.headSet(3));
		
		//tailSet(E)
		System.out.println(ns.tailSet(3));

	}
}

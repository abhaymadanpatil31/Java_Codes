
import java.util.*;

class DequeDemo {

	public static void main(String[] args) {
	
		Deque d = new LinkedList();
		d.offer("Abhay");
		d.offer("Om");
		d.offer("Mohit");
		System.out.println(d);
		//offerFirst()
		//offerLast()
		System.out.println(d.offerFirst("Avi"));//[Avi,Abhay,Om,Mohit]
		System.out.println(d.offerLast("Jay"));//[Avi,Abhay,Om,Mohit,Jay]
		//pollFirst()
		//pollLast()
		System.out.println(d.pollFirst());//only avi will get removed
		System.out.println(d.pollLast());//last Jay will get removed
		//peekFirst()
		//peekLast()
		System.out.println(d.peekFirst());//Abhay will get printed
		System.out.println(d.peekLast());//Mohit will get printed
		//Iterator
		Iterator itr = d.iterator();
		while(itr.hasNext()) {
		
			System.out.println(itr.next());
		}

		//descendingIterator
		Iterator itr1 = d.descendingIterator();
		while(itr1.hasNext()) {
		
			System.out.println(itr1.next());
		}
	}
}

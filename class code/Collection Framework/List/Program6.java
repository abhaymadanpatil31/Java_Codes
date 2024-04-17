
import java.util.*;

class ArrayListDemo {

	public static void main(String[] args) {
	
		LinkedList ll = new LinkedList();

		ll.add("Abhay");
		ll.addFirst(35);
		ll.addLast(33);
		System.out.println(ll);

		Iterator cursor = ll.iterator();
		while(cursor.hasNext()) 
			if(35 ==(Integer) (cursor.next()))
				cursor.remove();
	}
}

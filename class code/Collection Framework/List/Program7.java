
import java.util.*;

class ListDemo {

	public static void main(String args[]) {
	
		ArrayList al = new ArrayList();
		al.add("Abhay");
		al.add("Avinash");
		al.add("Om");
		al.add("Jay");
		al.add(10);
		al.add(50);

		Iterator cursor = al.iterator();// iterator called on al so cursor becomes al.element is return type of iterator() and thats why we give al which is ArrayList i.e element.

		while(cursor.hasNext()) {
		
			if("Jay".equals(cursor.next()))
				cursor.remove();
		}

		System.out.println(al);

		//ListIterator
		ListIterator ll = al.listIterator();
		while(ll.hasNext())
			if("Avinash".equals(ll.next()))
				ll.removeLast();
	}

	System.out.println(al);

	//Enumeration
	Vector v = new Vector();
	v.addElement("Abhay");
	v.addElement("sachin");
	v.addElement("Manohar");

	Enumeration et = v.elements();

}


import java.util.*;

class IteratorDemo {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		al.add("Abhay");
		al.add(7.90f);
		al.add(8.3);
		
		Iterator cursor = al.iterator();
		
		while(cursor.hasNext()) {
		
			if("Abhay".equals(cursor.next()))
				cursor.remove();
		}

		System.out.println(al);

		ListIterator lcursor = al.listIterator();
		while(lcursor.hasNext()) {
		
				try{if(7.90f ==(float)lcursor.next())
				lcursor.remove();
				}catch(ClassCastException cc) {
				
				}
			
		}

		System.out.println(lcursor.getClass().getName());

		for(var x : al) {//var he jdk 1.11 la ale ahe ani jar 1.8 madhe kele tar cant find symbol yete
		
			System.out.println(al.getClass().getName());
		}
	}
}

import java.util.*;
class ArrayListDemo extends ArrayList {

	public static void main(String[] args) {
	
		ArrayListDemo al = new ArrayListDemo();
		//add(Element);
		al.add("Abhay");
		al.add(20);
		al.add(30.4f);
		al.add(23.4);
		System.out.println(al);
		//int size();
		System.out.println(al.size());
		//boolean contains(java.lang.Object);
		System.out.println(al.contains(30));
		//int indexOf(java.lang.Object) 
		System.out.println(10);
		//int lastIndexOf(java.lang.Object);
		System.out.println(al.lastIndexOf(30.4f));
		// E get(int);
		System.out.println(al.get(3));
		//E set(int, E); 
		System.out.println(al.set(3,"Incubator"));
		System.out.println(al);

		ArrayList al2 = new ArrayList();//new Object Of ArrayList is created.
		al2.add("Avinash");
		al2.add("Om");
		al2.add("Jay");
		al.addAll(al2);//in existing ArrayList object(al) new ArrayList is added.
		System.out.println(al2);
		System.out.println(al);
		//boolean addAll(int,collection);
		al.addAll(3,al2);
		System.out.println(al);
		//boolean remove(int);
		al.remove(4);
		System.out.println(al);
		//void removeRange(int,int);this method has protected access so be carefull.
		al.removeRange(3,6);
		System.out.println(al);
		// java.lang.Object[] toArray();
		Object arr[] = al.toArray();
		System.out.println(arr);
		for(Object data : arr) {
		
			System.out.print(data+" ");
		}
		System.out.println();



	}
}

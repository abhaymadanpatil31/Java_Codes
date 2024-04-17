//add();
//offer(); both add() are same
//remove();
//poll();
//peek();
//element();
//the basic difference between remove() and poll() is poll doesnt thorws Exception as remove throws and second difference is that poll() return something but remove throws Exception same applied to element which also throws Exception and peek() dont thows it give the null value if there is nothing to give  
import java.util.*;

class Demo {

	public static void main(String[] args) {
	
		Queue q = new LinkedList();
		q.offer(22);
		q.offer(42);
		q.offer(52);
		System.out.println(q);//[22,42,52]
		System.out.println(q.element());//this method gives first indexed value not in brackest
		System.out.println(q.peek());//[22]-peek() method cant be stored because it return object to print only and not to store it is used to print only.
		q.poll();
	       System.out.println(q);//[[42,52]]
       	       System.out.println(q.element());//this method also throws below mentioned Exception.
	       System.out.println(q.add(33));//if we print add() then it gives true or false because it gives wheather the data is successfully added or not.
	       System.out.println(q.remove());//throws NosuchElementException
	       	       

	}
}

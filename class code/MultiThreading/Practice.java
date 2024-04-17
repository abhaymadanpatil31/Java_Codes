
import java.util.*;

public class ThreadDemo extends Thread {

	public void run() {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		System.out.println("Enter your sir name");
		String sname = sc.next();
		System.out.println(name+"This is your first name" + sname+"This is your last name ");
		
	}
}

public class MyThread {

	public static void main(String[] args) {
	
		ThreadDemo obj  = new ThreadDemo();
		obj.start();

	}
}

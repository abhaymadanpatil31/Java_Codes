import java.util.*;
class User {

	public static void main(String [] args) {
	
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		try {
		
			if(x==0) {
			
				throw new ArithmeticException("Divide by zero");
			}
		}catch(ArithmeticException ae) {
		
			System.out.println("Exceptioon in thread"+Thread.currentThread().getName());
			ae.toString();
			//ae.printstacktrace();
			//ae.getmessage();
		}
	}
}

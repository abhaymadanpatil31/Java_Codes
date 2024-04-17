
import java.util.*;
import mfun.Mobile;

public class MyInfo extends Mobile {

		MyInfo(String a, String b, int c) {
		
			super(a,b,c);
		}
		
	public static void main(String [] args) {
	
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b= sc.next();
		int c= sc.nextInt();

		MyInfo obj = new MyInfo(a,b,c);


		

	}
}

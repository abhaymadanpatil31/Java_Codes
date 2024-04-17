
import java.util.*;
class Demo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you want to get bit");
		int n = sc.nextInt();
		int pos = 3;
		int bitMask = 1<<pos;
		if((bitMask & n) == 0) {
		
			System.out.println("bit was zero");
		}

		else {
		
			System.out.println("bit was one");
		}
	}
}

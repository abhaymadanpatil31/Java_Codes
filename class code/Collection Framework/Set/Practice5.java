
import java.util.*;

class Demo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the data");
		Integer num = sc.nextInt();
		for(int i = 0; i<5; i++) {
			num = i;
		
		}
	
		ArrayList al = new ArrayList();
		al.add(num);
		al.add(num);
		al.add(num);
		al.add(num);
		System.out.println(al);
	}
}

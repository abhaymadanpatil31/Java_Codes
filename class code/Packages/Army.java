
import java.util.*;
import def.Defence;

public class Army {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String str = sc.next();

		Defence obj = new Defence(a,str);
		System.out.println(obj.war());
	}
}

package homefun;
import java.util.*;

public class Home {

      	Scanner sc = new Scanner(System.in); 
	public float per() {
	
		int math = sc.nextInt();
		int phy = sc.nextInt();
		int che = sc.nextInt();

		return (math+phy+che)/500;
	}
	public static void main(String [] args) {

		Home obj = new Home();
		System.out.println(obj.per());
	
	}
}

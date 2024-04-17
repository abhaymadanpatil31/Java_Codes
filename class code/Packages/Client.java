
import java.util.*;
import arithfun.Addition;

public class Client extends Addition {

	 Client(int x,int y) {
	
		super(x,y);
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		Client obj = new Client(x,y);
		System.out.println(obj.add());
	}
}


import java.util.*;
import arithfun.sub;

public class Clientsub extends Substraction {

	public static void main(String[] args) {

	Clientsub(int x,int y) {
	
		super(x,y);
	}

	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	Substraction obj = new Subsraction(x,y);
	System.out.println(obj.sub());
	}

}

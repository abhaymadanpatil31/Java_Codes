import java.util.*;

class CharOverFlowException extends RuntimeException {

	CharOverFlowException(String msg) {
	
		super(msg);
	}
}

class Client {

	public static void main(String [] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(4);
		if(ch<=2) {
		
			throw new CharOverFlowException("Char is very less please add more data");
		}

		System.out.println(ch+"Char");
	}
}	

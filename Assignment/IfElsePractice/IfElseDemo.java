
import java.io.*;

class IfElseDemo {
	public static void main(String [] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number from 0 to 5");
		int a= Integer.parseInt(br.readLine());
		if(a==1) {
			System.out.println("One");
			
		}
		else if(a==2) {
			System.out.println("two");
		}
		else if(a==3) {
			System.out.println("three");
		}
		else if(a==4) {
			System.out.println("Four");
		}
		else {
			System.out.println("Five");
		}
	}

}

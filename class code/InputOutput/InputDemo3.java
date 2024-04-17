
import java.io.*;

class Demo {

	public static void main(String [] args) throws IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter the integer:");
		int age=Integer.parseInt(br.readLine());
		System.out.println("You have entered integer is :"+age);
	}
}

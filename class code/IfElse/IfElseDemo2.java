import java.io.*;

class IfElseDemo {
	public static void main(String [] args)throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter any two values ");
	int a= Integer.parseInt(br.readLine());
	int b= Integer.parseInt(br.readLine());
	if(a>b) {
		System.out.println("a is greater than b");
	}
	else {
		System.out.println("b is greater than a");
	}
	}
}	

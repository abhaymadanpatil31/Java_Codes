import java.io.*;

class IfElseDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any value"); 
		int a= Integer.parseInt(br.readLine());
		if(a%2==0) {
			System.out.println("It is Even Number="+a);
		}
		else {
			System.out.println("It is Odd Number="+a);
		}
	}
}

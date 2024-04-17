import java.io.*;

class IfElseDemo {
	public static void main(String [] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any value");
		int n= Integer.parseInt(br.readLine());
		if(n%4==0) {
			System.out.println("It is divisble by 4");
		}
		else  {
			System.out.println("It not divisible by 4 ");
		}
	}
}

import java.io.*;

class IfElseDemo {
	public static void main(String [] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the amount of units which you used:");
		float unit= Float.parseFloat(br.readLine());
		if(unit<=100) {
			System.out.println(unit*1);
		}
		else {
			System.out.println(100*1 +(unit-100)*2);
		}
	}
}

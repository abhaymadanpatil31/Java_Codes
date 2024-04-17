import java.io.*;
class Table {
	public static void main(String [] args)throws IOException {
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number:-");
		int a = Integer.parseInt(br.readLine());
		if(a%2!=0) {
			System.out.println("This is odd Number");
		}
		else {
			System.out.println("This is Even Number");
		}
		System.out.println("The Square of given Number:"+a*a);


	}
}

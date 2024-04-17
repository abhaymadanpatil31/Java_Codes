//Palindrome Number.
import java.io.*;

class PalindromeDemo {
	
	static void PalindromeStringDemo(String str) {
		
		StringBuffer sb=new StringBuffer(str);
		String b=sb.reverse().toString();
		if(b.equals(str)){
			
			System.out.println("Palindrome");
		}
		else {
			
			System.out.println("Not Palindrome");
		}
	}
	public static void main(String [] args)throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Checking PalindromeNumbers");
		System.out.println("Enter the String");
		String str1=br.readLine();
		System.out.println(str1+"=");
		PalindromeStringDemo(str1);
	}
}

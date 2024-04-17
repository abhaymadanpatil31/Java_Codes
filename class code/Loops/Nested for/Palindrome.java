import java.io.*;
class PalindromeDemo {
	

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number for Checking the Palindrom Number");
		int num = Integer.parseInt(br.readLine());
		int rev = 0,rem = 1;
		int orignal = num;
		while(num != 0) {
		
			rem = num%10;
			rev = rev*10+rem;
			num /= 10;
		}
		if(orignal == rev) {
		
			System.out.println(orignal+" "+"Palindrome Number");
		}else {
		
			System.out.println(orignal+" "+"Not Palindrome Number");
		}
	}
}

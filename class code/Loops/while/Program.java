
class Demo {

	public static void main(String[] args) {
	
		int rev = 0;
		int n = 6531;
		for( ; n!=0; n = n/10) {
		
			int digit = n%10;
			rev = rev*10+digit;
			
		}
		System.out.println(rev);
	}
}

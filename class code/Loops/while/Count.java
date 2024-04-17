
class Count {

	public static void main(String[] args) {
	
		int n=9423123;
		int count = 0;

		while(n!= 0) {
		
			int digit = n%10;
			 count = count + digit;
			n = n/10; 
		}	
		System.out.println(count);
	}
}

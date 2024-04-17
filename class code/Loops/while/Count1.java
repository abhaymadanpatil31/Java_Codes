
class Count {

	public static void main(String[] args) {
	
		int count = 0;
		int n = 932323;

		while(n!=0) {
		
			n = n/10;
			count  = n+count;
			int digit = n%10;
		}
		System.out.println(count);
	}
}

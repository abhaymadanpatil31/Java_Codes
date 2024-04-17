
class PatternDemo {

	public static void main(String[] ags) {
	
		int n = 5;
		for(int i = 1;i<=5; i++) {
		
			for(int j = n;j>i; j--) {
			
				System.out.print("*");
			}
				System.out.println();
		}
	}
}


class PatternDemo {

	public static void main(String[] args) {
	
		char ch = 'd';
		for(int i = 0; i<4; i++) {
		
			for(int j = 0; j<4; j++) {
			
				System.out.print(ch+" ");
			}
			ch--;
			System.out.println("  ");
		}
	}
}

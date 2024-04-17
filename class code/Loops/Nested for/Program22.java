//if you print char and int near to each other then int will get printed so we have to make them difference by adding String in between. why does it happen the actual reason behind it that char is considered as int and when we print char with int then we get int as op so char is int and int can be added to double, byte,long so then we also get same op 
class PatternDemo {

	public static void main(String[] args) {
	
		for(int i = 0; i<3; i++) {
		
			int num = 1;
			char ch = 'A';
			for(int j = 0; j<3; j++) {
			
				System.out.print(num+ch+" ");
				num++;
				ch++;
			}
			System.out.println(" ");
		}
	}
}

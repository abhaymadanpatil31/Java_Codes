
class Pattern {
	public static void main(String [] args) {
	for(int i=5 ;i>=0;i--) {
		for(int j=1;j<=5;j++) {
		if( j==1||i==1||i==3||i==5){
			System.out.print("*"+ " ");
		}

		else {

			System.out.print("  ");
		}
		
		
		}
		System.out.println();
	}
	}
}


class twoDArray {
	public static void main(String[] args ) {
		int arr[][]=new int[3][2];
		for(int outr=0;outr<3;outr++) {
			for(int inr=0;inr<2;inr++) {
				arr[outr][inr]=(outr+inr)*outr;

			}
			System.out.println("arr[1][2]"+arr[1][1]);
				
		}
	}
		
}

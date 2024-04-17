
class Pattern7{
	public static void main(String [] abhay){
		int n=26;
		char ch ='z';
	for(int i=1;i<=4;i++){
		
		for(int j=1;j<=4;j++){
			if(j%2==1){
				System.out.print(n);
			}
			
			else{
				System.out.print(ch);
			}
			
		
		}
		System.out.println();
		ch--;
		n--;

		
		}
	}
}

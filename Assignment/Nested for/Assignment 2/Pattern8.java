
class Pattern8{
	public static void main(String [] abhay){
		char ch='A';
		char ch1='a';
			for(int i=1;i<=4;i++){
				for(int j=1;j<=4;j++){
					if(j%2==1){
						for(char ch2='A';ch2<='I';ch2++){

						System.out.print(ch++ +" ");
						}
					}
					else{
						System.out.print(++ch1 + " ");
					}

				
				}
				System.out.println();
				ch++;
				ch1++;
			}
	}
}

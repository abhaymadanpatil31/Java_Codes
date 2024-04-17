
class Pattern5{
	public static void main(String [] abhay){
		int n=26;
		char ch='Z';
                	for(int i=1;i<=4;i++){
				for(int j=1;j<=4;j++){
					if(j%2==1){
                                        	System.out.print(n+" ");
						n--;
					
					}
					else{
						System.out.print(ch--+ " ");
					}

 
				}
				System.out.println();
				


			}
	
	}

}


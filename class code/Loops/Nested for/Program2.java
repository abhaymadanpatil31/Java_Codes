
class Demo {

	public static void main(String[] args)  {
	
		int arr[] = new int[]{1,2,3,4,5};
		
		int n = arr.length;
		for(int i = 0; i<n; i++) {
		
			for(int j = n-1; j!=0; j++) {
			
				if((arr[i]+arr[j])%2 == 0) {
				
					System.out.print(arr[i]);

				}
				//System.out.println(); 
				else {
				
					System.out.print(arr[i]-2);
				}
				System.out.println() ;
			}
		}
	}
}

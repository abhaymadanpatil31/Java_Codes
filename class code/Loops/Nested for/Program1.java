
class Demo {

	public static void main(String[]args) {
	
		int arr[] = new int[]{1,2,3,4,5};
		//int arr2[] = new int[arr.length];
		int n = arr.length;
		int i = 0;
		int j = n-1;
		while(i<j) {
		
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for(int k = 0;k<n; k++) {
		
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	}
}	

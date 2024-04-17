
class HashtableDemo {

	int index(int n) {
	
		int arr[] = new int[7];
		for(int i = 0;i<=n;i++) {
		
			if(arr[i]%7 == 0||1||2||3||4||5||6) {
			
				arr[i] = n;
			}
		}
		return arr;
	}	

	public static void main(String[] args) {
	
		HashtableDemo obj = new HashtableDemo();
		int arr[] = new int[7];
		arr = obj.index(10);
		System.out.println(arr);
	}
}

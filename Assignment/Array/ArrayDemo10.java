

class ArrayInput {
	public static void main(String []args ) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     	System.out.println("Enter the values");
	int a= Integer.parseInt(br.readLine());
	int arr[] =new int[a];
	for(int i=0;i<arr.length;i++) {
		arr[i]=Integer.parseInt(br.readLine());
	}
	System.out.println("printed data");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
		
	}
}

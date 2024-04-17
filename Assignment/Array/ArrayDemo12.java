import java.io.*;
class ArrayDemo {
	public static void main(String [] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		int sum=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2!=0) {
			sum=sum+arr[i];
			}
		}
		System.out.println("Addition of odd elements="+sum);
	}
}


import java.io.*;
class ArrayDemo {
	public static void main(String[]ards)throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter array size");
	int size = Integer.parseInt(br.readLine());
	int arr[]=new int[size];
	System.out.println("Enter elements of array");
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		arr[i]=Integer.parseInt(br.readLine());
		sum=sum+arr[i];
	}
	System.out.println("Sum of all array ="+sum);
	}
}

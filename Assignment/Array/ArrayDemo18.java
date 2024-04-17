import java.io.*;
class ArrayDemo {
	public static void main(String [] args ) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			
		}
	}
}/*wap to find the sum of even and odd number in an array and display the sum value*/


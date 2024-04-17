import java.io.*;
class ArrayDemo {
	public static void main(String [] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of Array");
		int size = Integer.parseInt(br.readLine());
		int arr[] =new int[size];
		System.out.println("Enter the elements of array");
		int mult=1;
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0) {
				mult=mult*arr[i];
			}

		}
		System.out.println("Product of odd Index="+mult);
	}
}


import java.io.*;
class ArrayDemo {
	public static void main(String [] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter the elements");
		int div=1;	
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%5==0) {
				 div=arr[i];
			}

		}
		System.out.println("Number Divisible by five is"+div);
	}

}


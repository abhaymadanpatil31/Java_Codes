import java.io.*;
class ArrayDemo {
	public static void main(String []args) throws IOException  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array"); 
		int size = Integer.parseInt(br.readLine());
		System.out.println("Enter the elements");
		
		for(i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2!=0) {
				System.out.println("Elements of odd="+arr[i]);
			}
		}
	}
}


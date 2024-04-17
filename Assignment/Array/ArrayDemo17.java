import java.io.*;
class ArrayDemo {
	public static void main(String [] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array size");
		int size=Integer.parseInt(br.readLine());
		int arr[] =new int[size];
		System.out.println("Enter elements of array");
		int count=0;
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0) {
				count++;
			}
			else {
				cnt++;
			}
		}
		System.out.println("Sum of Even numbers="+count);
		System.out.println("Sum of odd numbers="+cnt);


}/*write a program to create array of n integer elements where n is given by user and find number of even and odd numbers in array*/
}


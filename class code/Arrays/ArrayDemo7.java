import java.util.*;
import java.io.*;
class ArrayDemo {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size =sc.nextInt();
		int arr[] =new int[size];
		int count=0;
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
			count++;
			}

		}
		System.out.println("Count is :"+count);
	}
}

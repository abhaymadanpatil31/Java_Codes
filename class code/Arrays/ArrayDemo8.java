import java.io.*;
class ArrayDemo {
	public static void main(String [] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array size");
		int size=Integer.parseInt(br.readLine());
		int arr[] = new int[size];
	        int cnt=0;
		int cnt1=0;
		System.out.println("Enter the Element");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0) {
				cnt++;
			}
			else {
				cnt1++;
			}


		}
		System.out.println("Even Count is="+cnt);
		System.out.println("Odd Count is="+cnt1);
	}
}


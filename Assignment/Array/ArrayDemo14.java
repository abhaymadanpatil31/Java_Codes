import java.io.*;
class ArrayDemo {
	public static void main(String [] args)throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the array size in character "); 
	char size = (char)br.read();
	char arr[]=new char[size];
	System.out.println("Enter the array elements");
	char ch1='a','e','i','o''u';

	for(char  ch=0;ch<arr.length;ch++) {
		arr[ch]=(char)br.read();
		 {
			if(ch=ch1) {
			arr[ch];
			}

		}

	}
	System.out.println(arr[ch]);
	}
}



import java.io.*;
class ArrayDemo {
	public static void main(String [] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the characters size");
		int size=Integer.parseInt(br.readLine());
		char arr[]=new char[size];
		System.out.println("Enter the character element");
		char vowels1='a',vowels2='e',vowels='i',vowels3='o',vowels='u';
		for(int i=0;i<arr.length;i++) {
			arr[i]=(char)br.read();
		
			if(arr[i]=='a'||arr[i=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u']{
				vowels;
			}
		}
		System.out.println("Vowels are ="+vowels);
	
	}
}


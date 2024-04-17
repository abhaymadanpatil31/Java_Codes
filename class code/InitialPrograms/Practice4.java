import java.io.*;
class Demo {

	public static void  main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the data");
		int data = Integer.parseInt(br.readLine());
		System.out.println(data);
	}
}

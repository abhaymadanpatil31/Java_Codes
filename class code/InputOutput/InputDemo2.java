
import java.io.*;

class InputDemo2 {
	public static void main(String [] args)throws IOException {
		BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 =new BufferedReader(new InputStreamReader(System.in));	
			System.out.println("Enter your name");
			String name=br1.readLine();
			br1.close();

				System.out.println("Enter your Age");
				int age = Integer.parseInt(br2.readLine());

				System.out.println(name);
				System.out.println(age);






	}
}

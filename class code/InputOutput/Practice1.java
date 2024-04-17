import java.io.*;
class Demo {

	public static void main(String [] args) throws IOException{ 
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the integer");
	int x=Integer.parseInt(br.readLine());
	System.out.println("You have enterd Integer is :"+x);
	
	System.out.println("Enter the string");
	String name=br.readLine();
	System.out.println("you havee entered string is:"+name);
	}
}


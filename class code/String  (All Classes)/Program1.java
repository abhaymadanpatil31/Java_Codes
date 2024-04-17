import java.io.*;
class Demo {
	
	StringBuffer abhay(String name) {
		
		StringBuffer str=new StringBuffer(2);
				
		System.out.println(str+"Updated String");
		return str;
	}

	public static void main(String [] args)throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String sb=br.readLine();
		System.out.println("Old String");
		Demo obj=new Demo();
		
		obj.abhay(sb);
	}
}



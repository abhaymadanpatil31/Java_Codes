import java.io.*;
class IfDemo {
	
	public static void main(String [] args)throws Exeception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int x=Integer.parseInt(br.readLine());
		if(x<20) {
			
			System.out.println(true);
		}

		else {
			
			System.out.println(false);
		}
	}
}

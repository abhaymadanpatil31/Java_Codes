import java.io.*;
class ArithMetic {
	
	void ArithMetic(int x,int y) {
		
		int c=x+b;
		System.out.println("Addition of Numbers"+c);
	}

	void ArithMetic(float x,float y) {
		
		float c=x+y;
		System.out.println("Substraction of numbers"+c);
	}
}

class client {
	
	BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
	public static void main(String [] args)throws IOException {
		
		ArithMetic am=new ArithMetic();
		System.out.println("Enter the two intger numbers only to get addition");
		int a=Integer.parseInt(br.readLine());
		int e=Integer.parseInt(br.readLine());
		am.ArithMetic(a,e);
		System.out.println("Enter the two float values");
		float f=Float.parseFloat(am.(br.readLine()));
		float k=Float.parseFloat(am.(br.readLine()));
		am.ArithMetic(f,k);
	}
}



import java.io.*;

class NumberFormatDemo {

	void getdata() throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int data=0;

		try {
		
			data =Integer.parseInt(br.readLine());
		}catch(NumberFormatException obj) {
		
			obj.printStacktrace();
		}
	}

		public static void main(String [] args) {
		
			NumberFormatDemo obj=new NumberFormatDemo();
			System.out.println(obj.data);
			obj.getdata();

		}

	
}	

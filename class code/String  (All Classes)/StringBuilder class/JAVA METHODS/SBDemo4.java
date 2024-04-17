
import java.io.*;

class SBDemo {

	public static void main(String [] args)throws IOException {
		BufferedReader br= new BufferedReader(new  InputStreamReader(System.in));
		System.out.println("Enter StringBuffer");
		String s=br.readLine();
		
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}
}

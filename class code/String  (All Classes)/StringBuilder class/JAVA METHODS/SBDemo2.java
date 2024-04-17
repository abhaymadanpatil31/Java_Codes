import java.io.*;
class SBDemo {
	public static void main(String [] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter StringBuffer");
		String s=br.readLine();
		StringBuffer str=new StringBuffer(s);
		
		str.insert(0,"Patil");//here updated String chi index consider keli jate original nahi jar extra string add zali tar punha new Index Count hoto 
		System.out.println(str);
		str.insert(10,"Madan");
		
		System.out.println(str);
	}
}

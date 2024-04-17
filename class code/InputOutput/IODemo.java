import java.io.*;
class IODemo {
	public static void main(String [] a) {
		InputStreamReader isr = new InputStreamReadeer(System.in);
		BufferedReader br= new BufferedReader(new InputStreamReader());
		String str1 = br.readline();
		System.out.println("String="+str1);
		br.close();
		char ch=(char)isr.read();
		System.out.println("Char ="+ch);

	}

}

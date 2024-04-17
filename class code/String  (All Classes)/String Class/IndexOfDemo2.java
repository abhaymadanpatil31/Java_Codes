import java.io.*;

class IndexOfDemo {
	public static void main(String [] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Strings"); 
		String str1=br.readLine();
		System.out.println(str1.indexOf('l',0));//if chracter in not avaible then it will give -1 as op.
	}

}

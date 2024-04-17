import java.io.*;
class SBDemo {
	public static void main(String [] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		StringBuffer sb=new StringBuffer(s);
		sb.delete(2,7);
		System.out.println(sb);
	}
}

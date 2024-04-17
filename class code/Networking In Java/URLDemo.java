
import java.io.*;
import java.net.*;

class URLDemo {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String site  = br.readLine();
		if(site != null) {
		URL obj = new URL(site);
		System.out.println(" Protocol is:"+obj.getProtocol());
		System.out.println("Port Number = "+obj.getPort());
		System.out.println("File location where url will deploy = "+obj.getFile());
		}
	}
}

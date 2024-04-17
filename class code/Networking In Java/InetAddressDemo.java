
import java.net.*;
import java.io.*;

class InetAddressDemo {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String site = br.readLine();
		InetAddress id = InetAddress.getByName(site);
		System.out.println("IPAdress : "+ id);
	}
}

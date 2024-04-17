import java.io.*;
import java.net.*;
class ServerDemo {

	public static void main(String[] arfs) throws IOException {
	
		ServerSocket ss = new ServerSocket(2300);
		Socket s = ss.accept();
		OutputStream os = s.getOutputStream();
		PrintStream ps = new PrintStream(os);
		ps.println("Hello Java");
		ps.println("How are you");

	}
}

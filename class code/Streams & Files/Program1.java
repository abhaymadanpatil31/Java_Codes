
import java.io.*;

class FileDemo {

	public static void main(String[] args) throws IOException {
	
		File fobj = new File("FileHandling");
		fobj.mkdir();
		System.out.println(fobj);
	}
}

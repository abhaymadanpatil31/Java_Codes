
import java.io.*;

class FileDemo {

	public static void main(String[] args)throws IOException {
	File fobj = new File("Core2Web");
	fobj.createNewFile();
	System.out.println(fobj);
	}
}

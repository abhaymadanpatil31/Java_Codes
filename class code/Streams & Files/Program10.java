
import java.io.*;

class Demo {

	public static void main(String[] args)throws IOException  {
	
		File f = new File("Core2Web");
		f.mkdir();
		File f1 = new File(f,"Incubator.txt");
		f1.createNewFile();
	}
}

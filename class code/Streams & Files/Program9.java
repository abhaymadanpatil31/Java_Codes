
import java.io.*;

class FileDemo {

	public static void main(String[] ars) throws IOException {
	
		File f = new File("Incubator.txt");
		FileWriter fw = new FileWriter(f,true);
		fw.write("Testing");
		fw.write("Devops");
		fw.write("Salesforce");
		fw.close();
	}
}

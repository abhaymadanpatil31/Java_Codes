
import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {
	
		File file  = new File("777");
		file.createNewFile();
		System.out.println(file);
		System.out.println(file.exists());
		file.delete();
		System.out.println(file.exists());
		if(file.exists()==true) {
		
			System.out.println("File is available");
		}else {
		
			System.out.println("File not Availble");
		}
	}
}

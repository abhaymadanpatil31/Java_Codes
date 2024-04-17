import java.io.*;
class FileReadingDemo {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("Incubator.txt");
		FileDecriptor fd = fis.getFD();
		FileReader fr = new FileReader(fd); 
		int data = fr.read();
		while(data != -1) {
		
			System.out.println((char)data);
			data = fr.read();
		}

		fr.close();
	}
}


import java.io.*;

class FileDemo {

	public static void main(String[] args) throws IOException {
	
		File fobj = new File("FileHandling");
		fobj.createNewFile();
		File fobj1 = new File(fobj,"Code1.txt");//File(Folder,file); this is type but it works .
		fobj1.mkdir();/*if you dont write this line even then folder is made up and dont even gives error the reason behind it that every folder is considered as file so we can perform all the method on folder */
		System.out.println(fobj);
		System.out.println(fobj1);
	}
}

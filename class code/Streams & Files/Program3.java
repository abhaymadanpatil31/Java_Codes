
import java.io.*;

class FileDemo {

	public static void main(String[] args) throws Throwable {
	
		File fobj = new File("Incubator.txt");
		fobj.createNewFile();

		//getName()
		System.out.println(fobj.getName());//Incubator.txt
		//getParent()
		System.out.println(fobj.getParent());//null- bc it finds in itself
		//getPath()
		System.out.println(fobj.getPath());//Incubator.txt
		//getAbsolutePath()
		System.out.println(fobj.getAbsolutePath());//from Home to Incubator.txt
		//canRead()
		System.out.println(fobj.canRead());//true
		//canWrite()
		System.out.println(fobj.canWrite());//true
		//isDirectory()
		System.out.println(fobj.isDirectory());//false
		//isFile()
		System.out.println(fobj.isFile());//true
		//LastModified()
		System.out.println(fobj.lastModified());//gives long number
		//list
		String[] files = fobj.list();
		System.out.println(files);
		int count = 0;
		/*for(String str: files) {
		
			File f = new File(str);
			if(f.isDirectory())
				count++;
		}

		System.out.println(count);*/
	}
}

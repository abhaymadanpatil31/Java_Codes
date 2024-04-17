
import java.util.*;

class PropertiesDemo {

	public static void main(String[] arfs) {
	
		Properties obj = new Properties();
		fileInputStream fobj = new fileInputStream("Friends.properties");
		obj.load(fobj);
		String name = obj.getProperty("Abhay");
		System.out.println(name);
		obj.setProperty("Shashi","Biencaps");
		FileOutputStream outobj = new FileOutputStream("Friends.properties");
		obj.store(outobj,"Updated by Shashi");
	}
}


import java.io.*;

class Player implements Serializable {

	int jerNo = 0;
	String pName;
	Player(int jerNo, String pName) {
	
		this.jerNo = jerNo;
		this.pName = pName;
	}
}
class SerializationDemo {

	public static void main(String[] args) throws IOException {
	
		Player obj1 = new Player(1,"Rahul");
		Player obj2 = new Player(45,"Rohit");
		FileOutputStream fos = new FileOutputStream("PlayerData.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj1);
		oos.writeObject(obj2);
		oos.close();
		oos.close();
	}
}



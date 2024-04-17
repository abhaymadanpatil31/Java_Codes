
class Singletone {

	static Singletone obj = new Singletone();

	private Singletone() {
	
		int a = 10;
		System.out.println("the value of a is:"+a);
	}

	static Singletone getobject() {
	
		return obj;
	}
}

class Client {

	public static void main(String[] arhs) {
	
		Singletone obj1 = Singletone.getobject();
	
	}
}

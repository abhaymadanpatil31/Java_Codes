
class Singletone {

	static Singletone obj = new Singletone();
	private Singletone() {
	
		System.out.println("In private constructor");
	}

	static Singletone getobject() {
	
		return obj;
	}
}

class Client {

	public static void main(String[] args) {
	
		Singletone obj1 = Singletone.getobject();
	}
}

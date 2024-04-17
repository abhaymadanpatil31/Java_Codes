
class Demo {

	static String str = null;

	Demo() {
	
		System.out.println(str);
	}
}

class Client {

	public static void main(String[] args) {
	
		Demo.str = "Abhay";
		Demo obj = new Demo();
	}
}

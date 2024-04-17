
class Demo {

	static Demo obj = new Demo();
	Demo() {
	
		System.out.println("In Constructor!");
	}
}

class Client {
	
	public static void main(String[] args) {
	Demo obj = new Demo();
	System.out.println(Demo.obj);
	}
}

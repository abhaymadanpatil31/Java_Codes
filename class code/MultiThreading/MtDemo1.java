
class MyClass extends Thread {

	public void run() {
	
		System.out.println("In Run Of MyClass");
	}
}
class Demo extends Thread {

	public void run() {
	
		System.out.println("In Run of Demo");
	
		MyClass mc = new MyClass();
		mc.start();
	}

}

class Client {

	public static void main(String[]arsgs) {
	
		Demo obj = new Demo();
		obj.start();
	}
}

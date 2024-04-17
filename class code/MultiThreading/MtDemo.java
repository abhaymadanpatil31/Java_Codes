
class MyClass extends Thread {

	public void run() {
	
		System.out.println("Hello world from new Thread");
	}
}

class ThreadDemo {

	public static void main(String[] args) {
	
		MyClass mc = new MyClass();
		mc.start();
		System.out.println("Hello world from main Thread");
	}	
}

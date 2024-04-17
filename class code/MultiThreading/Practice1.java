
class ThreadDemo extends Thread {

	public void run() {
	
		System.out.println("I am trying new Experiance");
	}

	public static void main(String[] args) {
	
		ThreadDemo obj = new ThreadDemo();
		obj.start();
	}
}

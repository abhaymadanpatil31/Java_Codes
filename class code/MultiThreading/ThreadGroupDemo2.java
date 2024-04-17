
class ThreadDemo extends Thread {

	public void run() {
	
		System.out.println("In Run"+Thread.currentThread());
		System.out.println("In Run"+Thread.currentThread().getName());
	}
}

class Demo {

	public static void main(String [] args) {
	
		ThreadDemo obj = new ThreadDemo();
		obj.start();
	}
}

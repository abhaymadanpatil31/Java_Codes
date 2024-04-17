
class ThreadTest extends Thread {

	ThreadTest(String str) {
	
		super(str);
	}

	public void run() {
	
		System.out.println(Thread.currentThread());
	}
}

class MyThread {

	public static void main(String [] args) {
	
		ThreadTest obj = new ThreadTest("Core2Web");
		obj.start();
	}
}

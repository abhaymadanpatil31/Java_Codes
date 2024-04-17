
class MyThread implements Runnable {

	public void run() {
	
		System.out.println(Thread.currentThread());

	}
}

class ThreadDemo extends Thread {

	public void run() {
	
		System.out.println(Thread.currentThread());
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		Thread t1 = Thread.currentThread();
		t1.setName("Abhay");
		System.out.println(t1);
	}
}

class Client {

	public static void main(String[] args) {
	
		ThreadDemo td = new ThreadDemo();
		td.start();
		System.out.println(Thread.currentThread());
	}
}

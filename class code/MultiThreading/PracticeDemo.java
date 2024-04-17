
class Demo extends Thread {

	public void run() {
	
		System.out.println(Thread.currentThread().getName()+"In Demo");
	}
}
class ThreadDemo extends Thread {

	public void run() {
	
		System.out.println(Thread.currentThread().getName()+"In ThreadDemo");
		System.out.println(Thread.currentThread()+"In ThreadDemo");
		Demo obj = new Demo();
		obj.start();
	}
}

class Client {

	public static void main(String[] args) {
	
		ThreadDemo td = new ThreadDemo();
		Thread t = new Thread(td);
		t.start();
		System.out.println(Thread.currentThread()+"In main");
	}
}

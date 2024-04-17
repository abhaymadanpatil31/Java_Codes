
class MyThread extends Thread {

	public void run() {
	
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
	}
}

class ThreadDemo {

	public static void main(String[] args) {
	
		Thread t= Thread.currentThread();
		System.out.println(t.getPriority());
		MyThread mt = new MyThread();
		mt.start();

		t.setPriority(7);
		MyThread mt1 = new MyThread();
		mt1.start();
		
	}
}

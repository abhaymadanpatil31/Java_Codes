
class MyThread extends Thread {

	public void run() {
	
		System.out.println(Thread.currentThread());
	}
}

class ThreadDemo {

	public static void main(String [] args)throws InterruptedException {
	
		System.out.println(Thread.currentThread());
		MyThread m = new MyThread();//new thread zala.
		m.start();//run method la call gela
		Thread.sleep(10);//main thread sleep zala
		Thread.currentThread().setName("Core2Web");//apan main Thread cha name badloon core2web kel
		System.out.println(Thread.currentThread());
	}
}


class Demo extends Thread {

	static Thread nmMain = null;

	public void run() {
	
		try {
		
			System.out.println(nmMain);
			nmMain.join();
		}catch(InterruptedException ie) {
		
		}
	}
}


class ThreadDemo {

	public static void main(String[] args)throws InterruptedException {
	
		System.out.println(Thread.currentThread());
		Demo.nmMain = Thread.currentThread();
		Demo obj = new Demo();
		obj.start();
		obj.join();
	}
}

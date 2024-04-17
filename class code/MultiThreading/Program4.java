
class MyThread extends Thread {

	MyThread(ThreadGroup tg,String str) {
	
		super(tg,str);
	}
	
	public void run() {
	
		System.out.println(Thread.currentThread());
		
		try {
		
			Thread.sleep(8000);
		} catch(InterruptedException ie) {
		
			System.out.println(ie.toString());
		}
	}	

}

class ThreadGroupDemo {

	public static void main(String[] args) throws InterruptedException {
	
		ThreadGroup pt1 = new ThreadGroup("India");
		MyThread obj1 = new MyThread(pt1,"Maharashtra");
		MyThread obj2 = new MyThread(pt1,"Goa");

		obj1.start();
		obj2.start();

		ThreadGroup ct2 = new ThreadGroup(pt1,"Pakistan");
		MyThread obj3 = new MyThread(ct2,"Karachi");
		MyThread obj4 = new MyThread(ct2,"Lahore");

		obj3.start();
		obj4.start();
		System.out.println(pt1.activeCount());
		System.out.println(pt1.activeGroupCount());
		//System.out.println(ct2.destroy());
		System.out.println(pt1.setDaemon(true));
	}
}

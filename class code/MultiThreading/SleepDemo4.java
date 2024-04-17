
class Sleep extends Thread {

	public void run() {
		
		System.out.println("In Run"+Thread.currentThread());

	}
}

class MyThread {

	public static void main(String [] args)throws InterruptedException {
	
		Sleep s = new Sleep();
		s.start();
	//	s.sleep(100,1);
	//	s.join();
		Thread.currentThread().setName("Abhay");
		System.out.println(Thread.currentThread());
	}
}

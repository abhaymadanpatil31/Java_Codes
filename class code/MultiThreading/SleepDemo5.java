
class MyThread extends Thread {

	public void run() {
	
		for(int i = 0; i<10; i++) {
		
			System.out.println("In Run");
		}
	}
}

class ThreadDemo {

	public static void main(String [] args)throws Exception {
	
		MyThread t = new MyThread();
		t.start();
		t.join();
		for(int i = 0; i<10; i++) {
		
			System.out.println("In Main");//main will get excuted after run
		}
	}
}

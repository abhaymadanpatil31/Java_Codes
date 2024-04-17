//******
class MyThread extends Thread {

	static Thread nmMain = null;
	public void run() {
	
		try {
		
			nmMain.join();
		}catch(InterruptedException ie) {
		
			
		}

		for(int i = 0; i<10; i++) {
		
			System.out.println("In Run");
		}
	}
}

class ThreadDemo {

	public static void main(String [] args) throws InterruptedException {
	
		MyThread.nmMain  = Thread.currentThread();
		MyThread obj = new MyThread();
		obj.start();
		obj.join();

		for(int i = 0; i<10; i++) {
		
			System.out.println("In main");
		}

	}
}

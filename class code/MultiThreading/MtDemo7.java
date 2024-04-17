
class YieldDemo extends Thread {

	public void run() {
	
		Thread.currentThread().setPriority(2);
		for(int i = 0; i<5; i++) 
		System.out.println("In Run");
	}
}

class ThreadDemo {

	public static void main(String[] args) {
	
		YieldDemo yd = new YieldDemo();
		yd.start();
		Thread.currentThread().setPriority(9);
		for(int i = 0; i<5; i++) {
		
			System.out.println("Before Yield");
		}
		yd.yield();

		for(int j = 0; j<5; j++) {
		
			System.out.println("After yield");
		}

		
	}
}

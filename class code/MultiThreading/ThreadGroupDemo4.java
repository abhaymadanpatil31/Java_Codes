
class MyThread extends Thread {

	public void run() {
	
		for(int i = 0; i<5; i++) {
		
			System.out.println("In Run");
		}
	}
}

class Demo {

	public static void main(String [] args)throws InterruptedException {
	
		MyThread obj = new MyThread();
		obj.start();
		obj.sleep(1000);

		for(int i = 0; i<5; i++) {
		
			System.out.println("In Main");
		}
		obj.sleep(2327,23);
		System.out.println("in main");
	}

}

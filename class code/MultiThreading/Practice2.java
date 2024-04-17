
class ThreadDemo implements Runnable {

	public void run() {
	
		System.out.println("In Run");
		 dailyTask();
		for(int i = 0; i<3;i++) 
		       System.out.println("in run"+Thread.currentThread());	
	}

	void dailyTask() {
	
		System.out.println("In dailyTask method");
	}

}

class Client {

	public static void main(String[] args) {
	
		ThreadDemo obj = new ThreadDemo();
		Thread t = new Thread(obj);
		t.start();
	}
}

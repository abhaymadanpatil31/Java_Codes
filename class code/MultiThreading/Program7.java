import java.util.concurrent.*;
class ThreadDemo implements Runnable {

	int num;
	ThreadDemo(int num) {
	
		this.num = num;
	}
	public void run() {
	
		System.out.println(Thread.currentThread()+"start Thread"+num);
		dailyTask();
		System.out.println(Thread.currentThread()+"End Thread");
	}

	public void dailyTask() {
	
		try {
		
			Thread.sleep(55555,55555);
		} catch(InterruptedException ie) {
		
		}
	}
}

class ThreadPoolDemo {

	public static void main(String [] args) {
	
		ExecutorService ser = Executors.newFixedThreadPool(5);

		for(int i = 0; i<5; i++) {
		
			ThreadDemo obj = new ThreadDemo(i);
			ser.execute(obj);
		}

		ser.shutdown();

	}
}

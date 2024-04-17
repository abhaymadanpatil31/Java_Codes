
import java.util.concurrent.*;
class ThreadDemo implements Runnable {

	int num;

	ThreadDemo(int num) {
	
		this.num = num;
	}

	public void run() {
	
		System.out.println(Thread.currentThread()+"Start Thread:"+num);
		dailyTask();
		System.out.println(Thread.currentThread()+"End Thread:"+num);
	}

	void dailyTask() {
	
		try {
		
			Thread.sleep(7000);
		} catch(InterruptedException ie) {
		
			System.out.println(ie.toString());
		}
	}
}

class ThreadPoolDemo {

	public static void main(String[] args) {
	
		ExecutorService ser = Executors.newCachedThreadPool();

		for(int i = 0; i<5; i++) {
		
			ThreadDemo obj = new ThreadDemo(i);
			ser.execute(obj);
		}
			ser.shutdown();
	}
}

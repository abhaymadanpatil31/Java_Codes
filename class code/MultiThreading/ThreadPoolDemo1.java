
class MyThread implements Runnable {

	int num; 

	MyThread(int num) {
	
		this.num = num;
	}

	public void run() {
	
		System.out.println(Thread.currentThread()+" start Thread"+num);
		dailyTask();
		System.out.println(Thread.currentThread()+"End Thread"+num);
	}

	void dailyTask() {
	
		try {
		
			Thread.sleep();
		} catch(InterruptedException ie) {
		
			System.out.println(ie.toString());
			System.out.println(ie.getMessage());
		}
	}
}

class ThreadPoolDemo {

	public static void main(String[] args) {
	
		ExecutorService ser = new Executors.newCachedThreadPool();

		for(int i = 0; i<4; i++) {
		
			MyThread obj = new MyThread(i);
			ser.execute(obj);
		}

		ser.shutdown();
	}
}

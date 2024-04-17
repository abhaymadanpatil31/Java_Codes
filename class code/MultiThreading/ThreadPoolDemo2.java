
class MyThread extends Thread {

	int age = 0;
	
	MyThread(int age) {
	
		this.age = age;
	}

	public void run() {
	
		System.out.println(Thread.currentThread()+"Start Thread"+age);
		dailyTask();
		System.out.println(Thread.currentThread()+"End Thread"+age);
	}

	void dailyTask() {
	
		try{
		
			Thread.sleep(8000);
		}catch(InterruptedException ie) {
		
		}
	}
}

class ThreadPoolDemo {

	public static void main(String[] args) {
	
		ExecutorService ser = Executors.newCachedThreadPool();

		for(int i = 0; i<=6; i++) {
		
			MyThread obj = new MyThread(i);
			ser.execute(obj);
		}
		ser.shutdown();
	}
}

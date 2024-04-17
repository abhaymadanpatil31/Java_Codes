
class Demo extends Thread {

	public void run() {
	
		System.out.println(Thread.currentThread());
	}
}

class ThreadDemo {

	public static void main(String[] args)throws InterruptedException {
	
		System.out.println(Thread.currentThread());
		Demo obj = new Demo();
		obj.start();
		obj.sleep(44);
		Thread.currentThread().setName("Core2Web");
		System.out.println(Thread.currentThread());
	}
}

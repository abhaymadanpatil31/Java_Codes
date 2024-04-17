
class MyThread extends Thread {

	MyThread(ThreadGroup tg,String str) {
	
		super(tg,str);
	}

	public void run() {
	
		System.out.println(Thread.currentThread());
	}
}

class ThreadGroupDemo {

	public static void main(String[] args) {
	
		ThreadGroup tg = new ThreadGroup("Core2Web");
		MyThread mt = new MyThread(tg,"C");
		MyThread mt1 = new MyThread(tg,"Java");
		ThreadGroup tg1 = new ThreadGroup(tg,"Incubator");
		MyThread mt2 = new MyThread(tg1,"Flutter");
		MyThread mt3 = new MyThread(tg1,"SpringBoot");
		mt.start();
		mt1.start();
		mt2.start();
		mt3.start();
	}
}

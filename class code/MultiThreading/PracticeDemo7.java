
class MyThread extends Thread {

	MyThread(ThreadGroup tg,String str) {
	
		super(tg,str);
	}

	public void run() {
	
		System.out.println(Thread.currentThread());
		System.out.println("In Run"+Thread.currentThread());
	}
}

class ThreadDemo {

	public static void main(String[] args) {
	
		ThreadGroup tg = new ThreadGroup("Abhay");
		MyThread mt = new MyThread(tg,"College");
		MyThread mt1 = new MyThread(tg,"Class");
		mt.start();//jar apan same object var dusra call dila tar IllegalStateException deto
		mt1.start();
		ThreadGroup tg1 = new ThreadGroup(tg,"Dada");
		MyThread mt2 = new MyThread(tg1,"Home");
		MyThread mt3 = new MyThread(tg1,"Home Activity");
		mt2.start();
		mt3.start();
	}
}

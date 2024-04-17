
class MyThread extends Thread {

	MyThread(ThreadGroup tg,String str) {
	
		super(tg,str);
	}

	public void run() {
	
		System.out.println(Thread.currentThread());
	}
}

class ThreadGP {

	public static void main(String[] args) {
	
		ThreadGroup ptthreadGP = new ThreadGroup("Core2Web");
		MyThread obj1 = new MyThread(ptthreadGP,"C");
		MyThread obj2 = new MyThread(ptthreadGP,"Java");
		MyThread obj3 = new MyThread(ptthreadGP,"Python");
		obj1.start();
		obj2.start();
		obj3.start();
		ThreadGroup cthreadGP = new ThreadGroup(ptthreadGP,"InCubator");
		
		MyThread obj4 = new MyThread(cthreadGP,"Flutter");
		MyThread obj5 = new MyThread(cthreadGP,"ReactJS");
		MyThread obj6 = new MyThread(cthreadGP,"Python");
		obj4.start();
		obj5.start();
		obj6.start();
	
	}
}

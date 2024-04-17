
class MyThread extends Thread {

	MyThread(ThreadGroup tg,String str) {
	
		super(tg,str);
	}

	public void run() {
	
		System.out.println(Thread.currentThread());
	}
}

class ThreadDemo {

	public static void main(String []args) {
	
		ThreadGroup pthread = new ThreadGroup("Abhay");
		MyThread obj1 = new MyThread(pthread,"Sharada Industries");
		MyThread obj2 = new MyThread(pthread,"Madan multinational pvt.lmt");
		MyThread obj3 = new MyThread(pthread,"Akshada Internationals");
		obj1.start();
		obj2.start();
		obj3.start();

		ThreadGroup cthread = new ThreadGroup(pthread,"Arjun");
		MyThread obj4= new MyThread(cthread,"Sunita Pvt.lmt");
		MyThread obj5 = new MyThread(cthread,"Sagar Industries");
		obj4.start();
		obj5.start();
	}
}

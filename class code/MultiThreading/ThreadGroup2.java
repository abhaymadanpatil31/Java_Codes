
class MyThread extends Thread {

	MyThread(ThreadGroup tg,String str) {
	
		super(tg,str);
	}
}

class ThreadDemo {

	public static void main(String [] args) {
	
		ThreadGroup pthread = new ThreadGroup("Core2web");
		MyThread obj1 = new MyThread(pthread,"C");
		MyThread obj2 = new MyThread(pthread,"Java");
		MyThread obj3 = new MyThread(pthread,"Python");
		obj1.start();
		obj2.start();
		obj3.start();

		ThreadGroup cthread = new ThreadGroup(pthread,"InCubator");
		MyThread obj4 = new MyThread(cthread,"Flutter");
		MyThread obj5 = new MyThread(cthread,"ReactJS");
		MyThread obj6 = new MyThread(cthread,"SpringBoot");
		obj4.start();
		obj5.start();
		obj6.start();
	}
}

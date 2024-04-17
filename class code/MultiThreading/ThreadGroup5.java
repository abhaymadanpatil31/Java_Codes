
class ThreadDemo extends Thread {

	ThreadDemo(ThreadGroup tg,String str) {
	
		super(tg,str);
	}
	
	public void run() {
	
		System.out.println(Thread.currentThread());
	}
}

class ThreadGroupDemo {

	public static void main(String[] args) {

		ThreadGroup pthread = new ThreadGroup("Core2Web");
		ThreadDemo obj1 = new ThreadDemo(pthread,"C");
		ThreadDemo obj2 = new ThreadDemo(pthread,"Java");
		ThreadDemo obj3 = new ThreadDemo(pthread,"Python");
		obj1.start();
		obj2.start();
		obj3.start();

		ThreadGroup cthread = new ThreadGroup(pthread,"InCubators");
		ThreadDemo obj4 = new ThreadDemo(cthread,"Flutter");
		ThreadDemo obj5 = new ThreadDemo(cthread,"React");
		ThreadDemo obj6 = new ThreadDemo(cthread,"Spring");
		obj4.start();
		obj5.start();
		obj6.start();

	}
}

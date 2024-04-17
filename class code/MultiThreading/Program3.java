
class Threads extends Thread {

	Threads(ThreadGroup tg,String name) {
	
		super(tg,name);
	}

	public void run() {
	
		for(int i = 0; i<4; i++) {
		
			System.out.println(Thread.currentThread());
		}
	}
}

class MyThread {

	public static void main(String[] args) {
	
		ThreadGroup pthread = new ThreadGroup("Abhay");
		Threads obj1 = new Threads(pthread,"Om");
		Threads obj2 = new Threads(pthread,"Jay");
		Threads obj3 = new Threads(pthread,"Avinash");
		Threads obj4 = new Threads(pthread,"Sachin");
		
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();

		ThreadGroup cthread = new ThreadGroup(pthread,"College");
		Threads obj5 = new Threads(cthread,"Zeal");
		Thread obj6 = new Threads(cthread,"Zeal");
		obj5.start();
		obj6.start();

		for(int i = 0; i<3; i++) {
		
			System.out.println(Thread.currentThread());
		}
	}
}

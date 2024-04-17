
class ThreadDemo1 extends Thread {

	ThreadDemo1(String name) {
	
		super(name);
	}
}

public void run() {

	for(int i = 0; i<10; i++) {
	
		System.out.println(Thread.currentThread().getName());
		try {
		
			this.sleep();
		}catch(Exception a) {
		

		}
	}
}

class ThreadDemo2 extends Thread {

	public void run() {
	
		for(int i = 0; i<10; i++) {
		
			System.out.println(Thread.currentThread().getName());
			try{
			
				this.sleep();
			}catch(Exception ie) {
			
			}
		}
	}
}
class MyThread {

	public static void main(String [] args)throws InterruptedException {
	
		ThreadDemo1 obj = new ThreadDemo1();
		obj.start();
		ThreadDemo2 obj1 = new ThreadDemo();
		obj1.start();
	}
}

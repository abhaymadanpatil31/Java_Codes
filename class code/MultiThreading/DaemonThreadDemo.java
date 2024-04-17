
class DaemonThread extends Thread {
 
	DaemonThread(String name) {
	
		super(name);
	}

	public void run() {
	
		if(Thread.currentThread().isDaemon()) {
		
			System.out.println(getName()+"is Daemon Thread");
		}

		else {
		
			System.out.println(getName()+"is user thread");
		}
 	}

	public static void main(String [] args) {
	
		DaemonThread obj = new DaemonThread("obj");
		DaemonThread obj1 = new DaemonThread("obj1");
		DaemonThread obj2 = new DaemonThread("obj2");

		obj.start();
		obj1.start();
		obj2.start();
	}
}



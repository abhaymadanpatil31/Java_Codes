
class ThreadDemo extends Thread {

	public void run() {
	
		System.out.println("Active counts"/*+Thread.currentThread().activecounts()*/);
	}
}	

class Demo {

	public static void main(String [] args) {
	
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		obj.activeCounts();
	}
}

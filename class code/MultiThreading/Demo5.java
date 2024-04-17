
class Run extends Thread {

	public void run() {
	
		System.out.println("In Run"+Thread.currentThread().getName());
	}
}

class ThreadDemo {

	public static void main(String [] args) {
	
		Run obj = new Run();
		obj.start();
		Run obj1 = new Run();
		obj1.start();
		
	}
}

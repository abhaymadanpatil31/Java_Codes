
class Sleep extends Thread {

	public void run() {
	
		System.out.println("In Run"+" "+Thread.currentThread());
		Thread obj = Thread.currentThread();
		System.out.println(obj+"Is is same as above or not");
	}
}

class ThreadDemo {

	public static void main(String [] args)throws InterruptedException {
	
		Sleep s = new Sleep();
		s.start();
	        s.sleep('z','z');	
		Thread.currentThread().setName("Abhay");
		System.out.println(Thread.currentThread());
		
	}
}

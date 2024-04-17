
class Demo extends Thread {

	public void run() {
	
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getPriority());
	}
}

class Client {

	public static void main(String[] args) {
	
		Demo obj = new Demo();
		obj.start();

		System.out.println("In main"+Thread.currentThread());
	}
}


class Demo extends Thread {

	public void run() {
	
		System.out.println(Thread.currentThread());
	}
}

class client {

	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread());
		Demo obj = new Demo();
		obj.start();
		Thread.currentThread().setName("Abhay");
		System.out.println(Thread.currentThread());

	}
}

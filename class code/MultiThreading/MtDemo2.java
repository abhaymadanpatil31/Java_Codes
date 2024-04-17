
class Demo implements Runnable {

	public void run() {
	
		System.out.println("In Run");
	}
}

class client {

	public static void main(String[] args) {
	
		Demo obj = new Demo();
		Thread th = new Thread(obj);
		th.start();
	}
}

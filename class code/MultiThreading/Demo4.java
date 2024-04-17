class Try extends Thread {

	public  void run() {
	
		System.out.println("In Run of try"+Thread.currentThread().getName());
	}
}
class Demo extends Try implements Runnable {

	public void run() {
	
		System.out.println("In Run");
		

		Try t1=new Try();
		t1.start();
	}

	
}

class ThreadDemo {

	public static void main(String [] args) {
	
		Demo obj = new Demo();
		Thread t = new Thread(obj);
		t.start();
	}
}

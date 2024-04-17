
class MyThread extends Thread {

	MyThread(String str) {
	
		super(str);
	}

	public void run() {
	
		System.out.println(getName());
	}
}

class ThreadGP {

	public static void main(String[] args) {
	
		MyThread obj = new MyThread("Core2Web");
		obj.start();
		System.out.println(obj.getName());
	}
}

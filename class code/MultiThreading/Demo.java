
class Demo extends Thread {

	public void run() {
	
		System.out.println("In Run Of Demo=  "+Thread.currentThread().getName());
	}
}

class ThreadDemo {

	public static void main(String [] args) {
	
		Demo obj=new Demo();
		obj.start();
		obj.start();
		System.out.println("In main ===="+Thread.currentThread().getName());
	}
}

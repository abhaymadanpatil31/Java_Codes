
class MyThread extends Thread {

		
	public void run() {


	
		for(int i = 0; i<10; i++) {
		
			System.out.println("In run");
		}
	}
}

class ThreadDemo {

	public static void main(String [] args)throws Throwable {
	
		MyThread t = new MyThread();
		t.start();
		t.join();//here we join line is of main thread and thats why first run thread will get chance to print it and then main becaue join says that pehle aap and after aap i will be get executed.
		for(int i = 0; i<10; i++) {
		
			System.out.println("In main");
		}
	}
}

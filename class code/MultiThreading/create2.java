
class MyThread extends Thread {

	public void run() throws Exception{
	
		for(int i=0;i<10;i++) {
		
			System.out.println("In Run");
			Thread.sleep(1000);
		}
	}
}

class ThreadDemo {

	public static void main(String [] args) throws Exception {
	
		MyThread obj=new MyThread();
		obj.start();

		for(int i=0;i<10;i++) {
		
			System.out.println("In main");
			Thread.sleep(1000);
		}
	}
}

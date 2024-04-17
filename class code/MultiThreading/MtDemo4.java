
class Demo extends Thread {

	public void run() {
	
		System.out.println("Welcome to run method");
		fun();
	}

	void fun() {
		
		for(int i = 0; i<4; i++) {

		System.out.println("Thank you run for showing me");
		}
	}
}

class Client {

	public static void main(String[] args)throws InterruptedException {
	
		Demo obj = new Demo();
		obj.start();
		obj.join();
		for(int i = 0; i<5; i++) {
		
			System.out.println("In main");
		}
	}
}

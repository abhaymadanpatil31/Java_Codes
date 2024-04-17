
class Demo extends Thread {

	public void run() {
	
		System.out.println(Thread.currentThread());
		fun();
	}

	void fun() {
	
		class Inner {
		
			void gun() {
			
				System.out.println("In Gun method");
			}
		}

		Inner obj = new Inner();
		obj.gun();
	}
}

class Client {

	public static void main(String[] args) {
	
		Demo obj1 = new Demo();
		obj1.start();
	}
}

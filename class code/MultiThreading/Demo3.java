
class Demo implements Runnable {

	public void run() {
	
		class Inner {
		
			void m1() {
			
				System.out.println("In Inner class");
			}
			Inner obj=new Inner();
			obj.m1();
		}
	}
}

class ThreadDemo {

	public static void main(String [] args) {
	
		Demo obj=new Demo();
		obj.m1();
		Thread t=new Thread(obj);
		t.start();
		
		
	}
}

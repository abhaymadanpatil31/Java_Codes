
class NullPointerDemo {

	void m1() {
	
		System.out.println("IN m1");
	}

	void m2() {
	
		System.out.println("In m2");
	}

	public static void main(String [] args) {
	
		System.out.println("Start main");
		
		NullPointerDemo obj=new NullPointerDemo();
		obj.m1();
		obj=null;
		obj.m2();
		System.out.println("End of main");
	}
}


interface Demo {
	
	void fun();
	void gun();
}

class DemoChild implements Demo {
	
	public void fun() {
		
		int x=10;
		int y=20;

		System.out.println("Addition of two numbers is:"+(x+y));
	}

	public void gun() {
	
		int x=23;
		int y=30;

		System.out.println("Substaction of two numbers is :"+(x-y));
	}
	
}

class client  {
	
	public static void main(String [] args) {
		
		DemoChild obj=new DemoChild();
		obj.fun();
		obj.gun();
	}
}


interface Demo1 {
	
	static void fun() {
		
		System.out.println("in fun-Demo1");
	}
}

interface Demo2 {
	
	static void fun() {
		
		System.out.println("In fun-Demo2");
	}
}

class DemoChild implements Demo1,Demo2 {
	
	void fun() {
		
		System.out.println("In fun-Child");

		Demo1.fun();
		Demo2.fun();
	}
}	

class client {
	
	public static void main(String [] args) {
		
		DemoChild obj=new DemoChild();
		obj.fun();
	}
}

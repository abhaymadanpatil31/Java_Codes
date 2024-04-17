
interface Demo {
	
	void fun();

	void gun();

	void run();

	default void bun() {
		
		System.out.println("In bun-Demo");
	}

}

abstract class  DemoChild1 implements Demo {
	
	public void fun() {
	
		System.out.println("In fun-Demochild1");
	}
}

abstract class  DemoChild2 extends DemoChild1 {

	public void gun() {
	
		System.out.println("In gun-Demochild2");
	}
}

class DemoChild3 implements DemoChild2{
	
	public void run() {
		
		System.out.println("in run-DemoChild2");
	}

	
}


class client {
	
	public static void main(String [] args) {
		
		DemoChild3 obj=new DemoChild3();
		obj.fun();
		obj.gun();
		obj.run();
		obj.bun();
	}
}

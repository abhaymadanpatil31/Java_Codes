
class Demo {
	
	Demo() {
		
		System.out.println("In Parent-demo Constructor");
	}

	void fun() {
		
		System.out.println("In Parent fun");
	}
}

class DemoChild extends Demo {
	
	DemoChild() {
		
		System.out.println("In Child -Constructor");
	}

	void fun() {
		
		System.out.println("In Child fun");
	}
}

class Parent {
	
	Parent(Demo d) {
		
		System.out.println("In real Parent constructor d");
		d.fun();
	}

	Parent(DemoChild dc) {
		
		System.out.println("In Real Parent Constructor with dm");
		dc.fun();
	}

	public static void main(String [] args) {
		
		Parent obj=new Parent(new Demo());

		Parent obj1=new Parent(new DemoChild());
	}
}


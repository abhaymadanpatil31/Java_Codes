
class Demo {

	Demo() {
		
		System.out.println("In Parent Demo Constructor");
	}

	void fun() {
		
		System.out.println("In Parent -fun");
	}
}

class DemoChild extends Demo {
	
	DemoChild() {
		
		System.out.println("In Child Constructor");
	}

	void fun() {
		
		System.out.println("In Child fun");
	}
}

class Parent {
	
	
}


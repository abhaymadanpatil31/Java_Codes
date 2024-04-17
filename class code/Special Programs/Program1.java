
class Parent {
	
	int x=10;

	void m1() {
		
		System.out.println("In Parent-m1");
	}
}

class Child extends Parent {
	
	int a=10;
	
	void m1() {
		
		System.out.println("In CHild-m1");
	}
}

class Demo {
	
	Demo(Parent p) {
		
		System.out.println("In Constructor-parent");
		
		p.m1();
	
	}

	Demo(Child c) {
		
		System.out.println("In Child-constructor");

		c.m1();

		
	}

	public static void main(String [] args) {
		
		Demo obj=new Demo(new Parent());
		
		Demo obj1=new Demo(new Child());
	}
	
}

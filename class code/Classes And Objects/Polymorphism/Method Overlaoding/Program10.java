
class Demo {
	
	Demo() {
		
		System.out.println("In Demo Constructor");
	}

	void m1() {
		
		System.out.println("In Demo-m1");
	}
}

class DemoChild extends Demo {
	
	DemoChild() {
		
		System.out.println("In DemoChild Constructor");
	}

	void m2() {
		
		System.out.println("In DemoChild-m2");
	}

}

class Parent {
	
	Parent(Demo d) {
		
		System.out.println("In Parent constructor with Demo");
		d.m1();
	}

	Parent(DemoChild dm) {
		
		System.out.println("In Parent constructor with DemoChild");
		dm.m1();
	}

	public static void main(String [] argvs) {
	
		Parent p=new Parent(new Demo());

		Parent p1=new Parent(new DemoChild());
	}

}

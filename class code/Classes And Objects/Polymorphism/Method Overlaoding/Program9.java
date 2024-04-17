
class Demo {
	
	Demo() {
		
		System.out.println("In Parent-Demo-Constructor");
	}

	void m1() {
		
		System.out.println("In Parent-m1");
	}
}

class DemoChild extends Demo {
	
	DemoChild() {
		
		System.out.println("In DemoChild-Cosntructor");
	}

	void m1() {
		
		System.out.println("In Child-m1");
	}
}

class Parent {
	
	Parent(Demo d) {
	
		System.out.println("In Parent Cosntructor with Demo");
		d.m1();
	}
	
	Parent (DemoChild dm) {
		
		System.out.println("In Parent constructor with Demochild");
	
		dm.m1();
	}

	
		public static void main(String [] args) {
			
			Parent obj=new Parent(new Demo());
			
			Parent obj1=new Parent(new DemoChild());
		}	
}

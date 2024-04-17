//this program is to Boiler code of company's programs 
class Demo {//here we created two Parent child relationship classes and used as return type of instance method
	
	Demo() {
		
		System.out.println("In Parent Constructor-Demo");
	}
}

class DemoChild extends Demo {
	
	DemoChild() {
		
		System.out.println("In Child Constructor-DemoChild");
	}
}

class Parent {
	
	Parent() {
		
		System.out.println("In Parent construtor");
	}

	Demo m1() {
		
		System.out.println("in m1-Parent");

		return new Demo();
	}
}

class Child extends Parent {
	
		
		Child() {
			
			System.out.println("In Child Constructor");
		}

		DemoChild m1() {
			
			System.out.println("In Child -m1");

			return new DemoChild();//object is created of DemoChild and get call implicitly to its constructorand then cosntructor inside is get printed but here is some clearification that nothing but the when we override method and then that overridden method has DemoChild object and that DemoChild class have parent then thats why its parent class constructor get called .
		}
}

class client {
	
	public static void main(String [] args) {
		
		Parent p=new Child();
		p.m1();
	}
}

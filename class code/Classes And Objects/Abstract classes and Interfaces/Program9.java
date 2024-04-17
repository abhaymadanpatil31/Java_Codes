
interface Demo {
	
	static void fun() {
		
		System.out.println("In fun-Demo");
	}
}

interface Demo1 {
	
	default void fun() {
		
		System.out.println("In fun-Demo1");
	}
}

class DemoChild implements Demo1,Demo {
	
	/*public void fun() {
		
		System.out.println("In fun-DemoChild");
	}*/ //here i make method comment because there is only one way to print the default method if ovrriding is happpended and that way is that dont write any method in Child and if you dont write any method then in child due to inheritance there is already default method is there.
}
class client {
	
	public static void main(String [] args) {
		
		Demo1 obj=new DemoChild();
		obj.fun();
	}
}

/*jar apan static method lihli asel interface madhe,tar ti inherit hot nahi ani tila jar access karayche asel tar mg aplyala direct class chya navane call karava lagto*/
interface Demo1 {
	
	static void m1() {//public static void m1() that is the sytnax inside the bytecode
		
		System.out.println("In static fun-Demo1");
	}

	default void m2() {//public default void m2() this line proves that the default is not access specifire in instance concept because we cant write two access specifiers on single line
		
		System.out.println("In default fun-Demo1");
	}
}

class DemoChild implements Demo1 {
	
	public void m2() {//
		
		System.out.println("In fun-DemoChild");
		
		Demo1.m1();	//in this line we called static method directly by class name where it declared.
	}
	

	void m1() {
		
		System.out.println("In m1-DemoChild");
		Demo1.m1();

	}



}

class client extends DemoChild {
	
	public static void main(String [] args) {
		
		DemoChild obj=new DemoChild();
		obj.m2();
		obj.m1();
	}
}

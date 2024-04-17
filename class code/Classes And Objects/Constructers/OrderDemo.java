
class OrderDemo {
	
	static int a=10;
	int b=20;
	static {
		
		System.out.println("In static block with static variable"+a);
	}
	
	{
		System.out.println("In Instance block with instance variable"+b);
	}

	static void fun() {
		
		System.out.println("In static method");
	}
	OrderDemo() {
		
		System.out.println("In Constructor");
		int a=20;
		int b=20;
		int c=a+b;
		System.out.println("In Constuctor with Some Operation"+c);
	}
	
	void fun1() {
		
		System.out.println("In Instance variable with same name of static method");
	}

	public static void main(String [] args) {
		
		OrderDemo obj1=new OrderDemo();
		obj1.fun1();
		OrderDemo.fun();
	}

}

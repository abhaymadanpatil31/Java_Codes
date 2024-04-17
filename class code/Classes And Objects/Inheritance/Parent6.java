
class Parent {

	int x=10;
	static int y=20;

	static {
		
		System.out.println("Inside Parent static block");
		System.out.println(y);

	}

	public static void main(String [] args) {//if we give main method in same class where static block is written then there is no need of to call it through the classname or object becuase of before main method static block will get pushed on java stack and if you use different class to declare main method then we must have to call it through either classname of creating that class object where that static block is present.

		
	
	}
}

class Child extends Parent{
	
	static {
		
		System.out.println("Inside the child static block");
	}
	public static void main(String []args ) {
		

	}
}

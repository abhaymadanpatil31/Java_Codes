
class Parent {
	
	int x=10;
	static int y=20;

	static {
	
		System.out.println("Parent child block");//inside static block variable y will get initiated.
	}

	Parent() {//inside constructor x variable will get initiated when constructor get pushed on java stack

		System.out.println("In Constructor");
	}

	void methodOne() {
		
		System.out.println(x);
		System.out.println(y);
	}

	static void methodTwo() {
		
		System.out.println(y);
	}
}

class Child extends Parent {
	
	static {
		
		System.out.println("In Child static block");
	}

	Child() {
		
		System.out.println("In Child Constructor");
	}

	void methodThree() {
		
		System.out.println("Inside the Child Instance method");
	}

	static void methodFour() {
		
		System.out.println("Inside the static method of Child class");
	}


}

class client {
	
	public static void main(String [] args) {
		
		Child obj=new Child();
		obj.methodOne();
		obj.methodTwo();
		obj.methodThree();
		obj.methodFour();
	}
}

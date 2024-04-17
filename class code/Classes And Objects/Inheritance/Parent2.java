
class Parent {
	
	static {
		
		System.out.println("Inside the Parent static block");
	}
}

class Child extends Parent {
	
	static {
		
		System.out.println("Inside child static block");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Child obj=new Child();//here after writing this line child get introduced in different(different in the manner of not in smae class where static block were get introduced) class and after that call get towards the child but before getting inside it due extend keyword call get automatically in its Parent class and due to this first Parent static block will get called  and after that child static block get printed this is because of before compiler checks whether any static block is available on the other mentioned class(due to extend ) for printing the method which comes first in order to be printed .
	}
}

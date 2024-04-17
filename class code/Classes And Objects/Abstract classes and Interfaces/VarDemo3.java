
class Demo {
	
	void fun() {
		System.out.println("In Demo class");
	}
}

interface Demo1 {
	
	default void gun() {
		
		System.out.println("In interface");
	}
}

class Child extends Demo implements Demo1 {
	
	
}

class client {
	
	public static void main(String [] args) {
		
		//Demo obj=new Child(); here we cant do this because if you want to print it or override it then that ,method must present in Parent class otherwiese it will give error of cant find symbol
		Child obj=new Child();
		obj.fun();
		obj.gun();
	}
}

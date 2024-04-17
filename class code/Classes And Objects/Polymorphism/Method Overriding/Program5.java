
class Parent {
	
	Parent () {
		
		System.out.println("in Parent constructor");
	}

	void fun() {
		
		System.out.println("In Parent fun");
	}

	void gun(int x) {
		
		System.out.println("In Parent gun");
	}
}

class Child extends Parent {
	
	void gun() {
		
		System.out.println("In Child gun");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Child obj=new Child();
		obj.gun(10);//due to passing paramters , compiler will first watch its matching method so parent fun will be output and not the error, due to inheritance all the method are comes in the child 
	}
}

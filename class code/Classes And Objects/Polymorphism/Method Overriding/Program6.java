
class Parent {
	
	Parent () {
		
		System.out.println("In parent constructor");
	}

	void fun() {
		
		System.out.println("In Parent fun");
	}

	void gun() {
		
		System.out.println("In Parent gun");
	}
}

class Child extends Parent{
	
	Child() {
		
		System.out.println("In Child Constructor");
	}

	void fun(int x) {
		
		System.out.println("In Child Fun");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Parent obj=new Child();
		obj.fun(10);
		obj.gun();
	}
}

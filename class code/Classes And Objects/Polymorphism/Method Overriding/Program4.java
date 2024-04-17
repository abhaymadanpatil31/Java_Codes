
class Parent {
	
	Parent () {
		
		System.out.println("Parent Constructor");
	}

	void fun() {
		
		System.out.println("In Parent Fun");
	}


}

class Child extends Parent {
	
	Child () {
		
		System.out.println("Child Constructor");
	}

	void fun() {
		
		System.out.println("In Child Fun");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Child obj=new Child();
		obj.fun();

	}
}

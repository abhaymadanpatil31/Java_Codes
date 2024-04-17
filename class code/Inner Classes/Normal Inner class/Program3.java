
class A {
	
	void fun() {
		
		System.out.println("Outer");
	}

	class B {
		
		void gun() {
			
			System.out.println("Inner");
		}
	}
}

class client {
	
	public static void main(String [] args) {
		
		A obj=new A();
		A.B obj1=new A().new B();
		obj.fun();
		obj1.gun();
	}
}

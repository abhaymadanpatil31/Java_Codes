
class Outer {
	
	class Inner {
		
		void fun() {
			
			System.out.println("In Inner class");
		}
	}

	void gun() {
		
		System.out.println("In Outer class");
	}
}

class client {

	public static void main(String [] args) {
		
		Outer obj=new Outer();
		Outer.Inner obj1=obj.new Inner();
		obj.gun();
		obj1.fun();
	}	
}


class Outer {

	void gun() {
	
		System.out.println("gun of outer method");
	}

	static class Inner extends Outer {
	
		void fun() {
		
			System.out.println("In static fun");
		}
	}
}

class Client {

	public static void main(String[] args) {
	
		Outer.Inner obj = new Outer.Inner();
		obj.gun();
		obj.fun();
	}
}


class Outer {

	void m1() {
	
		System.out.println("In m1-outer");
	}

	static class Inner {
	
		void m1() {
		
			System.out.println("In m1-inner");
		}
	}
}

class Client {

	public static void main(String[] args) {
	
		Inner obj = new Inner();
		obj.m1();
	}
}


class Outer {
	
	void m1() {
		
		System.out.println("In Outer m1");
	}

	class Inner {
		
		void m2() {
			
			System.out.println("Inner -m2");
		}
	}
}

class client {
	
	public static void main(String [] args) {
		
		Outer.Inner obj=new Outer.Inner();
		obj.m1();
		obj.m2();//new error
	}
}


class Outer {

	int x = 10;
	static int y = 20;
	class Inner {
	
		void fun2() {
		
			System.out.println("fun2-inner");
			System.out.println(x);
			System.out.println(y);
			fun1();
		}
	}

	void fun1() {
	
		System.out.println("fun1-outer");
	}

	public static void main(String[] args) {
	
		Outer.Inner obj = new Outer().new Inner();
		obj.fun2();
		
	}
}

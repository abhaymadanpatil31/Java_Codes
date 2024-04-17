
class Outer {

	int x = 10;
	static int y = 20;
	
	class Inner {
	
		int a = 23;
		static int b = 40;
	}	

	public static void main(String[] args) {
	
		Outer.Inner obj = new Outer().new Inner();
		
	}
}

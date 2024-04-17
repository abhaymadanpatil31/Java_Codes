
class MethodDemo {
	int x=10;
	static int y=20;
	void fun() {
	System.out.println(x);
	System.out.println(y);

	}
		public static void main(String []a ) {
		MethodDemo obj = new MethodDemo();
		System.out.println(obj.x);
		System.out.println(y);
		obj.fun();
		}
}

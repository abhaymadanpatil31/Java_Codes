
class Demo {

	static int x = 10;
	static void fun() {
	
		System.out.println(x);
	}
	public static void main(String[] rgs) {
	
		Demo obj = new Demo();
		obj.fun();
		Demo.x = 20;
		System.out.println(x);
		obj.fun();

	}
}

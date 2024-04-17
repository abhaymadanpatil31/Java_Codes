
class MethodDemo1 {
	int x=10;
	static  int y=10;
	void fun() {
		System.out.println("In fun Method");
	}
	static void gun() {
		System.out.println("In Gun Method");
	}
		public static void main(String [] a) {
 		MethodDemo1 obj=new MethodDemo1();
		System.out.println(obj.x);
		System.out.println(y);
		obj.fun();
		gun();
		}
}

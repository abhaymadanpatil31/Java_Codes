
interface Demo1 {

	static void fun() {
	
		System.out.println("In Fun");
	}
}

class DemoChild implements Demo1 {

	void gun() {
	
		System.out.println("In gun");
		Demo1.fun();
	}
}
class client {

	public static void main(String [] args) {
	
		Demo1 obj=new DemoChild();
		obj.gun();
	}
}

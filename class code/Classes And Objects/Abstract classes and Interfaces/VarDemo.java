
interface Demo{
	
	int x=20;

	default void fun() {
		
		System.out.println(x);
	}

	static void gun() {
		
		System.out.println(x);
	}
}

class DemoChild implements Demo {
	
	//int x=x+20 and even only x also; error -Self refernce is initialser
	int x=23;
	public void fun() {
		
		System.out.println(x);
	}

}

class client {
	
	public static void main(String [] args) {
		
		Demo obj=new DemoChild();
		obj.fun();
		Demo.gun();
	}
}

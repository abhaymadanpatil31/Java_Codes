
interface Demo {
	
	void gun();

	default void fun(){
		
		System.out.println("In Fun-Demo");
	}	
}

class DemoChild implements Demo {
	
	public void gun() {
	
		System.out.println("In gun-DemoChild");
	}

	 public void fun() {//if we dont write public then attemting to assign weaker privileges; was public and here we tried to override the deafault method
		
		System.out.println("In fun-DemoChild");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Demo obj=new DemoChild();
		obj.fun();
		obj.gun();
	}
}

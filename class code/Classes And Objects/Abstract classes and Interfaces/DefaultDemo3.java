
interface Demo {
	
	static void fun() {
		
		System.out.println("In Fun");
	}
}

class DemoChild implements Demo {
/*due to static keyword inheritance will be not available this is because in inteface static keyword acts diffrently it does not take part in inheritance while in class static does not take part in overriding this is the difference between the interface and class*/	

}

class client {
	
	public static void main(String [] args) {
		
		DemoChild obj=new DemoChild();
		obj.fun();
	}
}

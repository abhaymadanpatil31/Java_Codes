
interface Demo {
	
	static void m1() {
		
		System.out.println("You are using static method of Interface ,You cant consider  me as default because my name is static i created my universe you just cant change me .");
	}

	default void m2() {
		
		System.out.println("Oh no! i know you are going to change me then why are you creating me common man,if you have brain then dont try to change me.");
	}
}

class DemoChild implements Demo {
	
	public void m2() {
		
		System.out.println("You are inside the m2 of DemoChild,oh man you have changed me , I am Angry on you");

		Demo.m1();
	}
}

class client {

	public static void main(String [] args) {
		
		DemoChild obj=new DemoChild();
		obj.m2();
	}
}

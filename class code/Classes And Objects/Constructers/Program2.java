
class Demo {
	
	Demo() {
		
		System.out.println("In Demo Constructor");
	}

	void fun() {
	
		System.out.println("In fun Method");
	}
}

class DemoChild {

	DemoChild() {
		
		System.out.println("In DemoChild Constructor");
	}

	void gun() {
		
		System.out.println("In Gun Method of DemoChild");
	}
}

class Abhay {

	Abhay(Demo d) {
		
		System.out.println("In Abhay's Constructor");
	}

	


}

class client {
	
	public static void main(String [] args) {
		
		Abhay obj=new Abhay(new Demo());


	}
}

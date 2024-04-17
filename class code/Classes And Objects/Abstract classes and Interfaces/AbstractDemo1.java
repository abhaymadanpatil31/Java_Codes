
abstract class Abhay {

	void name() {
	
		System.out.println("Abhay madan patil");
	}

	abstract void marry();
}

class Child extends Abhay {

	void marry() {
	
		System.out.println();
	}
}

class client {

	public static void main(String [] args ) {
	
		Child obj=new Child();
		obj.name();
		obj.marry();
	}
}


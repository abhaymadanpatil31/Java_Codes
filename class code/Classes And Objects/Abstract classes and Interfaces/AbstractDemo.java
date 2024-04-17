
abstract class Parent extends Object {

	abstract void marry();
	abstract void carry();

}

class Child extends Parent {

	void marry() {
		
		System.out.println("Marry is completed");
	}

	void carry() {
	
		System.out.println("Carry is completed");
	}
}

class client {

	public static void main(String [] args) {
	
		Child obj=new Child();
		obj.marry();;
		obj.carry();
	}
}

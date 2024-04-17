//***** 
class Parent {
	
	public void fun() {//Access specifier: public 
		
		System.out.println("Parent fun");
	}

}

class Child extends Parent {

	void fun() {//Access specifier: default 
		
		System.out.println("In Child Fun");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Child ch=new Child();
		ch.fun();//the reason behind giving error is,Parent methods scope is larger because we used public but in child class you see for overriding method has less scope due to it has default access specifier
	}
}


class Parent {
	
	final void marry() {
		
		System.out.println("Parents choice");
	}
}	

class Child extends Parent {
	
	void marry() {
		
		System.out.println("No I wont");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Child ch=new Child();
		ch.marry();//this line calls to child method but we have extended that class and but in that extended Parent class final keyword is used which states that this method wont be override further more because final is not related to override method.final is constant which 
	}
}

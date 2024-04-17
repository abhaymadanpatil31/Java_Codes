
class Parent {
	
	void fun() {//Access specfire:default which has large scope that the private
		
		System.out.println("In Parent fun");
	}
}

class Child extends Parent {
	
	private void fun() {//Acess specifier:private , due to private, scope is reduced and java wont allow it thats the concept so rember always 
		
		System.out.println("In Child fun");
	}
}

class client {

	public static void main(String [] args) {
		
	
		Child ch=new Child();
		ch.fun();
	}
}

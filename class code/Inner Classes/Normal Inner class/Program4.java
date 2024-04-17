
class Outer {

	void fun() {
	
		System.out.println("In Outer class");
	}

	class Inner {
	void gun(){
		
		System.out.println("In Inner Class");
		}
	} 
}


class Client {

	public static void main(String[] args) {
	
		Outer obj = new Outer();
		Outer.Inner obj1 = new Outer().new Inner();
		obj.fun();
		obj1.gun();
	}
}

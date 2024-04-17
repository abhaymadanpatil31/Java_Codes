
class Parent {
	
	Parent() {
		
		System.out.println("In parent Constructor");
	}

	void parentProperties () {
		
		System.out.println("flat,car,Gold");
	}

}

class Child extends Parent {

	Child() {
	
		System.out.println("In child Constructor");	
	}

}

class Client {
	
	public static void main(String [] args) {
		
		Child obj1=new Child();//here new child is object and child obj1 is reference of that object and this concept can be used to use reference of Parent class and object of child class but not vice versa is allowed.
	}
}


class Parent {

	int x=10;
	char ch='A';
	String name="Abhay";

	void abhay() {
	
		System.out.println("My name is Abhay ,and i am from Parent class");
	}

	Parent() {
	
		System.out.println("In Parent constructor");
	}
}

class Child extends Parent {

	Child() {
	
		System.out.println("In Child Constructor");
	}

	void gun() {
		
		System.out.println("In Child gun.");
		System.out.println("These are the parent variables"+"x="+x+"ch"+ch+"name"+name);
	}

}

class Demo {

	public static void main(String []args) {
	
		Parent p=new Parent();
	}
}

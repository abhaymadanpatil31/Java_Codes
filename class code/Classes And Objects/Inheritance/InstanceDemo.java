
class Parent {
	
	int x=10;

	Parent() {
		
		this(22);
		System.out.println("Thank you for choosing parent constructor");
	}

	Parent(int x) {
		
		System.out.println("I am From Paremeterised Constructor");
	}	

}

class Child extends Parent {

	int y=10;

	Child() {
		
		this(55);
		System.out.println("In Child Non Parameterised cosntructor");
	}

	Child(int e) {
		
		super(33);
		System.out.println("In Paremetrisesd constructor");

	}
}

class client {
	
	public static void main(String []args) {
		
		Parent obj=new Child();
		

	}
}

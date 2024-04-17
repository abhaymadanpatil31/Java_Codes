
class Parent {
	
	Parent() {
		
		System.out.println(this);//Parent(Parent this) but 'this'belong to Child's 'this'Address of Child 
		System.out.println("In Parent Constructor");

	}

	void parentProperty() {
		
		System.out.println("Flat,car,Gold");
	}
}

class Child extends Parent {
	
	
	Child() {
		
		System.out.println(this);//Child(Child this)
		System.out.println("In Child Constructor");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Parent obj=new Child();//Parent(obj) obj get converted to this in every belonging constructor
		System.out.println(obj);
		obj.parentProperty();
		
	}
}


class Parent {
	
	Parent () {//Parent()
		
		System.out.println("In Parent constructor");
	}

	void Parent() {//Parent()
		
		System.out.println("In Parent Method");
	}

	void marry () {
		
		System.out.println("Pooja Hegde");
	}
}

class Child extends Parent {
	
	void Parent() {
		
		System.out.println("In Childs Parent Method");
	}

	void marry() {
		
		System.out.println("Kiara Advani");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Parent obj=new Child();
		obj.Parent();
		obj.marry();
	}
}

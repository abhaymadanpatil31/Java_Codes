
class Parent {
	
	Parent() {
		
		 System.out.println("In Constructor");
	}

	void property() {
		
		System.out.println("Home, car, Gold");
	}

	void marry() {
		
		System.out.println("Deepika Padukone");
	}

}

class Child extends Parent {
	
	Child() {
		
		System.out.println("In Child Constructor");
	}

	void marry() {
		
		System.out.println("Alia Bhatt");
	}
}

class client {
	
	public static void main(String [] args) {
		Child obj=new Child();//it calls child constructor because of wew created child object and reference of Parent so child object address is inside the object and thats why first child constructor will get call and after that inside the child constructor first line is super by default so it will call its parent constructor 
		obj.property();
		obj.marry();
	}
}

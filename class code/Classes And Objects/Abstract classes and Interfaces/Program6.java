
interface Demo {
	
	/*public void*/void fun();//due to method is inside the interface default access speicfier is public and return type is void but if try to implement the interface inside the class but inside the class by default access specifier is default and return type is not mentioned and thats why we must write the public in the method.
	/*public void*/void gun();
}

class DemoChild implements Demo {
	
	/*public*/ void fun() {
		
		System.out.println("In Fun");
	}

	/*public*/ void gun() {
		
		System.out.println("In Gun");
	}
}

class client {
	
	public static void main(String ...args) {
		
		Demo obj=new DemoChild();
		obj.fun();
		obj.gun();
	}
}

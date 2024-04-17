
interface Demo1 {
	
	default void fun() {
		
		System.out.println("In fun-Demo1");
	}
}

interface Demo2 {
	
	default void fun() {
		
		System.out.println("In fun-Demo2");
	}
}

class DemoChild implements Demo2,Demo1 {
/*in this space you can override the method but most important part is that if you dont override any above method then there is error and if you try to override the method then you have to create respective interface method reference (Refernce of parent and object of Child is allowed)*/	

}

class client {
	
	public static void main(String [] args) {
	
		Demo obj=new DemoChild();
		//obj.Demo; error-not a statement

		obj.fun();//illegal static referece method call and DemoChild inherits unrelated default for fun()  
	}

}


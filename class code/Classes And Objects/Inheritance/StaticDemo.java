
class Parent {
	
	static int x=10;
	static {
		
		System.out.println("In Parent static block");
		System.out.println("The value of x is:"+x);
	}

}

class Child extends Parent {

	static {
		
		System.out.println("In Child static block");
		System.out.println(x);
	}


}

class client {
	
	public static void main(String []args)throws Exception {
		
		
		Parent obj=new Child();
		System.out.println("In main");
		
	}
}

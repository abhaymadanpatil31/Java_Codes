
class StaticDemo {
	
	static int x=10;

	static void gun() {
		
		System.out.println("In Static gun");
		System.out.println("The value of x is:"+x);
	}
	static {
		
		System.out.println("In Parent static block");
	}
}

class Child extends StaticDemo {//in static concept extends keyword plays most important role of getting parent static context

	static {
		
		System.out.println("In Child static block");
	}

	static {
	
		System.out.println(x);
	}
	

}

class client {

	public static void main(String [] args) {
	
		Child obj=new Child();
	}
}

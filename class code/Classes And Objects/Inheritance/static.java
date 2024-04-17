
class staticDemo {
	
	static {
		System.out.println("In first static" );
		int x=10;
	}

}

class Demo extends staticDemo {
	
	static{
		
		System.out.println("in second static");
	}
}

class client {

	public static void main(String [] args) {
		
		System.out.println(staticDemo.x);

	}
}




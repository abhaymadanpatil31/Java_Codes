
class Demo {
	
	int x=10;
	static int y=20;
	static {
		
		System.out.println("static block 1");
	}
	
	public static void main(String [] args) {
		
		System.out.println("Main Method");
		
		Demo obj=new Demo();
	}
	static {
		
		System.out.println("static block2");
		System.out.println(y);
	}


}


class Demo {
	
	static {
		
		System.out.println("Hello World");
		System.exit(0);
	}
	public static void main(String [] args) {
		
		System.out.println("In Method");//this line will not print because we exit the code from the static by using exit();which is static method but code need main method if we not mention main method then it will show please declare main method as  
	}

}

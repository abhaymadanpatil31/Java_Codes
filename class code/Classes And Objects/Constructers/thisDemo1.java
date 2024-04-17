
class thisDemo {
	
	int x=10;
	thisDemo() {
		
		this(70);
	}
	
	thisDemo(int x) {
		
		this();
	}

	public static void main(String [] args) {
	
		thisDemo obj=new thisDemo(10);
	}
}


class thisDemo {

	int rollNo=12;
	int subjects=4;
	thisDemo() {
			
		this(22);
		System.out.println("In no args");
	}
	thisDemo(int age) {
		
		System.out.println("In para Constructor");
	}


}

class Client {
	
	public static void main(String [] args) {
		
		thisDemo obj=new thisDemo();
	}
}

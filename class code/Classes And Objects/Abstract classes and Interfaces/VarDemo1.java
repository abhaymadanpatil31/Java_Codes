
interface Demo {
	
	int x=10;//this variable will get initiated when its occurance is available.

	void fun() ;//it doesnt matter wheter you give space between signs
 	

}

class DemoChild implements Demo {
	
	int x=10;//this variable will get initiated inside constructor 
	public void fun() {
		
		System.out.println(x);
		System.out.println(Demo.x);
	}
}

class client {
	
	public static void main(String [] args) {
		
		Demo obj=new DemoChild();
		obj.fun();
	}
}


class ConstDemo {
	
	ConstDemo () {
		
		System.out.println("In Constructer");
	}
		void fun() {
			ConstDemo obj=new ConstDemo ();
			System.out.println(obj);
		}
	
	
	public static void main(String [] args) {
		
		ConstDemo obj1=new ConstDemo ();
		ConstDemo obj2=new ConstDemo ();
		System.out.println(obj1);
		System.out.println(obj2);
		obj1.fun();
	}
}

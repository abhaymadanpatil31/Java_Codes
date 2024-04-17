
class Demo {
	
	Demo () {
		
		System.out.println("First Constructor");
		System.out.println(this);
	}
	Demo() {
	
		System.out.println("Second Constructor");
		System.out.println(this);
	}

	public static void main(String [] args) {
		
		Demo obj1=new Demo();
		Demo obj2=new Demo();
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

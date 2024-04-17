
class Demo {//no suitable method found for fun(double) , Possible lossy conversion
	
	void fun(float y) {
		System.out.println("Float");
	}

	void fun(int y) {
		
		System.out.println("int ");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Demo obj=new Demo();
		obj.fun(10.3);
	}
}

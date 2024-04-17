
class Demo {
	
	void fun(Object obj) {
		
		System.out.println(obj);
	}

	void fun(float y) {
		
		System.out.println("Float");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Demo obj=new Demo();
		obj.fun(10.3);
	}
}


class Parent {
	
	void fun(short y) {
		
		System.out.println("int y"+y);
	}

	/*void fun(float x) {
	
		System.out.println("float x"+x);
	}*/
}	

class client {
	
	public static void main(String [] args) {
		
		Parent obj=new Parent();
		long z=10;
		obj.fun(z);
	}
}

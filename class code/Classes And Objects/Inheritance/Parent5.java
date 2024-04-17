
class Parent {
	
	void methodOne() {
		
		System.out.println(x);
		System.out.println(y);
	}

	static int x=10;
	static int y=20;

	public static void main(String [] args) {
	
		Parent obj=new Parent();
		obj.methodOne();
	}
}

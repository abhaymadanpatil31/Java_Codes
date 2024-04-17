
class Demo {
	
	int x=20;
	private int y=30;
	
	void fun()  {
		
		System.out.println(x);
		System.out.println(y);	

	}
}
class MainDemo {
	
	public static void main(String [] args) {
		
		Demo obj=new Demo();
		
		obj.fun();
	}
}
	


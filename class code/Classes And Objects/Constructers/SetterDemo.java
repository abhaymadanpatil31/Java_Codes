
class SetterDemo {
	
	private int  age=0;
	private String name = null;
	
	SetterDemo(int age,String name) {
		
		this.age=age;
		this.name=name;
		System.out.println("In constructor");
	}
	
	void GetterDemo () {
		
		System.out.println(age+" = "+name);
	}
}

class Client {
	
	public static void main(String [] args) {
		
		SetterDemo obj=new SetterDemo(21,"Abhay");
		obj.GetterDemo();
		SetterDemo obj1=new SetterDemo(21,"Om");
		obj1.GetterDemo();
	}
}

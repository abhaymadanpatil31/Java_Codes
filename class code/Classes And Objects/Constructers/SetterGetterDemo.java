

class SetterGetterDemo {

	private int jerNo=0;
	private String name=null;
	SetterGetterDemo(int jerNo,String name) {
		
		this.jerNo=jerNo;
		this.name=name;
		System.out.println("In constructor");
	}	
	
	void info() {
		
		System.out.println(jerNo+" = "+name);
		System.out.println("In instance method");


        }
}
class Client {
	
	public static void main(String [] args) {
		
	SetterGetterDemo obj=new SetterGetterDemo(18,"Virat");
	obj.info();
	SetterGetterDemo obj1=new SetterGetterDemo(7,"Ms Dhoni");
	obj1.info();

	}
}


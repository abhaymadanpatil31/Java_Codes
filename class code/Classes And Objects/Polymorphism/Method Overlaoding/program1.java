//***** this program is different because we passed long as argument and paramter as float but there is no error
class Parent {
	
	void fun (float y) {
		
		System.out.println("In Parent float");
	}

}

class client {
	
	public static void main(String [] args) {
		
		Parent obj=new Parent();
		long x=10;
		obj.fun(x);
	}
}

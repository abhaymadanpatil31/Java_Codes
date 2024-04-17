
class Parent {
	
	static int x=10;//this static variable get intiated inside the below mentioned static block(if you want to see then see its byte code)

	static {
		
		System.out.println("Inside the parent static block");
	}

	static void access () {//if you want to print the method then you must have to refer with either class name (if static ) and if non static then it with object ., without them refering we cant print it but that method get initiated but not printed.
		
		System.out.println("Inside the Parent static block method ");
	}

}

class Child extends Parent {//due to extend keyword first parent static block will be on stack becuase complier dont want to print such data which is not get initiated i.e which doesnt exit and any variable get space only when either static block or constructor (for non static variables) get pushed on java stack 
	
	static int y=20;
	static {//first static block will get pushed on stack because of static variables will be availble to print only when static block get pushed on java stack and satic block get initiated inside the static block 
		
		System.out.println("Inside the child static block ");
		System.out.println(y);
		System.out.println(x);
	}
}

class client  {
	
	public static void main(String [] args) {
		
		Child obj=new Child();	
		obj.access();
		Child.access();
	}
}


class Parent {
	
	int x=10;

	Parent() {
		
		System.out.println("In Parent construtor");
		System.out.println(x);//here x will be get initiated because instance var get initiated in Constructor.
	}

	void access() {
		
		System.out.println("In instance method");
		System.out.println(x);//every instance var cant get place untill that class constructor not get on java stack , so if any instance var you see then say it must inside constructor and untill unless that constructor didnt get pushed on java stack any variable not get space to store.
	}
}

class Child extends Parent {
	
	Child() {//now after getting call by creating object(Child () get call but first line inside constructo is invokspecail) now before the first line which is int y ,due to extend word that call get automatically into Parent constructor this is because of java developed in such way that whenever user write extend keyword according to inheritance parent class all property exclude if that property having private access specifier ,will be given to child class and that why for intialisation of variables of parent class call get automatically to parent class when you use extend keyword , first line inside the Child() constructor is invokespecial which calls its parent class   
		
		int y=20;
		System.out.println("Inside the Child Constructor");
		System.out.println(x);
		System.out.println(y);
	}

	void permission () {
		
		System.out.println("In Instance method of Child class");
	}
}

class client {
	
	public static void main(String [] args) {
		
		System.out.println("In main");
		Child obj=new Child();//through this line child constructor gete call implicitely
		obj.access();
		obj.permission();

	}
}

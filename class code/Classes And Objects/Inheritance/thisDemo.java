//this program shows that how the actual inheritance works so try to get it and i will try to write an appropriate blog for this concept and for future also.
class thisDemo {
	
	thisDemo() {
		
		System.out.println(this);
		System.out.println("In thisDemo constructor with reference of"+" = "+this);
	}
	void c2w () {
	
		System.out.println("In Instance method(c2w) with Reference of"+" = "+this);
	}
}

class myDemo extends thisDemo {

	myDemo() {
		
		System.out.println("In myDemo constructor with reference of "+" = "+this);
	}
	
	void box() {
		
		System.out.println("In Instance method name called as box"+" = "+this);
	}
}

class client {

	public static void main(String [] args) {
		
		myDemo obj1=new myDemo ();
		obj1.c2w();
		obj1.box();
		System.out.println("the address which i printing on display it should be all over because reference is used all classes which is from child class "+obj1);
	}
}

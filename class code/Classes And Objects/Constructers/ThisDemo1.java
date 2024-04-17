
class Demo {
	
	int x=10;
	Demo () {	//Demo(Demo this)
		
		System.out.println("In constructor");
		System.out.println(this);
		System.out.println(this.x);
	}
	void fun() {	//fun(Demo this)
		
       		System.out.println(this);
		System.out.println(x);		
	}
		
	public static void main(String [] args) {
		
		Demo obj1=new Demo ();//Demo(obj1(i.e Objects Address is passed to Demo concstucter where Demo is datatype and obj1 is its variable and when we passed as paramter then who is for catching this object there we can take any named variable but with same Data Type and this is complier given variable name we cant change it and we cant access it in main method because of we passed obj1 as variable but on the other side of method(constructor) instead of using obj1 as variable compiler gives us 'this'as variable name but its data type wont change  ))
		System.out.println(obj1);
		obj1.fun();//fun(obj1)
	}

}

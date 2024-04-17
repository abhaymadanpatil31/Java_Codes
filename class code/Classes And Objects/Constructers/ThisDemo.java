
class ThisDemo {
	
	int x=10;
	ThisDemo () {//ThisDemo(ThisDemo this) actual line 
		
		System.out.println("In constructor");
		
		System.out.println(this);
		
	        System.out.println(this.x);
		System.out.println("No args,but this also parametrised constructer but we cant see the hidden constructer thats why it is called as no argument constructer but it have paramter called as 'Classname this' ");
		
		
		
	}
	void fun() { //fun(ThisDemo this)
		
		
		System.out.println(this);
		System.out.println(x);
		
		
	}
	ThisDemo(int c) {//(ThisDemo this,int c)
		
		System.out.println("Paramterised");
	}
	ThisDemo(ThisDemo xyz) {//(ThisDemo this,ThisDemo xyz)
		
		System.out.println("Parametrised ");
	}	

	public static void main(String [] args) {
	
		ThisDemo obj1=new ThisDemo();
		ThisDemo obj2=new ThisDemo();
		ThisDemo obj3=new ThisDemo();
	}
}

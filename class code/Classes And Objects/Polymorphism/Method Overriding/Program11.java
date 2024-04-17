
class Parent {
	
	Object fun() {//hi line he sangte ki mazya method cha return type ha object class ahe ani object class ha sarva class cha parent aslymule apan kontahi class apan return karu shakto . 
		
		System.out.println("In Parent fun");
		return new Object();
	}
}

class Child extends Parent {
	
	Object fun() {
		
		System.out.println("in Child fun");
		return "Core2Web";
	}

	Object fun(String str) {
		//Object obj=new Object (); ,'=' chya pudhche ha apan return type veli deto ani '='alikadache object obj deto ani basically apn doni typne return karu shakto pan aplyala obj vaprun kontihi method call karaychi nahi tymule mostly varchya method sarakha object declaretion prefer karava. 
		System.out.println(str+"String");
		Object obj=new Object ();
		return obj;//this is also valid

	}
}

class client {
	
	public static void main(String [] args) {
		
		Child ch=new Child();
		ch.fun();
		ch.fun("Abhay");
	
	}
}

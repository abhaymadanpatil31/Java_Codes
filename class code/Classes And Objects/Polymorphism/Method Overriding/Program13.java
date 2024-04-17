
class Parent {
	
	static void fun() {
		
		System.out.println("In Parent fun");
	}
}

class Child extends Parent {
	
	static void fun() {
		
		System.out.println("In Child Fun");
	}
}

class client {

	public static void main(String [] args) {
		
		Parent obj=new Parent();
		obj.fun();

		Child obj1=new Child();
		obj1.fun();

		Parent obj2=new Child();
		obj2.fun();//parent cha refernce and child cha object ahe pan static ha compile time chya veles yeun jato tymule to compile time to run time cha wait karnar nahi kinva to run time baghnar pan nahi karan ki to already compiler madhe yeun gela ahe ani tymule je kahi compile time chya veles available ahe tech print hoil instance method sarakh ha program act nahi karnar to jo compiler compile karnar toch print karnar tymule to new object chi vat pahnar nahi.i.e (Jyacha refernce asnar tyachach output print honar na ki object cha )
	}
	/*Quetion -why Method Hidding is introduced ?
	  ans- Basically to do work related class 
	 quetion -What is difference between final and static modifire?
	ans- final will get but using only object but static can get called both object and class */
}


sealed class Parent permits Child,Grand {
	
	void fun() {
		
		System.out.println("In Parent");
	}
}

final class Child extends Parent {
	
	void fun1() {
		
		System.out.println("In CHild Class");

	}
	
}

final class Grand  extends Parent{
	
	void fun2() {
	System.out.println("In Grand class");
	}
}

final class Top extends Parent {
	
	void fun3() {
		
		System.out.println("In Top Class");
	}
}

class client {
	
	public static void  main(String [] args) {
		
		Grand obj=new Grand();
		obj.fun1();
		obj.fun();
	
	}
}

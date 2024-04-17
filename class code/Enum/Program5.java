
class Parent {

	void m1() {
	
		System.out.println("Parent m1");
	}

	@Deprecated//msg tevacha print hoto jeva deprecate keleli method use keli jate otherewise nahi.
	int m2(int x) {
	
		System.out.println("In Parent m2");
		return 10;
	}
}	

class Child extends Parent {

	//@Supresswarning("ABC")
	int m2() {
	
		System.out.println("In Child m2");
		return 20;
	}
}

class Client {

	public static void main(String[] args) {
	
		Parent p = new Child();
		p.m1();
		p.m2(10);
	}
}

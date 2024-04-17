
class Constructor {
	
	void access() {
	
		System.out.println("In access method of parent");
	}
	Constructor() {
		
		System.out.println("In Parent Constructor");
	}
}

class C2 extends Constructor {

	C2() {
		
		System.out.println("In Child construtor");
		access();
	}

}

class client {

	public static void main(String [] args) {
		
		C2 obj=new C2();
	
	}
}

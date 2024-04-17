
interface A {
	
	int x=10;
}

interface B {
	
	int x=10;
}

class Child implements A,B {
//ambuguity is here due to both variable are inherited and having same value
	
	void fun() {
		
		System.out.println(x);
	}
}

class client {
	
	public static void main(String [] args) {
		
		Child obj=new Child();
		obj.fun();
	}
}

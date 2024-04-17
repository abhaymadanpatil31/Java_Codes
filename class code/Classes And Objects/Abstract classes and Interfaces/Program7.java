
interface Demo {
	
	void fun();
	void gun();
}

abstract class DemoChild implements Demo {
	
	public void gun() {
		
		System.out.println("In Gun");
	}
}

class DemoChild1 extends DemoChild {//jo paryant apan concrete class lihat nahi ani sanglya interface chya methods complete karat nahi to paryant error yeto
	
	public void fun() {
		
		System.out.println("In fun");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Demo obj=new DemoChild1();
		obj.fun();
		obj.gun();
	}
}

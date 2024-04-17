
class Parent {

	void m1() {
	
		System.out.println("Parent-m1");
	}
}

class Child extends Parent {

	       @Override  /*/'method does not override or implement a method from a supertype.'/ hi ashi error yete jar apan override annotation vaparle tar ani nahi vaparle tar error yet nahi ti method vegli samjli jate.*/ 
	        void m1(int x) {
		
			System.out.println("Child- m1");
		}
}
@Deprecated
class Client {

	public static void main(String[] args) {
	
		Parent p = new Child();
		p.m1();
	}
}

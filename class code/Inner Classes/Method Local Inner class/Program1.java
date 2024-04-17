
class Outer {

	void demo() {
	
		class Demo {
		
			void gun() {
			System.out.println("In Demo-Inner class");
			}
		}
		
		Demo obj = new Demo();
		obj.gun();
	}

	void fun() {
	
		class Femo {
		
			void run() {
			
				System.out.println("In new Inner class called as Femo");
			}

		}
		Femo obj1 = new Femo();
		obj1.run();
	}
}

class Client {

	public static void main(String[] args) {
	
		Outer o = new Outer();
		o.demo();
		o.fun();
	}
}

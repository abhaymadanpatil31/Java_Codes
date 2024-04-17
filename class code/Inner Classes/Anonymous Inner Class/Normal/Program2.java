
class Demo {

	void fun() {
	
		System.out.println("In fun");
	}
}

class Client {

	public static void main(String[] args) {
	
		Demo obj = new Demo(){
		
			void marry() {
			
				System.out.println("Kiara Advani");
			}
		};
	}obj.marry();
}

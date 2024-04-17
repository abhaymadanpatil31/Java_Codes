
class Demo {

	Demo(String name,int age) {
	
		System.out.println(name);
		System.out.println(age);
	}	
}

class DemoChild {

	public static void main(String[] args) {
	
		Demo obj = new Demo(22,"Abhay");
	}
}


class Home {

	static Home obj = new Home();

	private Home() {
	
		System.out.println("In Private Constructor");
		 int x = 10;
		 int y = 20;
		
		System.out.println(x);
	}

	static Home getObject() {
	
	
		return obj;
		
	}
}

class Client {

	public static void main(String[] args) {
	
		Home obj1 = Home.getObject();
		System.out.println(obj1);
		Home obj2 = Home.getObject();
		System.out.println(obj2);
		Home obj3 = Home.getObject();
		System.out.println(obj3);

	}
}

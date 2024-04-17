

class Home {

	static Home obj = new Home(); 
	private Home() {
	
		System.out.println("No budy can Access me!");
	}

	static Home getObject () {
	
		return obj;
	}
}

class Demo {

	public static void main(String[] args) {
	
		Home h = Home.getObject();
		System.out.println("In Main");
	}
}

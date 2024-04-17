
abstract class Defence {

	void statement() {
	
		System.out.println("We are for protection of India");
	}

	abstract void Army();
	abstract void Navy();
	abstract void AirForce();
}

class Army {
	
	void Army() {
		
		System.out.println("we are Protecting borders");
	}

	void Navy() {
		
		System.out.println("We are protecting sea border side");
	}

	void AirForce() {
		
		System.out.println("We are protecting our India through the air");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Army obj=new Army();
		obj.Army();
		obj.Navy();
		obj.AirForce();
	}
}

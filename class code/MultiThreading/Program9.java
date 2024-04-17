
class Karmbhumi extends Thread {

	public void run() {
	
		System.out.println("I am only one person,after the obj.start() method call call comes to me and then i am become the karmbhumi of new thread");
	}
}

class Demo {

	public static void main(String[] args) {
	
		Karmbhumi obj = new Karmbhumi();
		obj.start();
	}
}

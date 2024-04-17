
class VillageException extends Exception {

	String str;
	VillageException(String str){
		
		super(this.str);
	}
}

class Client extends VillageException {

	void fun() {
		String name = "Sarapdoh";
	
		if(name == "Sarapdoh") {
		
			throw VillageException("Village Not Found!");
		}else {
		
			System.out.println("Village Found, Thank you for using us");
		}
	}
	public static void main(String[] args) {
		
		Client obj = new Client();
		obj.fun();
		System.out.println("Thank you ");

	}
}

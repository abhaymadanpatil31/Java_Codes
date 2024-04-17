
class Parent {
	
	void career() {
		
		System.out.println("Doctor");
	}

	abstract void marry() {
		
		System.out.println("Shardha Kapoor");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Parent obj=new Parent();//error because we cant create object of abstract class but constructor is there , the reason behind the we cant create the object of abstract or interface is , object cant be created of half method which is not implemented so what we do by creating object , i.e we do calling of methods but abstract method doesnt have body what complier can print in that method thats why we cant create object in half implemented class
	}
}


class MobileDemo { 
	
	int noOfApplication=12;
	static int  systemApplications=7;
	int userApplications=5;

	void Pressing() {
		
		System.out.println("Total Number of application="+noOfApplication);
		System.out.println("SystemApplications="+systemApplications);
		System.out.println("UserApplications ="+userApplications);
	}
}
class UserDemo {
	
	public static void main(String [] args) {
		
		MobileDemo app=new MobileDemo();
		app.Pressing();
	}
}

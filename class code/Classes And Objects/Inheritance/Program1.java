
class RBI {
	
	RBI() {
		
		System.out.println("It is RBI Rules and regulations");	
	}

	void Loan() {
	
		System.out.println("Every bank's threshold value of laon amount is 300000 rupees for Home loan");
	}
}

class SBI extends RBI {
	
	SBI() {
		
		System.out.println("It is SBI Rukes and regulations");
	}

	void Laon() {
		
		System.out.println("We have  250000 ruppes amount of loan for Homes ");
	}
}

class Person {

	Person(RBI r) {
	
		System.out.println("Ok I know the RBI rules and regualations thank for informing!");
		r.HomeLoan();
	}

	void HomeLoan() {
		
		System.out.println("RBI's Home loan thresheold value is 300000 Rupees");
	}
}

class Child extends Person {
	
	Child(SBI s) {
		
		System.out.println("Ok Thank for giving informations abount SBI Rules and Regulations");

		s.HomeLoan();
	}

	void HomeLoan() {
	
		System.out.println("SBI Home loan amount is 250000 ");
	}

	public static void main(String [] args) {
		
		Child obj=new Child(new RBI());
		Child obj1=new Child(new SBI());
	}
}




class Demonetisation {
	
	static int rupees=2000;

	static String RBI="New Currency is Introduced!";
	double noOfCurrencies=75000000;
	void Govt() {
		
		System.out.println(noOfCurrencies);
	}
	static void ChangeInCurrency() {
	
		System.out.println("We have Initiated new Currency of 2000"+RBI);
		System.out.println("The currency will be active from 10 november 2016!"+rupees);
		System.out.println("This Currency valid for whole India until RBI changes its norms about  That currencies");
	}
}

class CitizensOfIndia {

	public static void main(String [] args) {
	
		Demonetisation general =new Demonetisation();
		general.Govt();
		Demonetisation.ChangeInCurrency();
		general.noOfCurrencies=0;
		System.out.println("Demonetisation has been Intiated from Today!");	

	}
}

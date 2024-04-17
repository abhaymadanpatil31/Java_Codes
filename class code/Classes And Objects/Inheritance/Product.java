
class Product {
	
	Product() {
		
		String pname="iphone";
		String pname1="MacBook";
		String pname2="ipod";
		
		System.out.println("This Are our Services :"+" "+pname+"\n"+" "+pname1+"\n"+" "+pname2+"\n");
		
	}

	static void RulesAndRegulations() {
		
		System.out.println("All the  CopyRights are reserved and if someone try to make copy of our Products then we will take propper actions against that person.Thank you");
	}
}

class iphone extends Product {
	
	String pname="we are providing iphone related services we are availble to sell and other repaire services";
	
	int iphone11=41000;
	int iphone11atDiscount=38000;
	int iphone12=55000;
	int iphone12atDiscount=50000;
	
	iphone() {
		
		System.out.println("iphone prices are :"+" "+"iphone11:"+iphone11+" "+"If you buy two iphone at single time then you will get flat 30% off"+iphone11atDiscount+" "+"iphone 12 :"+iphone12+" "+"If you buy On EMI then you will get 25% off "+" "+iphone12atDiscount);
	}

}

class client {

	public static void main(String [] args) {
		
		iphone obj=new iphone();
		
	}
}


class Electricity {
	
	Electricity() {
		
		int noOfLoads=3;
		System.out.println(" loading Capability of Main Electricity Source  "+" = "+ noOfLoads);
	}
}

class inductance extends Electricity {
	inductance() {
	int noOfLoads=2;
	System.out.println("loading Capability of Inductance"+" = "+noOfLoads);

	
	}
}

class client {
	
	public static void main(String [] args) {
		
		inductance obj1=new inductance();
	}
}

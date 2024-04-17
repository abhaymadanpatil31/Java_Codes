
class Defence {
	
	void Documents () {
		
		System.out.println("Adhar card, Pan Card, Rashan card this are Most Important Documents Candidate must Hold ");
	}
	Defence() {
		
		int noOfSectors=3;
		System.out.println("No Of Defence Sectors"+" = "+noOfSectors);
	}
}

class BSF extends Defence {
	
	void capabilities () {
		
		System.out.println("Candidate must have Documents specified by Defence  ");
	}
	BSF() {
		
		System.out.println("Yor are Eligible for this Resposibilty");
	}
}

class client {
	
	public static void main(String [] args) {
		
		BSF obj=new BSF();
		obj.Documents();
		obj.capabilities();
	}
}


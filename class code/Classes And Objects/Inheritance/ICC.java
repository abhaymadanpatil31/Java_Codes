
class ICC {
	
	ICC() {
		
		System.out.println("In ICC Constructor");
	}

}

class BCCI extends ICC {
	
	BCCI() {
		
		System.out.println("In BCCI Constructor");
	}
}

class client {
	
	public static void main(String [] args) {
		
		BCCI obj1=new BCCI();
		
	}
}


abstract class House {
	
	void HouseArea() {
		
		System.out.println("Area of house is 1350 sqft");
	}

	abstract void HousePaint();
}

class Paint extends House {
	
	void HousePaint() {
		
		System.out.println("Orane");
	}
}

class client {
	
	public static void main(String [] args) {
		
		//Paint house=new Paint(); this is also acceptable 
		House house=new Paint();
		house.HouseArea();
		house.HousePaint();
	}
}

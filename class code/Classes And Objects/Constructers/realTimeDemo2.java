
class BottleDemo {
	
	String myBottle="Abhay's Bottle";
	String jar="Room's Jar";

	void waterDemo (){
		
		System.out.println("Its my Bottle:"+myBottle);
		System.out.println("Its Roomes jar not my own:"+jar);
	}
}
class Water {
	
	public static void main(String [] args) {
		
		BottleDemo bt=new BottleDemo ();
		bt.waterDemo();

	}
} 


class HostelDemo {
	
	String HosAddress="Room adress zeal Chowk";
	static String HouseAddress="Karmala";

	void House() {
		
		System.out.println("Rooms Address="+HosAddress);
		System.out.println("Homes Address="+HouseAddress);
	}
}
class HouseAddress {
	
	public static void main(String [] args) {
		
		HostelDemo hos=new HostelDemo();
		hos.House();
		hos.HosAddress="Now Room address has been changed to Vetal chowk";
		hos.House();
	}

}

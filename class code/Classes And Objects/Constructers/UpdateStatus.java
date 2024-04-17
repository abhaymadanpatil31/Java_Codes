class MobileDemo{
		
	int noOffeature=2;
	String featureName1="Camera";
	String featureName2="New UI";
	 	
	void updateYourMobile() {
		
		String CameraVersion="12.0.06.21";
		float UIVersion=4.1f;
		System.out.println(noOffeature);
		System.out.println(featureName1);
		System.out.println(featureName2);
		System.out.println(CameraVersion);
		System.out.println(UIVersion);

		
	}
}
 class UpdateStatus {
	
	public static void main(String [] args) {
		
		System.out.println("Check Your UpdateStatus");
		MobileDemo obj=new MobileDemo();
		obj.updateYourMobile();
	}
}	


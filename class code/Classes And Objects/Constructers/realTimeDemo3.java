
class UniformCodeDemo {
	
	static String collUniform="College Uniform";
	String myDress="Todays Dress Colour Should be White! ";

	void DressDemo () {
		
		System.out.println("Its college Uniform="+collUniform);
		System.out.println("Its my Dresses="+myDress);
	}
}
class regularDress {
	
	public static void main(String [] args) {
		
		UniformCodeDemo un1=new UniformCodeDemo();
		un1.DressDemo();
		un1.myDress="Today dress colour should be Green!";
		un1.DressDemo();
	}
}

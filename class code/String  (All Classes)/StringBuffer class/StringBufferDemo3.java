
class StringBufferDemo {
	public static void main(String [] args) {
		StringBuffer sb= new StringBuffer("Shashi");
		StringBuffer sb1=new StringBuffer("Shashi");
		String sb2="Abhay";
		String sb3="Abhay";
		if(sb2==sb3) {
			System.out.println("In if ");
		}
		else if(sb==sb1)  {
			System.out.println("In else");
		
		}
	}
}

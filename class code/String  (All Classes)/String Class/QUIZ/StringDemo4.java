
class StringDemo {
	
	public static void main(String [] args) {
		
		String s1=new String("Core2Web");
		String s2=new String("Core2Web");
		if(System.identityHashCode(s1).equals(System.identityHashCode(s2))) 
			System.out.println("True");
		else 
			System.out.println("False");
	}
}

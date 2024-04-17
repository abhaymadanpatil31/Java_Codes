
class IdentityHashCodeDemo {
	public static void main(String [] args ) {
	
		String str1="Shashi";
		String str2=new String("Shashi");
		if(str1==str2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");/*this program reveals that if we compared two strings by using == operator then it will check its IHS and not the character Sequence and we have find it out how it is*/ 
		}
	}
}

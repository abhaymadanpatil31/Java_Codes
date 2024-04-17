
class StringDemo {
	public static void main(String [] args ) {
		String str1="Core2Web";
		String str2=new String ("Core2Web");
		String str3="Core2Web";
		String str4=new String("Core2Web");
		System.out.println(System.identityHashCode(str1));
		
		/*this is the actual concept that when we create String by using new then its new object will be created and and on the other hand if we direct crete string then it will have same unique code this is becuase of concept of String constat pool*/
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}

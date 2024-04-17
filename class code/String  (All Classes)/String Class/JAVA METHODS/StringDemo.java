
class StringDemo {
	public static void main(String [] args) {
		String str1="Core2";
		String str2="Web";
		String str3= str1.concat(str2);
		System.out.println(str3);
		String str4=str1+str2;/*the diffrence between this line and actual concat()method is this line actually calls to append method which is  not concat method and append ()method is class StringBuffer's method and not belong to String class but it(append method) returns new String so if you try to get its identityHashCode it will be different */
		System.out.println(str4);

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

	
		//System.out.println(str1.concat(str2));
	}
}

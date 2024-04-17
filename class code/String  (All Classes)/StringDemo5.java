
class StringDemo {

	public static void main(String [] args) {
		int x=65;
		char ch='A';
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(ch));/*here it gives differnt ihs even character goes internally as integer this because of when we write ihs to primitve data type then jvm gives some features of objects to primitve but if we try to get ihs of same values char and int then it will give us runtime ihs of char and this is due ti valueOf() method because valueOf() is ised to genrete new objects for primitive data types and if you want to overcome from this you have to use Integer and not int Integer is class so we are not using primitive dats type now */
	}
}

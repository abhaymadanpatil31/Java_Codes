/*It compares the str1 and str2 (case-sensitive) if both the strings are equal it returns 0 otherwise returns the comparison differensce
 * paramter=String
 * return type=int
 * if both String are equal =0; and if not =Difference */
class compareToDemo {
	public static void main(String [] args) {
		String str1="Ashish";
		String str2="ashish";
		System.out.println(str1.compareTo(str2));
		int x='S';
		int y='S'-32;
		System.out.println(x);
		System.out.println(y);
	}
}

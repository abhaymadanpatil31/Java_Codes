/*it returns the character located at specified index within the given String 
 * paramter=int(index)
 * return type=character*/
class charAtDemo {
	public static void main(String [] args) {
		String str1="Core2web";
		System.out.println(str1.charAt(0));//this method gives character of mentioned index no
		System.out.println(str1.charAt(4));//and you know index start from 0 so if try to
		System.out.println(str1.charAt(7));//beyond index ,it will throw exception.
	}
}

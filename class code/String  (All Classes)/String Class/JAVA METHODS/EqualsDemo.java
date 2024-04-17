/*predict which compares anObject to this, this is only for String with same character sequnce 
 * returns true if anObject is sequntially equal to this
 * paramter=Object(anObject)
 * return type=boolean*/
class EqualsDemo {
	public static void main(String [] args) {
		String str1="shashi";//it is case sensitive true for only same character sequence
		String str2= new String("SHASHI");
		System.out.println(str1.equals(str2));//true
	}
}

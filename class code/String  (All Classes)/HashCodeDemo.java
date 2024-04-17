
class HashCodeDemo {
	public static void main(String [] args) {
		String str1="Shashi";
		String str2=new String("Shashi");
		String str3="Shashi";
		String str4=new String("Shashi");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		String str5="Abhay";
		String str6=new String("Abhay");
		String str7="Abhay";
		System.out.println(str5.hashCode());
		System.out.println(str6.hashCode());
		System.out.println(str7.hashCode());

      }
}


class ReplaceDemo {
	
	public static void main(String [] args) {
		
		String str1="Abhay";
		System.out.println(str1.replace('A','a'));
		System.out.println(str1.replace('b','B'));

		System.out.println(str1.replace('h','H'));
		System.out.println(str1.replace('a','A'));
		System.out.println(str1.replace('y','Y'));
		System.out.println(str1.replace('i','u'));//this line will print Abhay (Original) will not give error.
	}
}

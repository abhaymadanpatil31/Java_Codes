
class TocharArrayDemo {
	static int myStrLen(String str) {
		char arr[]=str.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count ++;
		}
		return count;
	}
	public static void main(String [] args) {
	
		String str1="ShashiBagal";
		System.out.println(str1.length());//this is by String class
		int len=myStrLen(str1);/*calling to method which is written by me and passing arguments from main , the best expalntion is , i written a programm in main and given String in main and passsed as paramter to my method , after that passing String as argument toCharArray is the method of String class which breaks String into array and if have best handon on array then you can treate every String as array and perform many operations */
		System.out.println(len);
	}
}

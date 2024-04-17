
class StringSplitDemo {
	
	public static void main(String [] args) {
		String str="Know the code till the core";
		String [] strResult=str.split(" ");
		for(int i=0;i<strResult.length;i++) {
			System.out.println(strResult[i]);/*in this method Every String get splited till there is space i.e in above eg know the in between know and the have space then it will print on new line */
		}
	}
}

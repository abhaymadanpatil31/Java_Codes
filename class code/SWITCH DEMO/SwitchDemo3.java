
class SwitchDemo3 {
	public static void main(String [] abhay) {
		int ch=65;
		switch(ch) {
			case 'A':
				System.out.println("char-A");
				break;
			case 65:
				System.out.println("num-65");
				break;
			case 'B':
				System.out.println("char-B");
				break;
			case 66:
				System.out.println("num 66");
			default:
				System.out.println("Invalid");
				break;	
		}
	}
}
/* in above mentioned example 'A' goes as number in Storage because we cant directly conert char  to binary it goes 
 * through the integer . thats why whatever you take 'A' or its ASCII value it shows same result .*/

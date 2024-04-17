//WE CANT USE DUPLICATE SWITCH STATEMENT.
//EVEN IF CASE IS IDENTIFIED THEN ALSO CODE GOES TO SWITCH STATEMENT.
class SwitchDemo {

	public static void main(String[] args) {
	
		int flag = 10;
		switch(flag){
		 
			case 1:
				System.out.println("One");
			case 2:
				System.out.println("Two");
			case 0:
				System.out.println("Ten");
			case 10:
				System.out.println("Ten");
			default:
				System.out.println("Default");
		}
		System.out.println("After Switch");
	}
}

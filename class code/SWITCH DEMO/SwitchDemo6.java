
class SwitchDemo {
	public static void main(String [] args) {
		int x=65;
		switch(x) {
			case 1:
				System.out.println("one");
				break;
			default :
				System.out.println("In Default");
				break;
			case 2:
				System.out.println("In two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 65:
				System.out.println("sixtyfive");
				break; 	
		}
	}
}
/*in this example Default and other conditions considerd as statement till true condition occur and if not find true then it will go to default , so we can define anywhere default statement if there  is true statement*/
